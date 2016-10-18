package es.upm.miw.apiArchitectureTheme.daos.memory;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	@Override
	public void create(Sport entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sport read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Sport entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Sport> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected Integer getId(Sport entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(Sport entity, Integer id) {
		// TODO Auto-generated method stub
		
	}

}
