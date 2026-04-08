import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		exe2();
		
	}
	
	static void exe1() {
		int[] numeros = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero para a array:");
			numeros[i] = scanner.nextInt();
		}
		for(int numero : numeros) {
			System.out.println(numero +" * 2 = " +(numero * 2));
		}
	}
	
	static void exe2() {
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero para a array:");
			numeros[i] = scanner.nextInt();
		}
		for(int numero : numeros) {
			if(numero % 2 == 0) {
				System.out.println(numero +" - par");
			}else {
				System.out.println(numero +" - impar");
			}
		}
	}
}
