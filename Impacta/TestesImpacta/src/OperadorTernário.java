
public class OperadorTern�rio {
	public static void main(String[] args) {
		int valor = 555542529;
		/*if (valor%2==0) {	forma mais tradicional de efetuar o c�lculo para verificar se � par ou �mpar
		System.out.println("� par");
		}else System.out.println("� �mpar");*/
		
		System.out.println(valor%2==0 ? "O n�mero "+valor+" � par.":"O n�mero "+valor+" � �mpar.");
		//maneira mais clean de realizar um if
		//	?: operador elvis
	}

}
