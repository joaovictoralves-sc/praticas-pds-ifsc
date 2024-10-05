package listaPds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada_Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe um numero entre 1 e 10: ");
		int numero = leitor.nextInt();
		String nomeArquivo = "tabuada_" + numero + ".txt";
		
		try(BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo))) {
			for(int i = 1; i <= 10; i++) {
				escrita.write(numero + " x " + i + " = " + (numero * i));
				escrita.newLine();
			}
			System.out.println("Tabuada salva no arquivo!");	
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo!" + nomeArquivo);
		} finally {
			leitor.close();
		}
	}
}