package br.ufjf.projetosooufjf.exercicios;

import java.util.Scanner;

public class Exercicio01_Float {

	public static void main(String[] args) {
		float valor1, valor2, valor3; //Dados de entrada
		float media; // variável média
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		System.out.print("Informe o valor 1: ");
    	valor1 = teclado.nextFloat();
    	System.out.print("Informe o valor 2: ");
    	valor2 = teclado.nextFloat();
    	System.out.print("Informe o valor 3: ");
    	valor3 = teclado.nextFloat();
    	media = (valor1+valor2+valor3)/3;
    	System.out.println("O valor da média é: " + media);
	}
}
