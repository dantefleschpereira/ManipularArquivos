package documento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CriarArquivo {

	public static void main(String[] args) throws IOException {

		lerTecladoEscreverDocumento();
	}

	public static void lerTecladoEscreverDocumento() throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Digite 3 nomes: ");
		pw.flush();
		
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		
		File file = new File("cadastro.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));
		
		do {
			bw.write(line);
			bw.newLine();
			line = in.nextLine();
			bw.flush();
		}while(!(line.equalsIgnoreCase("fim")));
		
		}
}
