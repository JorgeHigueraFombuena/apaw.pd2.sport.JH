package es.upm.miw.apiArchitectureTheme.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.entities.Sport;
import es.upm.miw.apiArchitectureTheme.entities.User;
import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserWrapper;

public class UserController {

	public void createUser(UserWrapper user) {
		DaoFactory.getFactory().getUserDao().create(new User(user.getNick(), user.getEmail()));
	}

	public void putSportToUser(UserWrapper userWrapper, SportWrapper sportWrapper) {
		User user = DaoFactory.getFactory().getUserDao().findUserByNick(userWrapper.getNick());
		user.add(new Sport(sportWrapper.getName()));
		DaoFactory.getFactory().getUserDao().update(user);
	}

	public UserListWrapper userList() {
		List<User> users = DaoFactory.getFactory().getUserDao().findAll();
		UserListWrapper userListWrapper = new UserListWrapper();
		for(User user : users){
			userListWrapper.add(new UserWrapper(user.getNick(), user.getEmail()));
		}
		return userListWrapper;
	}
	
	public UserListWrapper getUsersPracticeSport(SportWrapper sport) {
		List<User> usersPractiseSport = DaoFactory.getFactory().getUserDao().findUserBySport(new Sport(sport.getName()));
		UserListWrapper userListWrapper = new UserListWrapper();
		for(User user : usersPractiseSport){
			userListWrapper.add(new UserWrapper(user.getNick(), user.getEmail()));
		}
		return userListWrapper;
	}


}
