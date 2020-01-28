public class Circulo extends Figura2D{
	private double raio;
	private double area;

	public double getArea(){
		return area;
	}
	
	public double getRaio(){
		return raio;
	}
	public void setRaio(double raio){
		this.raio = raio;
	}
	
	public void calcularArea(){
		area = (raio*raio)*3.14;
	}

	public String toString(){
		String s = "Area do Circulo: ";
		s += area;
		return s;
	}
}