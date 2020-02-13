import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {

		int A,B,C,D,DIF;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		A = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		B = entrada.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		C = entrada.nextInt();
		
		System.out.print("Informe o quarto valor: ");
		D = entrada.nextInt();
		
		DIF = (A*B-C*D);
		
		System.out.println("A diferença é: "+DIF);
		
		entrada.close();
		
	}

}
