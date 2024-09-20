package listaPds;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContatinho(new Contatinho("Memphis Depay", "memphis@gmail.com", "111061189", "Futebolista"));
        agenda.addContatinho(new Contatinho("Rodrigo Garro", "garrito@gmail.com", "112087273", "Futebolista"));
        agenda.addContatinho(new Contatinho("Igor Coronado", "corona@gmail.com", "114094572", "Futebolista"));
        agenda.addContatinho(new Contatinho("Andre carillo", "carillo@gmail.com", "117089267", "Futebolista"));

        agenda.salvarLista("contatinhos.txt");

        System.out.println("Lista de contatinhos salva no arquivo: contatinhos.txt");
    }
}
