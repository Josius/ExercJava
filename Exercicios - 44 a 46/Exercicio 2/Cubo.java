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
	
	public int getAresta(){
		return aresta;
	}
	public void setAresta(int aresta){
		this.aresta = aresta;
	}
	
	public void calcularVolume(){
		volume = area*aresta;
	}
	public void calcularArea(){
		area = aresta*aresta;
	}
}
