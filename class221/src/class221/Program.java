package class221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		String path = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\PROJETOS\\in.txt";
		String outputDir = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\PROJETOS\\output";
        String path1 = outputDir + "\\out.txt";
        
        File dir = new File(outputDir);
        if (!dir.exists()) {
        	dir.mkdirs();
        }
		
		try (BufferedReader br = new BufferedReader(new FileReader(path));
		BufferedWriter bw = new BufferedWriter(new FileWriter(path1, true))){ 
			
			String line = br.readLine();
			while ( line != null) {
				String aux[] = line.split(",");
				for (String word : aux) {
					list.add(word);
				}
				line = br.readLine();
			}
			 
				for (int i = 0; i + 2 < list.size(); i+= 3) {
					bw.write(list.get(i));
					bw.write(" ");
					double price = (Double.parseDouble(list.get(i + 1)) * Double.parseDouble(list.get(i + 2)));
					bw.write(String.format("%.2f", price));
					bw.newLine();
					}
				
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
			
		}
	}
	
}
				
				 
			
