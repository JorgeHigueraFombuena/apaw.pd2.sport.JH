package es.upm.miw.apiArchitectureTheme.exceptions;

public class InvalidSportException extends Exception {
	
	private static final long serialVersionUID = 5580286377402433975L;

	public static final String DESCRIPTION = "Petición no implementada";

	public InvalidSportException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidSportException() {
		this("");
	}
}
