package modelo;

public class Cuadrado extends Figura{
	
	private int lado;
	
	

	public Cuadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}
	
	

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}



	@Override
	public double area() {
		return this.lado*this.lado;
	}

	@Override
	public boolean esIgual(Figura a) {
		if (a instanceof Cuadrado) {
			Cuadrado c = (Cuadrado) a;
			return super.esIgual(c) && this.lado==c.lado;
		}
		return false;
	}



	@Override
	public String toString() {
		return "Cuadrado [getX()=" + getX() + ", getY()=" + getY() + ", lado=" + lado + "]";
	}



	



	

	
	
	
}
