
public class FuncaoContinue {
	public static void main (String[]args) {
		int num = 0;
		while(num<10) {
			//System.out.println(num);
			++num;
			//System.out.println(num);

			if(num==5) {//aqui ele volta para o começo do laço e num passa a valer 6
				continue;
			}
			System.out.println("***********************");
			System.out.println(num);
		}
		
		
	}
}
