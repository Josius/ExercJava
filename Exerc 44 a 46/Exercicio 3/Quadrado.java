public class Quadrado extends Figura2D{
	private double lado;
	private double area;

	public double getArea(){
		return area;
	}
	public void setArea(double area){
		this.area = area;
	}
	
	public double getLado(){
		return lado;
	}
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public void calcularArea(){
		area = lado*lado;		
	}
	
	public String toString(){
		String s = "Area do Quadrado: ";
		s += area;
		return s;
	}
}