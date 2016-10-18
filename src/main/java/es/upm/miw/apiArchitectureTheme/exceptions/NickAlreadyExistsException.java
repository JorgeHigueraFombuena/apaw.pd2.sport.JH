package es.upm.miw.apiArchitectureTheme.exceptions;

public class NickAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -4262733641602918212L;

	public static final String DESCRIPTION = "Usuario existente";

	public NickAlreadyExistsException(String nick, String email) {
		super(DESCRIPTION + ". Nick: " + nick + " email: " + email);
	}
	
	public NickAlreadyExistsException(String detail){
		super(DESCRIPTION + ". " + detail);
	}

	public NickAlreadyExistsException() {
		this("");
	}
}
