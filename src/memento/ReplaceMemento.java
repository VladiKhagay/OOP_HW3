/**
 * @author Vladi Khagay ID: 319654497
 */

package memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReplaceMemento implements Comparable<ReplaceMemento>, Memento {
	/**
	 * enter code here
	 */
	private LocalDateTime created;
	private String text;
	private String newText;
	private int fileNextIndex;
	private int textAreaNextIndex;

	public ReplaceMemento(String text, String newText, int fileNextIndex, int textAreaNextIndex) {
		/**
		 * enter code here
		 */
		this.created = LocalDateTime.now();
		this.text = text;
		this.newText = newText;
		this.fileNextIndex = fileNextIndex;
		this.textAreaNextIndex = textAreaNextIndex;
	}

	/**
	 * enter code here
	 */

	public String getText() {
		return text;
	}

	public String getNewText() {
		return newText;
	}

	public int getFileNextIndex() {
		return fileNextIndex;
	}

	public int getTextAreaNextIndex() {
		return textAreaNextIndex;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		return "Memento [created=" + created.format(formatter) + "]";
	}

	@Override
	public int compareTo(ReplaceMemento mem) {
		return created.compareTo(mem.getCreated());
	}

	@Override
	public ReplaceMemento restoreMemento() {

		return null;
	}

}
