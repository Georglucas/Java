import java.util.Scanner;
import java.util.Locale;
public class Exercicio2 {

	public static void main(String[] args) {
		
		double raio, area;
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		
		raio = entrada.nextDouble();
		
		area = raio*raio*Math.PI;
		
		System.out.printf("Area = %.4f%n",area);
		
		System.out.println(Math.PI);
		
		entrada.close();

	}

}
