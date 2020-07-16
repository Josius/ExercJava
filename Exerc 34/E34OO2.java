//Exercicio 2 - Calculadora

public class E34OO2{
	
	public static double soma(double num1, double num2){
		return num1+num2;
	}
	
	public static double subtracao(double num1, double num2){
		return num1-num2;
	}
	
	public static double multiplicacao(double num1, double num2){
		return num1*num2;
	}
	
	public static double divisao(double num1, double num2){
		return num1/num2;
	}
	
	public static int potencia(int num1, int num2){
		int cont = num2;
		int num=1;
		do{
			num *= num1;
			cont--;
		}while(cont!=0);
		return num;
	}

}

//RESOLUCAO LOIANE

public class E34OO2{
	public static int somar(int num1, int num2){
		return num1+num2;
	}
	
	public static int subtrair(int num1, int num2){
		return num1-num2;
	}
	
	public static int multiplicar(int num1, int num2){
		return num1*num2;
	}
	
	public static int dividir(int num1, int num2){
		return num1/num2;
	}
	
	public static int potencia(int num1, int num2){
		//return Math.pow(num1, num2);
		
		int total = 1;
		for(int i=1; i<num2; i++){
			total *= num1;
		}
		return total;
	}
	
}
