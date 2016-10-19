package es.upm.miw.apiArchitectureTheme.exceptions;

public class SportNotExistsException extends Exception {

	private static final long serialVersionUID = -4401310415554498476L;

	public static final String DESCRIPTION = "Deporte no existente";

	public SportNotExistsException(String detail){
		super(DESCRIPTION + ". " + detail);
	}

	public SportNotExistsException() {
		this("");
	}
}
