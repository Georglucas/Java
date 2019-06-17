
public class CadastroDeLivros {

	public static void main(String[] args) {
				
		/*Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
		
		/*Autor autor = new Autor();
		autor.nomeDoAutor = "Franz Kafka";
		autor.emailDoAutor = "mail@pro-mail.com";
		autor.cpfDoAutor = "345.458.896-16";
		
		Livro livro= new Livro();
		livro.nomeDoLivro = "Java 8 Prático";
		livro.descricao = "Novos Recursos da Linguagem";
		livro.valor = 9.90;
		livro.valorComDesconto = livro.valor-(livro.valor*0.10);
		livro.isbn = "978-85-66250-46-6";
		livro.dtLancamento = "15/06/2018";
		*/
		/*livro.autor = autor;
		livro.aplicaDescontoDe(0.10);
		livro.mostrarDetalhes();
		autor.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.nomeDoAutor = "Alissa Rosenbaum";
		outroAutor.emailDoAutor = "email@x-emai.com";
		outroAutor.cpfDoAutor = "788.528.549-89";
		
		Livro outroLivro = new Livro();
		outroLivro.nomeDoLivro = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiro programas";
		outroLivro.valor = 19.90;
		outroLivro.valorComDesconto = livro.valor-(livro.valor*0.10);
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.dtLancamento = "16/06/2018";
		
		//outroLivro.autor = outroAutor;
		
		outroLivro.aplicaDescontoDe(0.10);
		outroLivro.mostrarDetalhes();
		//outroAutor.mostrarDetalhes();
		
		
		if (livro == outroLivro){
			System.out.println("São iguais");
		}else {
			System.out.println("Diferentes");
		}*/
		Autor autor = new Autor();
		autor.nomeDoAutor = "Rodrigo Turini";
		
		Livro livro = new Livro();
		livro.autorX = autor;
		
		autor.nomeDoAutor = "Georg Lucas";
		System.out.println(autor.nomeDoAutor);
		System.out.println(autor);
		System.out.println(livro.autorX);
		//System.out.println(livro);
	}
	
}















