import java.util.Scanner;

public class E34OOExec{
	//EXERCICIO 1 - MINHA RESOLUCAO
	/*
	public static void main(String[] args){
		
		E34OO1 cont = new E34OO1();
		cont.retornar();
		E34OO1 cont1 = new E34OO1();
		cont.retornar();
		E34OO1 cont2 = new E34OO1();
		cont.retornar();
		E34OO1 cont3 = new E34OO1();
		cont.retornar();
		cont.retornar();
		
		cont.incrementar();
		cont.incrementar();
		cont.incrementar();
		cont.retornar();
		
		cont.retornar();
		
		cont.zerar();
		cont.retornar();
	}*/
	//RESOLUCAO LOIANE
	/*
	static void imprimirValor(){
		System.out.println(E34OO1.obterValor());
	}
	
	public static void main(String[] args){
		imprimirValor();
		E34OO1.incrementar();
		imprimirValor();
		
		E34OO1.zerar();
		imprimirValor();
		
		E34OO1.incrementar();
		E34OO1.incrementar();
		E34OO1.incrementar();
		imprimirValor();
		
		//Resolucao semelhante a minha
		E34OO1 c1 = new E34OO1();
		E34OO1 c2 = new E34OO1();
		E34OO1 c3 = new E34OO1();
		imprimirValor();
	}
	*/
	
	//EXERCICIO 2 - MINHA RESOLUCAO
	/*
	static int resultA;
	static double resultB;
	
	static void imprimirValorA(){
		System.out.println(resultA);
	}
	static void imprimirValorB(){
		System.out.println(resultB);
	}
	
	public static void main(String[] args){

		resultA = E34OO2.potencia(2, 5);
		imprimirValorA();
		resultA = E34OO2.potencia(5, 2);
		imprimirValorA();
		resultB = E34OO2.soma(1, 2);
		imprimirValorB();
		resultB = E34OO2.soma(2, 3);
		imprimirValorB();
		resultB = E34OO2.subtracao(4, 5);
		imprimirValorB();
		resultB = E34OO2.subtracao(5, 4);
		imprimirValorB();
		resultB = E34OO2.multiplicacao(6, 7);
		imprimirValorB();
		resultB = E34OO2.multiplicacao(8, 9);
		imprimirValorB();
		resultB = E34OO2.divisao(4, 2);
		imprimirValorB();
		resultB = E34OO2.divisao(2, 4);
		imprimirValorB();
		
	}
	*/
	//RESOLUCAO LOIANE
	/*
	public static void main(String[] args){
		imprimirTela(E34OO2.somar(1, 2));
		imprimirTela(E34OO2.subtrair(2, 1));
		imprimirTela(E34OO2.multiplicar(2, 2));
		imprimirTela(E34OO2.dividir(4, 2));
		imprimirTela(E34OO2.potencia(2, 3));
	}
	
	static void imprimirTela(int num){
		System.out.println(num);
	}
	*/
	
	//EXERCICIO 3 - MINHA RESOLUCAO com impressao S.O.P. melhorado
	/*
	public static void main(String[] args){
		imprimir(E34OO3.fatorial(0));
		imprimir(E34OO3.fatorial(1));
		imprimir(E34OO3.fatorial(2));
		imprimir(E34OO3.fatorial(3));
		imprimir(E34OO3.fatorial(4));
		imprimir(E34OO3.fatorial(5));
		imprimir(E34OO3.fatorial(6));
		imprimir(E34OO3.fatorial(7));
		imprimir(E34OO3.fatorial(8));
		imprimir(E34OO3.fatorial(9));
		imprimir(E34OO3.fatorial(10));
	}
	
	static void imprimir(int num){
		System.out.println(num);
	}*/
	//RESOLUCAO LOIANE
	/*
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do{
			System.out.println("Entre com um numero positivo");
			num = scan.nextInt();
			
			if(num < 0){
				System.out.println("Numero invalido. Entre novamente");
			}
			
		}while(num < 0);
		
		System.out.println(E34OO3.fatorial(num));
	}
	*/
	
	//EXERCICIO 4 - MINHA RESOLUCAO
	/*
	static void imprimir(double num){
		System.out.print(num);
	}
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		int opcao;
		double valor;
		boolean flag = false;
		
		System.out.println("Digite o tipo de conversão");
		do{
			
			System.out.println("1 - metros quadrados p/ pes quadrados\n2 - pes quadrados p/ centimetros quadrados\n3 - milha quadrada p/ acres\n4 - acre p/ pes quadrados");
			
			opcao = ent.nextInt();
			if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
				flag = true;
			}else{
				System.out.println("Numero invalido, digite novamente");
			}
		}while(!flag);
		
		System.out.println("Digite o valor a ser convertido");
		valor = ent.nextDouble();
		
		if(opcao == 1){
			imprimir(E34OO4.mtPPesQuad(valor));
			System.out.println(" Pes Quadrados");
		}else if(opcao == 2){
			imprimir(E34OO4.peQPCentQ(valor));
			System.out.println(" Centimetros Quadrados");
		}else if(opcao == 3){
			imprimir(E34OO4.milhaQPAcre(valor));
			System.out.println(" Acres");
		}else if(opcao == 4){
			imprimir(E34OO4.acrePPeQuad(valor));
			System.out.println(" Pes Quadrados");
		}		
	}
	*/
	//EXERCICIO 5 - MINHA RESOLUCAO
}