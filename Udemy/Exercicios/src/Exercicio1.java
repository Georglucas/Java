import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, SOMA;
		
		System.out.print("Informe o primeiro valor: ");
		
		A = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		
		B = entrada.nextInt();
		
		SOMA = A+B;
		System.out.print("A soma de "+A+" mais "+B+" é igual a "+ SOMA+".");

		entrada.close();
		
	}

}
