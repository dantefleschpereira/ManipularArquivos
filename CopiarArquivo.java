package documento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArquivo {

	public static void copiarArquivo() throws IOException {

		File file = new File("C:\\Users\\dante\\Desktop\\Dio\\project-dio\\cadastro.txt");

		String nomeArquivo = file.getName();

		// Reader r = new FileReader(nomeArquivo);
		// BufferedReader br = new BufferedReader(r);
		BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		String line = br.readLine();
		
		String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
		
		File fcopy = new File(nomeArquivoCopy);
		BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));
		
		do {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}while(!(line == null));
		
		System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes\n", file.getName(), file.length());
		System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes", fcopy.getName(), fcopy.length());

		
	}
	
	public static void main (String[] args) throws IOException {
		copiarArquivo();
	}
}
