//Exercicio 1 - Contador

public class E34OO1{
	private static int cont;
	
	public E34OO1(){
		cont++;
	}
	
	public int getCont(){
		return cont;
	}
	public void setCont(int cont){
		this.cont = cont;
	}
		
	public void zerar(){
		setCont(0);
	}
	public void incrementar(){
		this.cont++;
	}
	public void retornar(){
		System.out.println(getCont());
	}	
}

//RESOLUCAO LOIANE
public class E34OO1{
	
	private static int cont;
	//Com este construtor, ficou semelhante a minha resolucao
	public E34OO1(){
		cont++;
	}
	
	public static void incrementar(){
		cont++;
	}
	public static void zerar(){
		cont=0;
	}
	public static int obterValor(){
		return cont;
	}
	
}
