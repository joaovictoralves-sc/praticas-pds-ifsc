package listaPds;

import java.io.BufferedWriter;
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

    public List<Contatinho> getContatinhos() {
        return contatinhos;
    }
}
