/**
 * @author Vladi Khagay ID: 319654497
 */

package exception;

public class LoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public LoginException() {
		this("Wrong email or password entered!");
	}

	public LoginException(String message) {
		super(message);
	}

}
