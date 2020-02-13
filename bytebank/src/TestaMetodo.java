
public class TestaMetodo {
	
	public static void main(String[]args) {
		Conta contaDoLucas=new Conta();
		contaDoLucas.saldo=100;
		contaDoLucas.deposito(50);
		System.out.println(contaDoLucas.saldo);
		
		contaDoLucas.saca(60);//invocação de metodos ()
		System.out.println(contaDoLucas.saldo);
		
		Conta contaDaMelissa = new Conta();
		contaDaMelissa.deposito(1000);
		
		if((contaDaMelissa.transfere(1300, contaDoLucas))){
			System.out.println("Transferencia efetuada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaMelissa.saldo);
		System.out.println(contaDoLucas.saldo);
		
		contaDoLucas.titular = "Georg Lucas Scirovicza";
		System.out.println(contaDoLucas.titular);
	
	}
}
