package es.upm.miw.apiArchitectureTheme.api;

import es.upm.miw.apiArchitectureTheme.controllers.UserController;
import es.upm.miw.apiArchitectureTheme.exceptions.InvalidSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.NickAlreadyExistsException;
import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserWrapper;

public class UserResource {

	public UserListWrapper userList() {
		return new UserController().userList();
	}

	public void createUser(String nick, String email) throws NickAlreadyExistsException {
		UserWrapper user = new UserWrapper(nick,email);
		if (userList().contains(user)){
			throw new NickAlreadyExistsException(nick, email);
		}
		new UserController().createUser(user);
	}

	public void putSportToUser(String nick, String sport) throws InvalidSportException {
		if(!new SportResource().sportList().contains(new SportWrapper(sport))){
			throw new InvalidSportException(sport);
		}
		new UserController().putSportToUser(new UserWrapper(nick,null),
				new SportWrapper(sport));
	}

}
