package ppal;

import modelo.Cuadrado;
import modelo.Figura;
import modelo.Triangulo;

public class PruebaFiguras {

	public static void main(String[] args) {
		
		Figura f = new Cuadrado(2,3, 5);
		Cuadrado c = new Cuadrado(2,3,5);
		
		System.out.println("Figura 1: "+f);
		System.out.println("Figura 2: "+c);
		
		System.out.println("f es igual a c: "+f.esIgual(c));
		System.out.println("c es igual a f: "+c.esIgual(f));
		
		Figura t = new Triangulo(2,7,4,3,5);
		System.out.println("l triangulo es "+t);
		System.out.println("f es igual a t?: "+f.esIgual(t));
		System.out.println("t es igual a f?: "+t.esIgual(f));
		
		
		
		
		
		
		
		
		
		

	}

}


