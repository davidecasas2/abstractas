package modelo;
public abstract class Figura {

	private int x;
	private int y;
	
	
	public Figura(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public Figura() {
		this.x=0;
		this.y=0;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
	public abstract double area();
	
	public boolean esIgual(Figura a) {
		if (this.x==a.x && this.y==a.y) {
			return true;
		}
		return false;
		
		//return this.x==a.x && this.y==a.y;
	}
	
	
	 
}
