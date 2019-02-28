package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;

public class CompararArchivos {
	
	public static void propertiesKeyRepetidos(String filePath) throws IOException {
		Queue<String> restantes = new LinkedList<>(Files.readAllLines(Paths.get(filePath)));
		for (int i=restantes.size(); i > 0; i--) {
			try {
				String elemento = restantes.poll().split("=")[0] + "=";
				if (restantes.stream().anyMatch(e2 -> e2.startsWith(elemento))) {
					System.out.println(elemento);
				}
			} catch (Exception e) {}
		}
	}

}
