/**
 * @author Vladi Khagay ID: 319654497
 */

package thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TextCounter implements Runnable {
	private File file;
	private String search;
	private TotalCounter totalCounter;

	public TextCounter(File file, String search, TotalCounter totalCounter) {
		this.file = file;
		this.search = search;
		this.totalCounter = totalCounter;
	}

	@Override
	public void run() {
		int readPointer = 0;
		try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
			byte[] temp = new byte[search.length()];
			int counter = 0;
			while (raf.read(temp) != -1) {
				if (search.equals(new String(temp))) {
					readPointer += search.length();
					counter++;
				} else {
					readPointer++;
				}
				raf.seek(readPointer);
			}
			totalCounter.add(counter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
