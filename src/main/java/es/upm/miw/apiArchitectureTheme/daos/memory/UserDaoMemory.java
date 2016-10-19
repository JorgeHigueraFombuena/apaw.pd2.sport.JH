package es.upm.miw.apiArchitectureTheme.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.UserDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;
import es.upm.miw.apiArchitectureTheme.entities.User;

public class UserDaoMemory extends GenericMemoryDao<User> implements UserDao {

	public UserDaoMemory(){
		super.setMap(new HashMap<Integer,User>());
	}
	
	@Override
	public void create(User entity) {
		super.create(entity);
	}

	@Override
	public User read(Integer id) {
		return super.read(id);
	}

	@Override
	public void update(User entity) {
		super.update(entity);
	}

	@Override
	public void deleteById(Integer id) {
		super.deleteById(id);
	}

	@Override
	public List<User> findAll() {
		return super.findAll();
	}

	@Override
	public List<User> findUserBySport(Sport sport) {
		List<User> users = findAll();
		List<User> result = new ArrayList<User>();
		for(User user : users){
			if(user.hasSport(sport)){
				result.add(user);
			}
		}
		return result;
	}

	@Override
	protected Integer getId(User entity) {
		return entity.getId();
	}

	@Override
	protected void setId(User entity, Integer id) {
		entity.setId(id);
	}

	@Override
	public User findUserByNick(String nick) {
		User user = null;
		List<User> users = findAll();
		int i = 0;
		boolean found = false;
		while(!found && i < users.size()){
			if(users.get(i).getNick().equals(nick)){
				found = true;
				user = users.get(i);
			}
			i++;
		}
		return user;
	}

}
