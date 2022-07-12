import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");

			int c;

			while ((c = inputStream.read()) != -1) {
				System.out.println("읽은 문자 확인 : " + (char) c);

				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}
}
