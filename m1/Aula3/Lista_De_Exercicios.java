import java.util.Scanner;

public class ListaExercicio1 {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		exe18();
	}
	
	static void exe1() {
		int x = 10;
		System.out.println(x);
	}
	static void exe2() {
		String nome = "Bernardo";
		int idade = 19;
		double altura = 2.01;
		System.out.println("Nome: " +nome +" | Idade: " +idade +" | Altura: " +altura);
	}
	static void exe3() {
	int valor1 = 5;
	int valor2 = 17;
	System.out.println(valor1 + valor2);
}
	static void exe4() {
		double preco = 7.75;
		System.out.println("O preco do salgado é R$" +preco);
	}
	
	static void exe5() {
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		System.out.println("Bem vindo " +nome);
	}
	static void exe6() {
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		System.out.println("Daqui a 10 anos voce tera " +(idade + 10));
		if(idade + 10 > 100) {
			System.out.println("Sintolhe informar mas acho que voce ja esta a 7 palmos do chao...");
		}
	}
	static void exe7() {
		System.out.println("Digite 2 numeros");
		int valor1 = scanner.nextInt();
		scanner.nextInt();
		int valor2 = scanner.nextInt();
		System.out.println("A soma de ambos é " +(valor1 + valor2));
	}
	static void exe8() {
		System.out.println("Digite um numero decimal:");
		int valor = scanner.nextInt();
		System.out.println(valor * 2);
	}
	
	static void exe9() {
		System.out.println("Digite o valor de um produto");
		double valor = scanner.nextDouble();
		System.out.println(valor +" com um desconto de 10%: " +(valor *0.9));
	}
	static void exe10() {
		System.out.println("Digite a largura e altura de um retangulo:");
		double largura = scanner.nextDouble();
		scanner.nextDouble();
		double altura = scanner.nextDouble();
		System.out.println("A area do retangulo é " +(largura * altura));
	}
	static void exe11() {
		double notaTotal = 0;
		System.out.println("Digite 3 notas:");
		for(int i = 0; i < 3; i++) {
			double nota = scanner.nextDouble();
			notaTotal += nota;
		}
		System.out.println("A sua media é: " +(notaTotal / 3));
	}
	
	static void exe12() {
		System.out.println("Digite seu salario para receber um aumento!");
		double salario = scanner.nextDouble();
		System.out.println("Voce tera um aumento de 15%! Que dara: " +(salario * 1.15));
	}
	
	static void exe13() {
		System.out.println("digite seu nome e sua idade:");
		String nome = scanner.nextLine();
		int idade = scanner.nextInt();
		System.out.println("Ola " +nome +"! Voce tem " +idade +" anos.");
	}
	static void exe14() {
		System.out.println("Digite 2 numeros:");
		int valor1 = scanner.nextInt();
		scanner.nextInt();
		int valor2 = scanner.nextInt();
		System.out.println(valor1 +" + " +valor2 +" = " +(valor1 + valor2));
		System.out.println(valor1 +" - " +valor2 +" = " +(valor1 - valor2));
		System.out.println(valor1 +" * " +valor2 +" = " +(valor1 * valor2));
		System.out.println(valor1 +" / " +valor2 +" = " +(valor1 / valor2));
	}
	static void exe15() {
		System.out.println("Digite uma temperatura em Celcios:");
		int graus = scanner.nextInt();
		System.out.println(graus +" em Fahrenheit ficaria " +((graus * 9 / 5) + 32));
	}
	static void exe16() {
		System.out.println("Digite a quantidade de horas trabalhada e o valor por hora");
		int horas = scanner.nextInt();
		double valor = scanner.nextDouble();
		System.out.println("Voce ganharia R$" +(double)(horas * valor));
	}
	
	static void exe17() {
		double notaTotal = 0;
		System.out.println("Digite seu nome e 3 notas:");
		String nome = scanner.nextLine();
		for(int i = 0; i < 3; i++) {
			double nota = scanner.nextDouble();
			notaTotal += nota;
		}
		System.out.println(nome +" ficou com a media de " +(notaTotal / 3));
	}
	static void exe18() {
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
}


