/**
 * @author Vladi Khagay ID: 319654497
 */

package memento;

import java.util.LinkedList;
import java.util.List;

public class CareTaker {
	List<ReplaceMemento> stack = new LinkedList<ReplaceMemento>();

	public void saveMemento(ReplaceMemento memento) {
		stack.add(0, memento);
	}

	public ReplaceMemento restoreMemento() {
		if (stack.size() > 0) {
			return stack.remove(0);
		}

		return null;
	}

}