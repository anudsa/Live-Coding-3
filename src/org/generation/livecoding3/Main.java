package org.generation.livecoding3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Se crea el scanner
		Scanner scanner = new Scanner(System.in);
		// Se piden los 2 números
		System.out.println("Inserte el número de mangos: ");
		int mangos = scanner.nextInt();
		System.out.println("Inserte el número de naranjas: ");
		int naranjas = scanner.nextInt();
		scanner.close();
		MangosNaranjas mangosnaranjas = new MangosNaranjas(mangos, naranjas);
		//se imprime
		mangosnaranjas.imprimir();
		
		}

}
