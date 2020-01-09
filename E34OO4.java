//Exercicio 4 - Conversão de Unidades de Areas

public class E34OO4{
	public static double mtQuadrado;
	private static double peQuadrado;
	private static double milha;
	private static double acre;
	
	//O construtor abaixo não funcionou. Não sei o motivo.
	/*
	public E34OO4(){
		mtQuadrado = 10.76; //em pes quadrados
		peQuadrado = 929; //em centimetros quadrados
		milha = 640; //acres
		acre = 43.560; //pes quadrados
	}*/
	
	public static double mtPPesQuad(double num){
		mtQuadrado = 10.76; //em pes quadrados
		return num*mtQuadrado;
	}
	public static double peQPCentQ(double num){
		peQuadrado = 929; //em centimetros quadrados
		return num*peQuadrado;
	}
	public static double milhaQPAcre(double num){
		milha = 640; //acres
		return num*milha;
	}
	public static double acrePPeQuad(double num){
		acre = 43.560; //pes quadrados
		return num*acre;
	}
	
}