package es.upm.miw.apiArchitectureTheme.exceptions;

public class SportAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -265567534845122666L;

	public static final String DESCRIPTION = "Deporte existente";

	public SportAlreadyExistsException(String detail){
		super(DESCRIPTION + ". " + detail);
	}

	public SportAlreadyExistsException() {
		this("");
	}
}
