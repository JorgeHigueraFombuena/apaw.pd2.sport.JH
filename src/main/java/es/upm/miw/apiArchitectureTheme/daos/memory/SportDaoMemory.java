package es.upm.miw.apiArchitectureTheme.daos.memory;

import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	public SportDaoMemory(){
		super.setMap(new HashMap<Integer,Sport>());
	}
	
	@Override
	public void create(Sport entity) {
		super.create(entity);
	}

	@Override
	public Sport read(Integer id) {
		return super.read(id);
	}

	@Override
	public void update(Sport entity) {
		super.update(entity);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public List<Sport> findAll() {
		return super.findAll();
	}


	@Override
	protected Integer getId(Sport entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Sport entity, Integer id) {
		entity.setId(id);
	}

}
