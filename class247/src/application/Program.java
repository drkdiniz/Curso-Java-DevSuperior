package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import entities.Usuarios;

public class Program {

	public static void main(String[] args) {
		
		Set<Usuarios> set = new HashSet<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		
		String path = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\PROJETOS\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[]aux = line.split(" ");
				String name = aux[0];
				LocalDateTime data = LocalDateTime.parse(aux[1], formatter);
				set.add(new Usuarios(name, data));
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		for (Usuarios usuario : set) {
			System.out.println("Nome: " + usuario.getName() + " Data: " + usuario.getData());
		}
		
		System.out.println("Número de usuários: " + set.size());
		
		
			
		
	}

}
