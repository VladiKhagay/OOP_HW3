/**
 * @author Vladi Khagay ID: 319654497
 */

package exception;

public class IDException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IDException() {
		this("ID can not contain '@' char!");
	}

	public IDException(String message) {
		super(message);
	}

}
