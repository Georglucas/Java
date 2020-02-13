package Aluno;

import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double n1,n2,n3,media;
		System.out.println("Nota 1: ");
		n1=input.nextDouble();
		System.out.println("Nota 2: ");
		n2=input.nextDouble();
		System.out.println("Nota 3: ");
		n3=input.nextDouble();
		media = (n1+n3+n3)/3;
		System.out.printf  ("Media = %.2f",media);
		System.out.println  ();
		
		if (media<3)
			System.out.println("Aluno Reprovado.");
		else
			if(media<7)
			System.out.println("Aluno de exame.");
			else
				System.out.println("Parabéns você foi aprovado.");
		
	}

}
