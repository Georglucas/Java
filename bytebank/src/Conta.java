public class Conta { //class é palavra-chave no java que define um tipo
	double saldo; // isso aqui é uma especificação de conta....
	int agencia; // a class conta possui estes atributos....
	int numero;
	String titular;
	
	void deposito(double valor) { //void é um metodo
		this.saldo+=valor; //this é uma palavra-chave referencia no java
	}
	
	public boolean saca(double valor){
		if(this.saldo>=valor) {
			this.saldo -= valor;// usamos o this dentro de um métod para acessar um atributo.
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			System.out.print("Sua conta possui ");
			return false;
		}
		
	}
		public boolean transfere (double valor, Conta destino) {
			if(this.saldo>=valor) {
				this.saldo -=valor;
				destino.deposito(valor);
				return true;
			}					//else { else é facultativo
				return false;
			}
		
		public void deposita(double valor) {
			this.saldo+=valor;
				}
		
		public boolean retirada(double valor) {
			if(this.saldo >= valor) {
				this.saldo-=valor;
				return true;
			}else {
				return false;
			}
			
		
			
		}
	}
	


//um metodo define o comportamento ou uma maneira de fazer algo >> define oq um objeto sabe fazer
// o comportamento é implementado dentro do metodo.
//um metodo pode ter zero ou mais parametros
//metodos obedecem à convenção CamelCase