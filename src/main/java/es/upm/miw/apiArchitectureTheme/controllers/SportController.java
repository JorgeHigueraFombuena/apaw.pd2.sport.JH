package es.upm.miw.apiArchitectureTheme.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.entities.Sport;
import es.upm.miw.apiArchitectureTheme.wrappers.SportListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;

public class SportController {

	public void createSport(SportWrapper sportWrapper) {
		DaoFactory.getFactory().getSportDao().create(new Sport(sportWrapper.getName()));
	}

	public SportListWrapper sportList() {
		List<Sport> sports = DaoFactory.getFactory().getSportDao().findAll();
		SportListWrapper sportListWrapper = new SportListWrapper();
		for(Sport sport : sports){
			sportListWrapper.add(new SportWrapper(sport.getName()));
		}
		return sportListWrapper;
	}

}
