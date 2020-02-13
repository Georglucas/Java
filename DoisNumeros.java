import javax.swing.JOptionPane;
import java.util.Locale;
/*
 * Programa que recebe do usuário dois números executa e apresenta o resultado 
 * das operações listadas a seguir, de acordo com a escolha do usuário. 
 * O menu deve ser apresentado enquanto o usuário não escolher a opção 5 (Sair).
 * 
 * Opção Operação:
 * 1 Média entre os números digitados;
 * 2 Diferença do maior pelo menor;
 * 3 Produto entre os números digitados;
 * 4 Divisão do primeiro pelo segundo;
 * 5 Sair.
 */
public class DoisNumeros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		JOptionPane.showMessageDialog(null,"Olá, seja bem vindo(a), vamos começar?");
		byte operacao=0;
		double N1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		double N2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));
		
		while(operacao!=5) {

		double resultado;
		operacao = Byte.parseByte(JOptionPane.showInputDialog("Informe a operação que "
				+ "será processada: "+ "\n"
				+ "1 Média entre os números digitados"+ "\n"
				+ "2 Diferença do maior pelo menor"+ "\n"
				+ "3 Produto entre os números digitados"+ "\n"
				+ "4 Divisão do primeiro pelo segundo"+ "\n"
				+ "5 Sair"));
			
					if(operacao>5 | operacao<1) {
					JOptionPane.showMessageDialog(null,"Opção inválida :(");
		}
			if(operacao==1) {
				resultado=((N1+N2)/2);
				JOptionPane.showMessageDialog(null,String.format("A média entre "+N1+" e "+N2+" é igual a %.2f",resultado));	
			}else 
				if(operacao==2) {
					if(N1>N2) {
						resultado=N1-N2;
						JOptionPane.showMessageDialog(null,String.format("A diferença entre "+N1+" e "+N2+" é igual a %.2f",resultado)); 	
					}else 
						if(N1<N2) {
							resultado=N2-N1;
							JOptionPane.showMessageDialog(null,String.format("A diferença entre "+N2+" e "+N1+" é igual a %.2f",resultado));
						}else
							JOptionPane.showMessageDialog(null,"Valores iguais.");
				}else 
					if(operacao==3) {
						resultado = N1*N2;
					JOptionPane.showMessageDialog(null,String.format("O produto entre "+N1+" e "+N2+" é igual a %.2f",resultado));	
			}else
				if(operacao==4) {
					resultado = N1/N2;
					JOptionPane.showMessageDialog(null,String.format("A divisão entre "+N1+" e "+N2+" é igual a %.2f",resultado));	
			}			
			}
		JOptionPane.showMessageDialog(null,"Nos vemos na próxima :)");
	}
}
