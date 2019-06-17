
public class ComandoWhile {
	public static void main(String[]args) {
		
		int num = 0;
		while(num<10) //sem as chaves durante a execução do bloco while, 
					//o programa imprime somente o último valor, c as chaves{} ele executa e imprime após CADA passagem no laço
			++num;
		System.out.println(num);
	}

}
