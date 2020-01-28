public class Piramide extends Figura3D{
	private double areaBase;
	private double lado;
	private double altura;
	private double volume;

	public double getVolume(){
		return volume;
	}

	public double getAreaBase(){
		return areaBase;
	}
	
	public double getLado(){
		return lado;
	}
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public int getAltura(){
		return altura;
	}
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public void calcularVolume(){
		volume = areaBase*altura;
	}
	public void calcularArea(){
		areaBase = lado*lado;
	}
}