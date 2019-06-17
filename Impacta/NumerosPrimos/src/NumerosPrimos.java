
public class NumerosPrimos {
	
	public static void main(String[]args) {
		
		int numero = 5;
		int div=0;
				  //5 <= 5    5
		for(int i=1;i<=numero;i++) {
			//System.out.println(i);
				//5   5
			if(numero%i==0)//true
				div++;//2
			System.out.println(div);
		}
		
			if(div<=2) 
			System.out.println("cousin");
			else
				System.out.println("non cousin");
	}

}
