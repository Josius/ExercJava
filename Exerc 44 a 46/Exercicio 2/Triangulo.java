public class Triangulo extends Figura2D{
	private double altura;
	private double base;
	private double area;

	public double getArea(){
		return area;
	}
	
	public int getBase(){
		return base;
	}
	public void setBase(int base){
		this.base = base;
	}
	
	public int getAltura(){
		return altura;
	}
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public void calcularArea(){
		area = (base*altura)/2
	}
	
	
}