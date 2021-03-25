/**
 * @author Vladi Khagay ID: 319654497
 */

package exception;

public class PasswordException extends Exception {

	private static final long serialVersionUID = 1L;

	public PasswordException() {
		this("Not valid password!");
	}

	public PasswordException(String message) {
		super(message);
	}

}
