import javax.swing.JOptionPane;
//Uma operadora de telefone cobra R$ 50,00 por um plano básico que dá direito a 100 minutos de telefone.
//Cada minuto excedente à franquia de 100 minutos custa R$ 2,00
//Programa que calcula e exibe o consumo mensal de um usuário.
public class FranquiaDeMinutos {
	public static void main(String[] args) {
		
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de minutos consumidos"));
		
		if (minutos > 100){
			int consumo = (50+(minutos-100)*2);
		JOptionPane.showMessageDialog(null, "Seu consumo mensal foi de "+minutos+" minutos.");
		JOptionPane.showMessageDialog(null, "Valor total a pagar  R$ "+consumo+" reais.");
		}else if(minutos==1){
			JOptionPane.showMessageDialog(null, "Seu consumo mensal foi de "+minutos+" minuto. Valor total a pagar R$ 50,00 reais.");
		}
			JOptionPane.showMessageDialog(null, "Seu consumo mensal foi de "+minutos+" minutos. Valor total a pagar R$ 50,00 reais.");
	}

}
