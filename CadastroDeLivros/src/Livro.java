
public class Livro {
		//neste campo de cód. nossa classe só tem 
		//	atributos mas é possível criar métodos 
	
		String nomeDoLivro;
		String descricao;
		double valor;
		double valorComDesconto;
		String percDoDesconto;
		String isbn;
		String dtLancamento;
		Autor autorX;
		
		//declaramos um método:
		
		/*public Livro() {
			System.out.println("novo livro criado");
		}*/
		
		void mostrarDetalhes() {
			String mensagem = "Mostrando detalhes do livro:";
			System.out.println(mensagem);
			System.out.println("Nome do livro: "+nomeDoLivro);
			System.out.println("Descrição: "+descricao);
			System.out.println("Valor: R$ "+valor);
			System.out.println("Valor com desconto: R$ "+valorComDesconto);
			System.out.println("ISBN: "+isbn);
			
			
			System.out.println("Data de lançamento: "+dtLancamento);
			System.out.println();	
		}
		void aplicaDescontoDe(double porcentagem) {
		
				valorComDesconto=valor-(valor*porcentagem);
				//aqui criamos um método que recebe um valor
									//como parametro
		}
	}


