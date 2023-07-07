package org.generation.livecoding3;

public class MangosNaranjas {
	private int mangos;
	private int naranjas;
	
	public  void imprimir() {

	
		
		int numMangosCaja = 2;
		int numNaranjasCaja =4;
		
		int cajasMango= mangos/numMangosCaja;
		
		
		int cajasNaranja= naranjas/numNaranjasCaja;
	
		
		int cajasTotales	= cajasMango+cajasNaranja;
		System.out.println("El número de cajas total es: "+cajasTotales);
		System.out.println("El número de mangos en una caja es:"+numMangosCaja);
		System.out.println("El número de naranjas en una caja es:"+numNaranjasCaja);

		

	}
	
	
	
	//constructor:
	public MangosNaranjas(int mangos, int naranjas) {
		super();
		this.mangos = mangos;
		this.naranjas = naranjas;
	}
	//toString
	@Override
	public String toString() {
		return "MangosNaranjas [mangos=" + mangos + ", naranjas=" + naranjas + "]";
	}

	//getters and setters
	public int getMangos() {
		return mangos;
	}

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}

	public int getNaranjas() {
		return naranjas;
	}

	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}






}

/*
En este reto reforzaras tus conocimientos en Java, manejando ciclos, condicionales y recibir e imprir datos por consola.

1.- Construye un programa que pida por consola 2 números. El número de mangos y el número de naranjas.

2.- Debes de meter esos mangos y naranjas en cajas.

3.- El número de mangos en cada caja debe ser el mismo. El número de naranjas en cada caja debe ser el mismo.

4.- El número de cajas debe ser el máximo posible.

5.- Debes imprimir el número de cajas, el número de mangos por cajas y el número de naranjas por cajas.

6.- Debes escribir el código en una clase llamada MangosNaranjas que tenga dos atributos: mangos, naranjas, 
y por lo menos un método imprimir. Debe recibir por el constructor los parametros de el número de mangos y el número de naranjas.

7.- En una clase Main, debes crear un objeto de dicha clase para imprimir el resultado.

Ejemplo:
Entradas: 12028 12772
Salida: El número de cajas es: 124 El número de mangos en una caja es: 103 El número de naranjas en una caja es: 97
*/