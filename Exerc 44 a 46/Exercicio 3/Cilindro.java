public class Cilindro extends Figura3D{
	private double raio;
	private double altura;
	private double areaBase;
	private double areaLateral;
	private double volume;

	public double getVolume(){
		return volume;
	}
	public double getAreaBase(){
		return areaBase;
	}
	public double getAreaLateral(){
		return areaLateral;
	}
	
	public double getRaio(){
		return raio;
	}
	public void setRaio(double raio){
		this.raio = raio;
	}
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void calcularVolume(){
		volume = areaBase + areaLateral;
	}
	public void calcularArea(){
		areaBase = 2*((raio*raio)*3.14);
	}
	public void calcularAreaLateral(){
		areaLateral = (2*3.14*raio)*altura;
	}
	
	public String toString(){
		String s = "Area do Cilindro: ";
		s += areaBase;
		s += "\nVolume do Cilindro: " + volume;
		return s;
	}
}