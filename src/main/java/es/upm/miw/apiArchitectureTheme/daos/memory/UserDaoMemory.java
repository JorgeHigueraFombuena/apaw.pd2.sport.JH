package es.upm.miw.apiArchitectureTheme.daos.memory;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.UserDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;
import es.upm.miw.apiArchitectureTheme.entities.User;

public class UserDaoMemory extends GenericMemoryDao<User> implements UserDao {

	@Override
	public void create(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUserBySport(Sport sport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Integer getId(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(User entity, Integer id) {
		// TODO Auto-generated method stub
		
	}

}
