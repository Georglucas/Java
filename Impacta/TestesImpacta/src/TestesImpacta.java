
public class TestesImpacta {
	public static void main(String[]args) {
		byte teste = 0123;//conforme nota-se, vari�veis do tipo byte � capaz de armazenar pouca informa��o.
		int curto = 012345;//conforme nota-se, vari�veis do tipo short � capaz de armazenar pouca informa��o.
		
		//int novoCurto = curto;//aqui o casting funciona pois estou atribuindo um valor do tipo "pequeno" � uma vari�vel de tipo "maior".
		short novoShortByte = teste;//aqui o casting funciona pois estou atribuindo um valor do tipo "pequeno" � uma vari�vel de tipo "maior".
		short novoShort = (short)curto;//aqui o casting funciona atribuindo-se um valor do tipo "maior" (int) � uma vari�vel de tipo "menor" (short).
		
		int a=10, b=1;
		String _$c = "Ola ";
		String d = "mundo!!!";
		d = "123";
		char letraUnica = '1';//comporta apenas um caracter
		final double VALOR_DE_PI = 3.141516;
		//double VALOR_DE_PI = 3.0; AQUI N � POSS�VEL ALTERAR O VALOR DA VARI�VEL "VALOR_DE_PI" POR CAUSA DO QUALIFICADOR FINAL.
		
		
		System.out.println(VALOR_DE_PI);
		//System.out.println(teste);
		System.out.println(novoShortByte);
		System.out.println(novoShort);
		System.out.printf(_$c + d);
		/*System.out.print(a);
		System.out.println(b);
		System.out.println(letraUnica);*/
		}
}
//Ctrl + Alt + seta p baixo/cima duplica a linha!

