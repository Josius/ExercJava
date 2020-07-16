public class Calcular{
	private double valorX;
	private double valorY;
	private double resultado;
	
	public double somar(double valorX, double valorY){
		resultado = valorX + valorY;
		return resultado;
	}
	public double subtrair(double valorX, double valorY){
		resultado = valorX - valorY;
		return resultado;
	}
	public double multiplicar(double valorX, double valorY){
		resultado = valorX * valorY;
		return resultado;
	}
	public double dividir(double valorX, double valorY){
		resultado = valorX / valorY;
		return resultado;
	}
	
	public String toString(){
		String s = "Resultado eh " + resultado;
		return s;
	}
}