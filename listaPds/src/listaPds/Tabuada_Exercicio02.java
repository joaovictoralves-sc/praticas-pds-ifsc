package listaPds;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada_Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe um numero entre 1 e 10: ");
		int numero = leitor.nextInt();
		String nomeArquivo = "tabuada_" + numero + ".txt";
		
		try(BufferedReader leitura = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha;
			while((linha = leitura.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado!" + nomeArquivo);
		} finally {
			leitor.close();
		}
	}
}