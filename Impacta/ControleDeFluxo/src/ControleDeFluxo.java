
public class ControleDeFluxo {
	public static void main(String[] args) {
	
	int temperatura = 45;
	
	if(temperatura <= 5) {
		System.out.println("Temperatura est� em "+temperatura+"�C.");
		System.out.println("Est� muito frio.");}
	
		else if(temperatura<=20) {
		System.out.println("Temperatura est� em "+temperatura+"�C.");
		System.out.println("Est� frio.");}
	
		else if(temperatura<=24) {
		System.out.println("Temperatura est� em "+temperatura+"�C.");
		System.out.println("Temperatura agrad�vel.");}
	
		else 
			System.out.println("Temperatura est� em "+temperatura+"�C.");
			System.out.println("Est� muito quente hoje.");
	
	//n�o precisa de chaves nos blocos, mas � uma boa pr�tica no mercado.
	
	}
}