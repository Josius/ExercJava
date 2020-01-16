public class E35OO2{
	public static int somatorio(int num){
		
		if(num==0){
			return 0;
		}
		//Loiane
		/*
		if(num==1){
			return 0;
		}
		*/
		return num + somatorio(num-1);
		
		
	}
}