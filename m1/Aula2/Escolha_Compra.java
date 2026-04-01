import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double preco = 0;

    System.out.println("O que voce quer?");
    System.out.println("Pastel R$2,50");
    System.out.println("Coxinha R$1,25");
    System.out.println("Hamburguer R$7,00");

    String nome = scanner.nextLine();
    if(nome.equals("Pastel")) {
        preco = 2.50;
    }else if(nome.equals("Coxinha")) {
        preco = 1.25;
    }else if(nome.equals("Hamburguer")) {
        preco = 7.00;
    }else {
        System.out.println("O salgado " +nome +" nao esta disponivel");
        return;
    }

    System.out.println("Quantos voce vai querer?");
    int quantidade = scanner.nextInt();
    System.out.println("Voce comprou " +quantidade +" " +nome +" por R$" +preco * quantidade);
}
