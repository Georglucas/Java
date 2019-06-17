
public class ControleDeFluxo {
	public static void main(String[] args) {
	
	int temperatura = 45;
	
	if(temperatura <= 5) {
		System.out.println("Temperatura está em "+temperatura+"ºC.");
		System.out.println("Está muito frio.");}
	
		else if(temperatura<=20) {
		System.out.println("Temperatura está em "+temperatura+"ºC.");
		System.out.println("Está frio.");}
	
		else if(temperatura<=24) {
		System.out.println("Temperatura está em "+temperatura+"ºC.");
		System.out.println("Temperatura agradável.");}
	
		else 
			System.out.println("Temperatura está em "+temperatura+"ºC.");
			System.out.println("Está muito quente hoje.");
	
	//não precisa de chaves nos blocos, mas é uma boa prática no mercado.
	
	}
}