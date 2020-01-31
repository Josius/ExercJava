public class Teste{
	
	public static void main(String[] args){
		/*
		Calcular cal = new Calcular();
		Calcular cal1 = new Calcular();
		Calcular cal2 = new Calcular();
		Calcular cal3 = new Calcular();
		
		cal.somar(1.2, 2.3);
		cal1.subtrair(1.2, 2.3);
		cal2.multiplicar(1.2, 2.3);
		cal3.dividir(1.2, 2.3);
		
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
				
		for(int i=0; i<oper.length; i++){
			
			System.out.println(oper[i]);
		}
		
		System.out.println();
		
		for(Operacoes oper : Operacoes.values()){
			System.out.println(oper); 
		}
		*/
		
		double x = 2.0;
		double y = 3.0;
		
		for(Operacoes op : Operacoes.values()){
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
		
	}
}