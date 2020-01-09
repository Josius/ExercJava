//Exercicio 5 - Conversão de Unidades de Volumes

public class E34OO5{
	public static double centCubico;
	private static double milLitros;
	private static double pesCubicos;
	private static double polCubicas;
	private static double tresMilLitros;
	
	public static double ltPctCub(double num){
		centCubico = 1000.0; //centimetros cubicos
		return num*centCubico;
	}
	public static double mtCubPlt(double num){
		milLitros = 1000.0; //litros
		return num*milLitros;
	}
	public static double mtCubPpesCub(double num){
		pesCubicos = 35.32; //pes cubicos
		return num*pesCubicos;
	}
	public static double glAmPpolCub(double num){
		polCubicas = 231.0; //polegadas cubicas
		return num*polCubicas;
	}
	public static double glAmPlt(double num){
		tresMilLitros = 3785.0; //litros
		return num*tresMilLitros;
	}
}