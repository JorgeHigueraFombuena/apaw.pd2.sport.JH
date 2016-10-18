package es.upm.miw.apiArchitectureTheme.entities;

public class UserSport {

	private User user;
	
	private Sport sport;

	public UserSport(User user, Sport sport) {
		super();
		this.user = user;
		this.sport = sport;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}
	
}
