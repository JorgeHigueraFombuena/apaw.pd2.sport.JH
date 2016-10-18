package es.upm.miw.apiArchitectureTheme.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	
	private String nick;
	
	private String email;
	
	private List<Sport> sports;
	
	public User(String nick, String email){
		this.nick = nick;
		this.email = email;
		this.sports = new ArrayList<Sport>();
	}

	public void add(Sport sport){
		sports.add(sport);
	}
	
	public Sport getSport(Sport sport){
		Sport result = null;
		boolean found = false;
		int i = 0;
		while(!found && i < sports.size()){
			if(sports.get(i).equals(sport)){
				found = true;
				result = sports.get(i);
			}	
			i++;
		}
		return result;
	}
	
	public boolean hasSport(Sport sport){
		return sports.contains(sport);
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [nick=" + nick + ", email=" + email + "]";
	}
}
