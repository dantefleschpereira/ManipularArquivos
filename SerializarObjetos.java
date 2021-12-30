package documento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class SerializarObjetos {

	public static void serializacao() throws IOException {

		Gato gato = new Gato("Brisa", 5, "branca");

		File f = new File("gato");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
		oos.writeObject(gato);

		PrintStream ps = new PrintStream(System.out);
		ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

		oos.close();
		ps.close();
	}

	public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
		Gato objetoGato = (Gato) ois.readObject();
		
		System.out.printf("\nNome.....: %s", objetoGato.getNome());
		System.out.printf("\nIdade....: %s", objetoGato.getIdade());
		System.out.printf("\nCor......: %s\n", objetoGato.getCor());
		System.out.println(objetoGato);
		
		ois.close();
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serializacao();
		String file = "C:\\Users\\dante\\Desktop\\Dio\\project-dio\\gato";
		desserializacao(file);
		
	}

}
