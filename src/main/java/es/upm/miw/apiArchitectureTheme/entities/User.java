package es.upm.miw.apiArchitectureTheme.entities;

public class User {

	private int id;
	
	private String nick;
	
	private String email;
	
	public User(String nick, String email){
		this.nick = nick;
		this.email = email;
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
