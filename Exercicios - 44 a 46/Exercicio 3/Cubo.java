public class Cubo extends Figura3D{
	private double aresta;
	private double area;
	private double volume;

	public double getVolume(){
		return volume;
	}

	public double getArea(){
		return area;
	}
	
	public double getAresta(){
		return aresta;
	}
	public void setAresta(double aresta){
		this.aresta = aresta;
	}
	
	public void calcularVolume(){
		volume = area*aresta;
	}
	public void calcularArea(){
		area = aresta*aresta;
	}
	
	public String toString(){
		String s = "Area do Cubo: ";
		s += area;
		s += "\nVolume do Cubo: " + volume;
		return s;
	}
}
