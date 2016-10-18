package es.upm.miw.apiArchitectureTheme.api;

import es.upm.miw.apiArchitectureTheme.controllers.SportController;
import es.upm.miw.apiArchitectureTheme.exceptions.SportAlreadyExistsException;
import es.upm.miw.apiArchitectureTheme.wrappers.SportListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;

public class SportResource {

	public UserListWrapper getUsersPracticeSport(String sport) throws SportAlreadyExistsException {
		this.validSport(sport);
		return new SportController().getUsersPracticeSport(new SportWrapper(sport));
	}

	public void createSport(String sport) throws SportAlreadyExistsException {
		this.validSport(sport);
		new SportController().createSport(new SportWrapper(sport));
	}
	
	private void validSport(String sport) throws SportAlreadyExistsException{
		if(sportList().contains(new SportWrapper(sport))){
			throw new SportAlreadyExistsException(sport);
		}
	}

	public SportListWrapper sportList() {
		return new SportController().sportList();
	}

}
