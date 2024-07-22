package bestpracticesinexceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Java Training\\ExceptionsHandling\\src\\bestpracticesinexceptionhandling"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// err use for print error 
			System.err.println("An IOException occurred: " + e.getMessage());
		}

	}

}
