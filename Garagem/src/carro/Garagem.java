package carro;

public class Garagem {

		public Carro carroPasseio = new Carro();
		public Carro carroUtilitario = new Carro();
		
		public static void main(String[] args) {	
		
			
			Garagem g = new Garagem();
			g.carroPasseio.cor = "Vermelho";
			g.carroPasseio.modelo = "VW Jetta";
			g.carroPasseio.potencia = 2.3;
			
			g.carroUtilitario.cor = "Branco";
			g.carroUtilitario.modelo = "BMW X5";
			g.carroUtilitario.potencia = 5.0;

			
			System.out.println("Carro de Passeio: ");
			System.out.println("Cor: " +g.carroPasseio.cor);
			System.out.println("Modelo: " +g.carroPasseio.modelo);
			System.out.println("Potência: " +g.carroPasseio.potencia);
			
			System.out.println();
			
			for (int i=0 ; i<40 ; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			System.out.println();
			
			
			System.out.println("Carro de Passeio: ");
			System.out.println("Cor: " +g.carroUtilitario.cor);
			System.out.println("Modelo: " +g.carroUtilitario.modelo);
			System.out.println("Potência: " +g.carroUtilitario.potencia);
			
		
	}

}
