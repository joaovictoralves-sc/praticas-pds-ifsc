package listaPds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    private List<Contatinho> contatinhos;

    public Agenda() {
        contatinhos = new ArrayList<>();
    }

    public void addContatinho(Contatinho contatinho) {
        contatinhos.add(contatinho);
    }

    public void ordenarLista() {
        Collections.sort(contatinhos, Comparator.comparing(Contatinho::getNome));
    }

    public void salvarLista(String arquivo) {
        ordenarLista();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Contatinho contatinho : contatinhos) {
                writer.write(contatinho.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Contatinho lerContatinhoPorNome(String nome, String arquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split("#");
                if (dados[0].equals(nome)) {
                    return new Contatinho(dados[0], dados[1], dados[2], dados[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Contatinho> getContatinhos() {
        return contatinhos;
    }
}