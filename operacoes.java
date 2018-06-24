import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class operacoes {
	
	

	public static void main(String[] args) {
		escreveNoArquivo();
		
		long valor = 450000000;
		
		System.out.print(valor);
		
	}
	
	
	//método void para criar um arquivo de texto
	public static void escreveNoArquivo() {
		String texto = "Escreve no arquivo\r\n";
		String texto2= "Conjuntos de Regras" ;
		String textoFinal = texto + texto2;	
		
		byte[] textoEmByte = textoFinal.getBytes();
		
		Path caminho = Paths.get("C:\\Users\\mona_\\Desktop\\Arquivo.txt");
		
		try {
			Files.write(caminho, textoEmByte);
		}catch (Exception erro) {
			
		}
	}
	
	//método com valor tipo long
	public static long calculaValor (long valor) {
		return valor*10;
		
	}
	
	//método com oito valores longs
	public static long calculaValor (long valor1, long valor2, long valor3, long valor4, long valor5, long valor6, long valor7, long valor8) {
		return valor1 + valor2 +valor3 +valor4 + valor5 + valor6 + valor7 + valor8;
		
	}
	
	
	
	
}


