import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PracticeProblem {

	public static String readFile(String fileName) {
		try {
			File newFile = new File(fileName);
			Scanner Reader = new Scanner(newFile);
			String data = "";
			while (Reader.hasNextLine()) {
			data += Reader.nextLine() + "\n";
		}
		Reader.close();
		return data;
	} catch (FileNotFoundException e) {
		return "File not Found";
	}
	}

	public static String backwardsReadFile(String filename) {
		try {
			File newFile1 = new File(filename);
			Scanner newReader = new Scanner(newFile1);
			StringBuilder data = new StringBuilder();
			while (newReader.hasNextLine()) {
				data.append(newReader.nextLine() + "\n");
			}
			newReader.close();
			return data.reverse().toString();
		} catch (FileNotFoundException e) {
			return "File not FOund";
		}
	}

	

	public static void main(String args[]) {
		String result = readFile("file.txt");
		System.out.println(result);

		String result2 = backwardsReadFile("file2.txt");
		System.out.println(result2);
	}

	

}
