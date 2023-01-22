package br.ufjf.projetosooufjf.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float larg_ter, prof_ter, lar_casa, prof_casa; //Dados de entrada
		float area_ter, area_casa, area_livre, percentagem; // variáveis area
		
		Scanner teclado = new Scanner(System.in); //Leitor do teclado
		teclado.useLocale(Locale.US); // setar o locale
		
		System.out.print("Informe a largura do terreno : ");
		larg_ter = teclado.nextFloat();
		System.out.print("Informe a profundidade do terreno : ");
		prof_ter = teclado.nextFloat();
		area_ter = larg_ter * prof_ter;
		
		System.out.print("Informe a largura da casa : ");
		lar_casa = teclado.nextFloat();
		System.out.print("Informe a profundidade da casa : ");
		prof_casa = teclado.nextFloat();
		area_casa = lar_casa * prof_casa;
		
		area_livre = area_ter - area_casa;
		percentagem = (area_livre * 100)/area_ter;
		System.out.println("O valor da percentagem livre é: " + percentagem + " %");
		

	}

}
