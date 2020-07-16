//Exercicio 3 -Fatorial

public class E34OO3{
	
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
	
	public static int fatorial(int num){
		if(num>1){
			int cont = num;
			int result = 1;
			do{
				result *= num--;
				cont--;
			}while(cont!=1);
			
			return result;
		}else{
			return 1;
		}
		
	}
}

//RESOLUCAO LOIANE
public class E34OO3{
	
	public static int fatorial(int num){
		if(num ==0){
			return 1;
		}
		int total = 1;
		for(int i=num; i>1; i--){
			total *= i;
		}
		return total;
	}
}