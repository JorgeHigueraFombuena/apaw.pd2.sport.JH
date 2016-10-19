package es.upm.miw.apiArchitectureTheme.wrappers;

import java.util.ArrayList;
import java.util.List;

public class UserListWrapper {

	private List<UserWrapper> userList = new ArrayList<>();
	
	public UserListWrapper(){
	}

	public List<UserWrapper> getUserList() {
		return userList;
	}

	public void add(UserWrapper user){
		userList.add(user);
	}
	
	public boolean contains(UserWrapper user){
		return userList.contains(user);
	}
	
	@Override
	public String toString(){
		String result = "{\"userList\":[";
		for(UserWrapper userWrapper : userList){
			result += userWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]";
	}
	
	public String getNicksFormated(){
		String result = "{\"userList\":[";
		for(UserWrapper userWrapper : userList){
			result += "{\"nick\":\"" + userWrapper.getNick() + "\"},";
		}
		return result.substring(0, result.length() - 1) + "]";
	}
}
