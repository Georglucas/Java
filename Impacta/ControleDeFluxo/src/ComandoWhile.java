
public class ComandoWhile {
	public static void main(String[]args) {
		
		int num = 0;
		while(num<10) //sem as chaves durante a execu��o do bloco while, 
					//o programa imprime somente o �ltimo valor, c as chaves{} ele executa e imprime ap�s CADA passagem no la�o
			++num;
		System.out.println(num);
	}

}
