/**
 * @author Vladi Khagay ID: 319654497
 */

package exception;

public class EMailException extends Exception {

	private static final long serialVersionUID = 1L;

	public EMailException() {
		this("Not valid Email!");
	}

	public EMailException(String message) {
		super(message);
	}

}
