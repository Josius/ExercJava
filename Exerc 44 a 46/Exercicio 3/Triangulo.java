public class Triangulo extends Figura2D{
	private double altura;
	private double base;
	private double area;

	public double getArea(){
		return area;
	}
	
	public double getBase(){
		return base;
	}
	public void setBase(double base){
		this.base = base;
	}
	
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void calcularArea(){
		area = (base*altura)/2;
	}
	
	public String toString(){
		String s = "Area do Triangulo: ";
		s += area;
		return s;
	}
	
}