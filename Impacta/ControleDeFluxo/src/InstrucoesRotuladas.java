
public class InstrucoesRotuladas {
	public static void main(String[]args) {
		instrucao1:
			for(int i = 1; i < 4; i++) {
				System.out.println(i);
				instrucao2:
								 //1
					for(int j = 1; j < 4; j++) {
						System.out.println("Aqui J vale "+j);
						if(j==2) {
							System.out.println("J é igual a "+j);
							break;
						}
						System.out.println("I é igual a "+i);
					}
					System.out.println("*******************");
			}
	}
}
				
				
				
				