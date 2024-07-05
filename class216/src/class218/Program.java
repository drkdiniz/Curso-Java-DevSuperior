package class218;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

		
	}
}
