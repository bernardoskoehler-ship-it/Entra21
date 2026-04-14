import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> lista = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        adicionarNaLista();
        adicionarNaLista();
        adicionarNaLista();
        removerDaLista();
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
    public static void adicionarNaLista() {
        System.out.println("Digite o que voce quer adicionar:");
        String nome = scanner.nextLine().toLowerCase();
        if(jaExiste(nome)) {
            return;
        }
        lista.add(nome);
    }
    public static void removerDaLista() {
        System.out.println("Digite o item que voce quer remover:");
        String nome = scanner.nextLine().toLowerCase();
        if(!jaExiste(nome)) {
            System.out.println(nome +" nao existe na lista!");
            return;
        }
        for(int i = 0; i < lista.size(); i ++) {
            if(lista.get(i).equals(nome)) {
                lista.remove(i);
                return;
            }
        }
    }
    public static void mostrarLista() {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(i+1 +". " +lista.get(i));
        }
    }
}
