package de.metalcon.exceptions;

public class MetalconRuntimeException extends RuntimeException {
	private static final long serialVersionUID = -4941088366376483626L;

	public MetalconRuntimeException(String message) {
		super(message);
	}
}