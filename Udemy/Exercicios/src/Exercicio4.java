import java.util.Locale;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		int numeroDoColaborador;
		double horasTrabalhadas, valorHora;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a matrícula do colaborador: ");
		numeroDoColaborador= entrada.nextInt();
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextDouble();
		
		System.out.print("Informe o valor da hora: ");
		valorHora = entrada.nextDouble();
		
		System.out.println("Funcional: "+numeroDoColaborador);
		System.out.printf("Salário = US$ %.2f",valorHora*horasTrabalhadas);
		
		entrada.close();

	}

}
