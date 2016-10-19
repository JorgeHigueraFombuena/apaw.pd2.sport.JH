package es.upm.miw.apiArchitectureTheme;

import es.upm.miw.apiArchitectureTheme.api.SportResource;
import es.upm.miw.apiArchitectureTheme.api.UserResource;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidRequestException;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.NickAlreadyExistsException;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Dispatcher {

	private UserResource userResource = new UserResource();
	private SportResource sportResource = new SportResource();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		// **/users
		if ("users".equals(request.getPath())) {
			response.setBody(userResource.userList().toString());
			// **/ users/search?sport=*
		} 
		else if ("users".equals(request.paths()[0]) && request.paths()[1].contains("search")) {
			try {
				response.setBody(userResource.getUsersPracticeSport(
						request.paths()[1].split("=")[1]).getNicksFormated());
			} catch (Exception e) {
				responseError(response, e);
			}
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		// POST **/users body="nick:email"
		case "users":
			try {
				String nick = request.getBody().split(":")[0];
				String email = request.getBody().split(":")[1];
				userResource.createUser(nick, email);
				response.setStatus(HttpStatus.CREATED);
			} catch (NickAlreadyExistsException e) {
				this.responseError(response, e);
			}
			break;
			// POST sports body="name"
		case "sports":
			try {
				sportResource.createSport(request.getBody());
				response.setStatus(HttpStatus.CREATED);
			} catch (Exception e) {
				responseError(response, e);
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		if ("users".equals(request.paths()[0]) && "sport".equals(request.paths()[2])) {
			try {
				String nick = request.paths()[1];
				String sport = request.getBody();
				userResource.putSportToUser(nick, sport);
			} catch (InvalidSportException e){
				responseError(response, e);
			}
		}
		else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

}
