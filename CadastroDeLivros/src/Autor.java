
public class Autor {
	
	String nomeDoAutor;
	String emailDoAutor;
	String cpfDoAutor;
	
	void mostrarDetalhes() {
	System.out.println("Mostrando detalhes do autor: ");
	System.out.println("Nome do(a) autor(a): "+nomeDoAutor);
	System.out.println("E-mail: "+emailDoAutor);
	System.out.println("CPF: "+cpfDoAutor);
	for(int i = 0; i<=15; i++) {
		System.out.print("-----");
		}
	System.out.println();
	System.out.println();
	}
}
