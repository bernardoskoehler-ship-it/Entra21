import java.util.Scanner;

public class Exercicios {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
	
	static void exe1() {
		System.out.println("Digite um numero:");
		int numero = scanner.nextInt();
		if(numero % 2 == 0) {
			System.out.println(numero +" e par");
		}else {
			System.out.println(numero +" e impar");
		}
	}
	static void exe2() {
		int maiorNumero = 0;
		int[] numeros = new int[5];
		System.out.println("digitre 5 numeros:");
		for(int i = 0; i < 5; i++) {
			numeros[i] = scanner.nextInt();
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
			System.out.println("Maior numero: " +maiorNumero);
		}
	}
	static void exe3() {
		System.out.println("Digite um numero:");
		int numero = scanner.nextInt();
		if(numero >= 0) {
			System.out.println(numero +" e positivo");
		}else {
			System.out.println(numero +" e negativo");
		}
		
	}
	static void exe4() {
		System.out.println("Digite sua nota:");
		int nota = scanner.nextInt();
		if(nota >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	static void exe5() {
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		if(idade >= 16) {
			System.out.println("Voce pode votar!");
		}
	}
	
	static void exe6() {
		int maiorNumero = 0;
		int[] numeros = new int[5];
		System.out.println("digitre 3 numeros:");
		for(int i = 0; i < 3; i++) {
			numeros[i] = scanner.nextInt();
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
			System.out.println("Maior numero: " +maiorNumero);
		}
	}
	static void exe7() {
		System.out.println("Digite sua nota:");
		int nota = scanner.nextInt();
		if(nota >= 9) {
			System.out.println("Exelente");
		}else if(nota >= 7){
			System.out.println("Bom");
		}else if(nota >= 5) {
			System.out.println("Regular");
		}else if(nota >= 0) {
			System.out.println("Insuficiente");
		}
	}
	static void exe8() {
		System.out.println("Digite o valor de 3 lados de um triangulo:");
		int soma = 0;
		int lado = 0;
		for(int i = 0; i < 3; i++) {
			lado = scanner.nextInt();
			if(i <= 2) {
				soma += lado;
			}
		}
		if(soma <= lado) {
			System.out.println("Angulos inseidos para um triangulo invalido");
		}else {
			System.out.println("Angulos corretos");
		}
	}
	static void exe9() {
		System.out.println("Digite 3 lados de um triangulo");
		int[] lados = new int[3];
		for(int i = 0; i < 3; i++) {
			lados[i] = scanner.nextInt();
		}
		if(lados[0] == lados[1] && lados[0] == lados[2]) {
			System.out.println("Equilatero");
		}else if(lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
			System.out.println("Isoceles");
		}else if(lados[0] != lados[1] && lados[1] != lados[2]) {
			System.out.println("Escaleno");
		}
	}
	static void exe10() {
		String usuarioAtual = "Bernardo";
		int senhaAtual = 12345678;
		System.out.println("Digite seu Usuario e senha:");
		String usuario = scanner.nextLine();
		int senha = scanner.nextInt();
		if(usuario.equals(usuarioAtual) && senha == senhaAtual) {
			System.out.println("Usuario conectado");
		}else {
			System.out.println("Usuario ou senha invalido");
		}
	}
	
	static void exe11() {
		//
	}
	static void exe12() {
		System.out.println("Digite dois numeros e um operador(+ - / *)");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		String op = scanner.nextLine();
		
		if(op.equals("+")) {
			System.out.println(num1 + num2);
		}else if(op.equals("-")) {
			System.out.println(num1 - num2);
		}else if(op.equals("/")) {
			System.out.println(num1 / num2);
		}else if(op.equals("*")) {
			System.out.println(num1 * num2);
		}
	}
	static void exe13() {
		double salario = 5470.50;
		if(salario <= 5000) {
			salario *=  0.80;
			System.out.println("Salario; " +salario);
			}else if(salario <= 10000) {
				salario *= 0.60;
				System.out.println("Salario: " +salario);
				} 
		}
	static void exe14() {
		double valor = 230.50;
		if(valor <= 100) {
			System.out.println("Nao tem disconto");
		}else if(valor <= 500) {
			valor *= 0.90;
			System.out.println("Desconto de 10% " +valor);
		}else {
			valor *= 0.80;
			System.out.println("Desconto de 20% " +valor);
		}
	}
	static void exe15() {
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		if(idade <= 12) {
			System.out.println("Criança");
		}else if(idade <= 17) {
			System.out.println("Adolecente");
		}else if(idade <= 59) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
	}
	
	static void exe16() {
		System.out.println("Digite 3 notas:");
		double media = 0;
		for(int i = 0; i < 3; i++) {
			int nota = scanner.nextInt();
			media += nota;
		}
		media /= 3;
		if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media >= 4) {
			System.out.println("Recuperacao");
		}else {
			System.out.println("reprovado");
		}
	}
	static void exe17() {
		double salario = 5400.00;
		if(salario >= 5000) {
			System.out.println("Emprestimo aprovado");
		}else if(salario >= 3000) {
			System.out.println("Emprestimo em analise");
		}else {
			System.out.println("Emprestimo negado");
		}
	}
	static void exe18() {
		int numeroSecreto = 27;
		System.out.println("Tem acertar o numero");
		for(int i = 0; i < 1;) {
			int tentativa = scanner.nextInt();
			if(tentativa > numeroSecreto) {
				System.out.println("Menor");
			}else if(tentativa < numeroSecreto) {
				System.out.println("Maior");
			}else {
				System.out.println("ACERTOU!");
				i++;
			}
		}
	}
	static void exe19() {
		System.out.println("Digite sua altura e peso:");
		double altura = scanner.nextDouble();
		scanner.nextLine();
		int peso = scanner.nextInt();
		double calculo = (peso / (altura*altura));
		if(calculo < 18) {
			System.out.println("Abaixo do peso");
		}else if(calculo < 25) {
			System.out.println("Peso normal");
		}else if(calculo < 30) {
			System.out.println("Acima do peso");
		}else {
			System.out.println("Obeso");
		}
	}
	static void exe20() {
		int senhaAtual = 12345678;
		int tentativasValidas = 3;
		
		System.out.println("Digite a senha");
		
		while(tentativasValidas > 0) {		
			int senha = scanner.nextInt();
		
			if(senha == senhaAtual) {
				System.out.println("Voce acertou a senha");
			}else {
				tentativasValidas --;
				System.out.println("Senha incorreta, tentativas restantes: " +tentativasValidas);
			}
			}
		if(tentativasValidas <= 0) {
			System.out.println("Voce nao tem mais tentativas");
		}
		}
}
