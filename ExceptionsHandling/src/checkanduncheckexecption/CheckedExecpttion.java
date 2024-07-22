package checkanduncheckexecption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExecpttion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader("D:\\Java Training\\ExceptionsHandling\\src\\checkanduncheckexecption/example.txt"));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
