
public class OperadorTernário {
	public static void main(String[] args) {
		int valor = 555542529;
		/*if (valor%2==0) {	forma mais tradicional de efetuar o cálculo para verificar se é par ou ímpar
		System.out.println("é par");
		}else System.out.println("é ímpar");*/
		
		System.out.println(valor%2==0 ? "O número "+valor+" é par.":"O número "+valor+" é ímpar.");
		//maneira mais clean de realizar um if
		//	?: operador elvis
	}

}
