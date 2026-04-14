import java.util.Scanner;
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    exe5meio();
}
public static void exe3() {
    int[] valor = new int[10];
    for(int i = 0; i < valor.length; i++) {
        System.out.println("Digite um numero");
        valor[i] = scanner.nextInt();
    }
    for(int i = 9; i >= 0; i--) {
        System.out.println(valor[i]);
    }
}
public static void exe4() {
int[] numeros = new int[5];
int posicao = -1;
int maiorNumero = 0;
    for(int i = 0; i < numeros.length; i++) {
        System.out.println("Digite um numero");
        numeros[i] = scanner.nextInt();
        if(numeros[i] > maiorNumero) {
            maiorNumero = numeros[i];
            posicao = i + 1;
        }
    }
    System.out.println("O maior numero foi " +maiorNumero +" na posicao " +posicao);
}
public static void exe5() {
    int[] numeros = new int[5];
    for(int i = 0; i < numeros.length; i++) {
        System.out.println("Digite um numero");
        numeros[i] = scanner.nextInt();
    }

    Arrays.sort(numeros);
    for(int n : numeros) {
        System.out.println(n);
    }
}
public static void exe6() {
    int[] notas = new int[10];
    for(int i = 0; i < notas.length; i++) {
        System.out.println("Digite um numero");
        notas[i] = scanner.nextInt();
    }
    for(int i = 0; i < notas.length; i++) {
        if(notas[i] >= 7) {
            System.out.println(notas[i]);
        }
    }
}

public static void exe5meio() {
    int[] numeros = new int[5];
    int[] posicao = new int[5];
    for(int i = 0; i < numeros.length; i++) {
        System.out.println("Digite um numero");
        numeros[i] = scanner.nextInt();
    }
    for (int i = 0; i < numeros.length - 1; i++) {
        for (int j = 0; j < numeros.length - 1; j++) {
            if (numeros[j] > numeros[j + 1]) {
                int temp = numeros[j];
                numeros[j] = numeros[j + 1];
                numeros[j + 1] = temp;
            }
        }
    }=
    for (int n : numeros) {
        System.out.println(n);
    }
}
