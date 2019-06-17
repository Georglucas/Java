
public class TesteMedia {
	public static void main(String[] args) {
		Meses meses = new Meses();
		
		int contaMes = 0;
		
		if (meses.Janeiro != 0) {
			contaMes+=1;
		}
		if (meses.Fevereiro != 0) {
			contaMes+=1;
		}
		if (meses.Marco != 0) {
			contaMes+=1;
		}
		if (meses.Abril != 0) {
			contaMes+=1;
		}
		if (meses.Maio != 0) {
			contaMes+=1;
		}
		if (meses.Junho != 0) {
			contaMes+=1;
		}
		if (meses.Julho != 0) {
			contaMes+=1;
		}
		if (meses.Agosto != 0) {
			contaMes+=1;
		}
		if (meses.Setembro != 0) {
			contaMes+=1;
		}
		if (meses.Outubro != 0) {
			contaMes+=1;
		}
		if (meses.Novembro != 0) {
			contaMes+=1;
		}
		if (meses.Dezembro != 0) {
			contaMes+=1;
		}
		
		

		double media = (meses.somaMeses/contaMes);
		System.out.println("Quantidade de meses com saldo positivo: "+contaMes);
		System.out.println("A média anual é R$ "+media);



	}
}
