/**
 * This exception should be thrown whenever a backend 
 * service is overloaded
 */
package de.metalcon.exceptions;

/**
 * @author Jonas Kunze (kunze.jonas@gmail.com)
 * 
 */
public class ServiceOverloadedException extends MetalconException {
	private static final long serialVersionUID = 3529871078084500401L;

	public ServiceOverloadedException(String message) {
		super(message);
	}
}
