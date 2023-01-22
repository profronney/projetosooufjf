package br.ufjf.projetosooufjf.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float a, b, c ;
		float delta, x1, x2;
		
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		teclado.useLocale(Locale.US); // setar o locale
		
		System.out.print("Informe o valor de a: ");
		a = teclado.nextFloat();
		System.out.print("Informe o valor de b: ");
		b = teclado.nextFloat();
		System.out.print("Informe o valor de c: ");
		c = teclado.nextFloat();
		
		delta = (b*b) - (4*a*c);
		x1 = (float) ((-(b) + Math.sqrt(delta))/(2*a));
		x2 = (float) ((-(b) - Math.sqrt(delta))/(2*a));
		
		System.out.println("As raizes da equação são: " + x1 +  " e " + x2);

	}

}
