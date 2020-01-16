//Exercicio 6 - Conversão de Unidades de Tempo

public class E34OO6{
	public static double segundos;
	private static double minutos;
	private static double horas24;
	private static double dias7;
	private static double dias30;
	private static double diasAno;
	
	public static double minPseg(double num){
		segundos = 60.0; //segundos
		return num*segundos;
	}
	public static double horaPmin(double num){
		minutos = 60.0; //minutos
		return num*minutos;
	}
	public static double diaPhora(double num){
		horas24 = 24.00; //horas
		return num*horas24;
	}
	public static double semPdia(double num){
		dias7 = 7.0; //dias
		return num*dias7;
	}
	public static double mesPdia(double num){
		dias30 = 30.0; //dias
		return num*dias30;
	}
	public static double anoPdia(double num){
		diasAno = 365.25; //dias
		return num*diasAno;
	}
}