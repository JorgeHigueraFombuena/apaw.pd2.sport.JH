package es.upm.miw.apiArchitectureTheme.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.entities.User;
import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserWrapper;

public class UserController {

	public void createUser(UserWrapper user) {
		DaoFactory.getFactory().getUserDao().create(new User(user.getNick(), user.getEmail()));
	}

	public void putSportToUser(UserWrapper userWrapper, SportWrapper sportWrapper) {
		
	}

	public UserListWrapper userList() {
		List<User> users = DaoFactory.getFactory().getUserDao().findAll();
		UserListWrapper userListWrapper = new UserListWrapper();
		for(User user : users){
			userListWrapper.add(new UserWrapper(user.getNick(), user.getEmail()));
		}
		return userListWrapper;
	}

}
