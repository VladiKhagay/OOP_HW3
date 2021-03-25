/**
 * @author Vladi Khagay ID: 319654497
 */

package comparator;

import java.util.Comparator;

import application.User;

public class SortByName implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		return user1.compareTo(user2);
	}

}
