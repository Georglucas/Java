
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //referencia a conta; variável primeira conta recebe oq o new Conta devolver
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo+= 100;//recebe primeiraConta.saldo + primeiraConta.saldo+ 100
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta=new Conta();
		segundaConta.saldo=50;
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta==segundaConta) {
			System.out.println("Contas iguais");
		}else
			System.out.println("Contas diferentes");
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);



	}
}
