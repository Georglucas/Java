
public class Livro {
		//neste campo de c�d. nossa classe s� tem 
		//	atributos mas � poss�vel criar m�todos 
	
		String nomeDoLivro;
		String descricao;
		double valor;
		double valorComDesconto;
		String percDoDesconto;
		String isbn;
		String dtLancamento;
		Autor autorX;
		
		//declaramos um m�todo:
		
		/*public Livro() {
			System.out.println("novo livro criado");
		}*/
		
		void mostrarDetalhes() {
			String mensagem = "Mostrando detalhes do livro:";
			System.out.println(mensagem);
			System.out.println("Nome do livro: "+nomeDoLivro);
			System.out.println("Descri��o: "+descricao);
			System.out.println("Valor: R$ "+valor);
			System.out.println("Valor com desconto: R$ "+valorComDesconto);
			System.out.println("ISBN: "+isbn);
			
			
			System.out.println("Data de lan�amento: "+dtLancamento);
			System.out.println();	
		}
		void aplicaDescontoDe(double porcentagem) {
		
				valorComDesconto=valor-(valor*porcentagem);
				//aqui criamos um m�todo que recebe um valor
									//como parametro
		}
	}


