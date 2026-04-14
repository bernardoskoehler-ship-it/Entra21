import java.util.ArrayList;

public class Main {
    static ArrayList<String> lista = new ArrayList<>();
    public static void main(String[] args) {
        adicionarNaLista("Cenoura");
        adicionarNaLista("Tomate");
        adicionarNaLista("Batata");
        adicionarNaLista("Tomate");
        mostrarLista();

    }

    public static boolean jaExiste(String nome) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(nome)) {
                System.out.println(nome +" ja existe");
                return true;
            }
        }
        return false;
    }
    public static void adicionarNaLista(String nome) {
        if(jaExiste(nome)) {
            return;
        }
        lista.add(nome);
    }
    public static void mostrarLista() {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(i+1 +". " +lista.get(i));
        }
    }
}
