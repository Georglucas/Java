
public class PassagemPorValor {

	public static void main(String[] args) {
		int valor = 1500;
		
		System.out.println("Antes da chamada do metodo alteraValor o valor é "+valor);
		alterarValor(valor);
		System.out.println("Depois da chamada do metodo alteraValor o valor passa a ser "+valor);
		System.out.println();
		
		Pessoa maria = new Pessoa();
		maria.sexo="f";// atributo do objeto
		maria.nome = "Maria";
		maria.idade = 50;
		
		//tentativa de alterar a referencia do objeto
		System.out.println("Valores antes da chamada do método alterarReferenciaObjeto: ");
		maria.exibirDados();
		alterarReferenciaObjeto(maria);
		System.out.println("Valores depois da chamada do método alterarReferenciaObjeto: ");
		maria.exibirDados();
		System.out.println("");
		
		
		System.out.println("Valores antes da chamada do método alterarConteudoObjeto: ");
		maria.exibirDados();
		alterarConteudoObjeto(maria);
		System.out.println("Valores depois da chamada do método alterarConteudoObjeto: ");
		maria.exibirDados();
		System.out.println("");
	
	} 
	static void alterarValor(int valor) {
		valor=50;
	}
	static void alterarReferenciaObjeto(Pessoa p) {
		Pessoa ana = new Pessoa();
		p.sexo = "f";
		p.nome = "Ana";
		p.idade = 18;
		p = ana;
	}
	
	static void alterarConteudoObjeto(Pessoa p) {
		p.sexo = "m";
		p.nome = "Joao";
		p.idade = 33;
	}

}









































