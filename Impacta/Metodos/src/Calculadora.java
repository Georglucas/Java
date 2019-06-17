
public class Calculadora {
	
	public static void main(String[]args) {//nosso main é o CHAMADOR do método somar.
		double sum;
		PrimeiroMetodo qqrNome = new PrimeiroMetodo(); //criamos uma variável calc do tipo classe PrimeiroMetodo; 
													//new PrimeiroMetodo() é a forma de se referenciar a este objeto; criamos este objeto.
		sum = qqrNome.somar(1.1,3.2,0.1);//é possível efetuar um casting diretamente de onde o programa chama o metodo
		//atribui a sum a chamada do metodo somar com dois valores
		qqrNome.nome = "Hello World";
		qqrNome.dolarHoje=(int) 3.85;
		//qqrNome.dolarHoje=3.85;
		System.out.println(qqrNome.dolarHoje);
		System.out.println(qqrNome.nome);
		System.out.println(sum);
	}

}
