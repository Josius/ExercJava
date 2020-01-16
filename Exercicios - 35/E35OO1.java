public class E35OO1{
	//Errado
	/*
	public static int fibo(int num){
		if(num < 2){
			return num;
		}
		return fibo(num-1) + fibo(num-2);
	}
	*/
	
	//CORRETO - LOIANE
	public static int fibonacci(int num){
		
		if(num<2){
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
}