package es.upm.miw.apiArchitectureTheme.api;

import es.upm.miw.apiArchitectureTheme.exceptions.InvalidSportException;
import es.upm.miw.apiArchitectureTheme.exceptions.NickAlreadyExistsException;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;

public class UserResource {

	public UserListWrapper userList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(String nick, String email) throws NickAlreadyExistsException {
		// TODO Auto-generated method stub
		
	}

	public void addSport(String nick, String sport) throws InvalidSportException {
		// TODO Auto-generated method stub
		
	}

}
