package bestpracticesinexceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			processFile("example.txt");
		} catch (FileProcessingException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	public static void processFile(String fileName) throws FileProcessingException {
		try {
			@SuppressWarnings("unused")
			FileReader reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			throw new FileProcessingException("Failed to process file: " + fileName, e);
		}
	}

}

@SuppressWarnings("serial")
class FileProcessingException extends Exception {
	public FileProcessingException(String message, Throwable cause) {
		super(message, cause);
	}
}
