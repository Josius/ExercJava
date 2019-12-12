//DECREMENTO UTILIZANDO UM UNICO CONTADOR 'i'
//		for(int i = 0; i < (vetorA.length/2); i++){
//			if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
//				palindromo = false;
//				break;
//			}
//		}
//NUMEROS ALEATORIOS
//(int)Math.round(Math.random()*1); explicação abaixo:
		//Math.random() > gera um numero double de 0 a 1 (0, 0.1, 0.2, 0.3 ... 0.999999... ...1.0).
		//Math.round() > arredonda o numero e retorna um double (0.4 == 0; 0.6 == 1).
		//(int) > converte o double em inteiro.
		//*1 eh para gerar o limite do numero randomico, se fosse ate 100, seria *100; se fosse ate 50, seria *50; etc..

//OPERADOR TERNALIO
//Substitui o if-else para coisas simples. Possui 3 operandos:
//1º '(vetorA[i] % 2 == 0)' 
//2º '? 1' 
//3º ': 0' 
//vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; 
		//Apos a operacao logica
		//'?' == if
		//':' == else
		//Ou seja, se o 'vetorA[i] % 2 == 0' ele recebe 1 (? 1), do contrario ele recebe 0 (: 0)	
import java.util.Scanner;
import java.text.DecimalFormat;

public class E19Array{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		
		//1
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0] = 5; B[0] = A[0];
		A[1] = 4; B[1] = A[1];
		A[2] = 3; B[2] = A[2];
		A[3] = 2; B[3] = A[3];
		A[4] = 1; B[4] = A[4];
		
		System.out.println(B[0]);
		System.out.println(B[1]);
		System.out.println(B[2]);
		System.out.println(B[3]);
		System.out.println(B[4]);
	*/
		//1 - Loiane
	/*	
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	*/	
		//2
	/*	
		int[] A = new int[8];
		int[] B = new int[8];
		
		A[0] = 18; B[0] = A[0]*2;
		A[1] = 17; B[1] = A[1]*2;
		A[2] = 1; B[2] = A[2]*2;
		A[3] = 51; B[3] = A[3]*2;
		A[4] = 14; B[4] = A[4]*2;
		A[5] = 13; B[5] = A[5]*2;
		A[6] = 2; B[6] = A[6]*2;
		A[7] = 3; B[7] = A[7]*2;
		
		for(int i = 0; i <= B.length; i++){
			System.out.println("B " + i + " eh: " + B[i]);
		}
	*/
		//2 - Loiane
	/*	
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	*/
		//3
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0] = 2; B[0] = A[0]*A[0];
		A[1] = 3; B[1] = A[1]*A[1];
		A[2] = 4; B[2] = A[2]*A[2];
		A[3] = 5; B[3] = A[3]*A[3];
		A[4] = 6; B[4] = A[4]*A[4];
		
		for(int i = 0; i < B.length; i++){
			System.out.println("B " + (i+1) + " eh:" + B[i]);
		}
	*/
		//3 - Loiane
	/*	
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	*/	
		//4
		//vetorB tem que ser double por conta do Math.sqrt receber double, ou pode-se usar '(int)Math.sqrt(vetorA[i])',
		//mas dessa forma ele retorna um inteiro, e não um double
	/*
		int[] A = new int[5];
		int[] B = new int[5];
		
		//elevado a 1/2
		A[0] = 9; B[0] = (int)Math.pow(A[0], 0.5);
		A[1] = 81; B[1] = (int)Math.pow(A[1], 0.5);
		//com sqrt
		A[2] = 144; B[2] = (int)Math.sqrt(A[2]);
		A[3] = 25; B[3] = (int)Math.sqrt(A[3]);
		A[4] = 64; B[4] = (int)Math.sqrt(A[4]);
		
		for(int i = 0; i < B.length; i++){
			System.out.println("B " + (i+1) + " eh: " + B[i]);
		}
	*/	
		//4 - Loiane
		//Com DecimalFormat
	/*	
		int[] vetorA = new int[3];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
	
		//DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			//System.out.print(df.format(vetorB[i]) + " ");
			System.out.printf("%.2f :", vetorB[i]);
		}
		System.out.println();
	*/
		//5
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0] = 2; B[0] = A[0]*0;
		A[1] = 8; B[1] = A[1]*1;
		A[2] = 7; B[2] = A[2]*2;
		A[3] = 6; B[3] = A[3]*3;
		A[4] = 5; B[4] = A[4]*4;
		
		for(int i = 0; i < B.length; i++){
			System.out.println("B " + (i+1) + " eh: " + B[i]);
		}
	*/
		//5 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i]*i;
		}
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
	
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	*/
		//6
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
		
		A[0] = 5; B[0] = 5; C[0] = A[0] + B[0];
		A[1] = 7; B[1] = 7; C[1] = A[1] + B[1];
		A[2] = 8; B[2] = 3; C[2] = A[2] + B[2];
		A[3] = 3; B[3] = 1; C[3] = A[3] + B[3];
		A[4] = 9; B[4] = 2; C[4] = A[4] + B[4];
		
		for(int i = 0; i < C.length; i++){
			System.out.println("C " + (i+1) + " eh: " + C[i]);
		}
	*/	
		//6 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor do vetor A " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.print("Entre com o valor do vetor B " + i + ": ");
			vetorB[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++){
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("C " + i + " eh: " + vetorC[i]);
		}
	*/	
		//7
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
		
		A[0] = 15; B[0] = 52; C[0] = A[0] - B[0];
		A[1] = 54; B[1] = 48; C[1] = A[1] - B[1];
		A[2] = 78; B[2] = 95; C[2] = A[2] - B[2];
		A[3] = 96; B[3] = 35; C[3] = A[3] - B[3];
		A[4] = 35; B[4] = 73; C[4] = A[4] - B[4];
		
		for(int i = 0; i < C.length; i++){
			System.out.println("O valor de C = " + A[i] + " - " + B[i] + " = " + C[i]);
		}
	*/
		//7 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor do vetor A " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.print("Entre com o valor do vetor B " + i + ": ");
			vetorB[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++){
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("C " + i + " eh: " + vetorC[i]);
		}
	*/	
		//8
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
		
		A[0] = 15; B[0] = 52; C[0] = A[0] * B[0];
		A[1] = 54; B[1] = 48; C[1] = A[1] * B[1];
		A[2] = 78; B[2] = 95; C[2] = A[2] * B[2];
		A[3] = 96; B[3] = 35; C[3] = A[3] * B[3];
		A[4] = 35; B[4] = 73; C[4] = A[4] * B[4];
		
		for(int i = 0; i < C.length; i++){
			System.out.println("O valor de C = " + A[i] + " X " + B[i] + " = " + C[i]);
		}
	*/
		//8 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor do vetor A " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.print("Entre com o valor do vetor B " + i + ": ");
			vetorB[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++){
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("C " + i + " eh: " + vetorC[i]);
		}
	*/	
		//9
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		int[] C = new int[5];
		
		A[0] = 15; B[0] = 52; C[0] = A[0] / B[0];
		A[1] = 54; B[1] = 48; C[1] = A[1] / B[1];
		A[2] = 78; B[2] = 95; C[2] = A[2] / B[2];
		A[3] = 96; B[3] = 35; C[3] = A[3] / B[3];
		A[4] = 35; B[4] = 73; C[4] = A[4] / B[4];
		
		for(int i = 0; i < C.length; i++){
			System.out.println("O valor de C = " + A[i] + " / " + B[i] + " = " + C[i]);
		}
	*/
		//9 - Loiane
	/*	
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor do vetor A " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.print("Entre com o valor do vetor B " + i + ": ");
			vetorB[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++){
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.printf(" C " + " eh: %.2f", vetorC[i]);
		}
	*/
		//10
	/*	
		int[] A = new int[5];
		int[] B = new int[5];
		
		A[0] = 15; B[0] = A[0] % 2;
		A[1] = 54; B[1] = A[1] % 2;
		A[2] = 78; B[2] = A[2] % 2;
		A[3] = 96; B[3] = A[3] % 2;
		A[4] = 35; B[4] = A[4] % 2;
		
		for(int i = 0; i < B.length; i++){
			System.out.println("O valor de B = " + B[i]);
		}
	*/
		//10 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor do vetor A " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i] % 2;
		}

		for(int i = 0; i < vetorA.length; i++){
			System.out.println("B " + i + " eh: " + vetorB[i]);
		}
	
	*/
		//11
	/*	
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um numero para o Array " + (i+1) + ": ");
			A[i] = ent.nextInt();
		}
		
		for(int j = 0; j < A.length; j++){
			if(A[j] % 2 == 0){
				System.out.println("O Array " + (j+1) + " eh par, seu valor eh: " + A[j]);
			}
			
		}
	*/	
		//11 - Loiane
	/*	
		int[] vetorA = new int[10];
		int qtdPar = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor para o vetor A na posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				qtdPar++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtde numeros pares: " + qtdPar);
	*/	
	
		//12
		// identico da loiane
	/*	
		int[] A = new int[10];
		int soma = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite o valor de A " + (i+1) + ": ");
			A[i] = ent.nextInt();
			soma += A[i];
		}
		
		System.out.println("A soma de todos os elementos do Array eh: " + soma);
	*/	
		//13
		// identico da loiane
	/*	
		int[] A = new int[10];
		int soma = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o Array " + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] % 5 == 0){
				soma += A[i];
			}			
		}
		System.out.println("Soma eh: " + soma);
	*/	
		//14
		// identico da loiane
	/*	
		int[] A = new int[10];
		double soma = 0;
		int div = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite o valor de A " + i + ": ");
			A[i] = ent.nextInt();
			if(A[i] %2 != 0){
				soma += A[i];
				div++;
			}
		}
		
		System.out.println("A media aritmetica dos numeros impares eh: " + soma/div);
	*/	
		//15
	/*	
		int[] A = new int[10];
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o Array " + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] % 2 == 0){
				par++;
			}else{
				impar++;
			}	
		}
		
		System.out.println("O percentual de elementos pares eh: " + (par*100)/10 + "%");
		System.out.println("O percentual de elementos impares eh: " + (impar*100)/10 + "%");
	*/	
		//15 - Loiane
	/*	
		int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posicao " + i);
            vetorA[i] = ent.nextInt();
        }
        
        int impar = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                impar++;
            }
        }
        
        int par = vetorA.length - impar;
        
        //vetorA.length - 100%
        //par           - x
        //= x*vetorA.length == par * 100
        //= x == (par * 100)/vetorA.length
        double porcPar = (par * 100)/vetorA.length;
        double porcImpar = 100 - porcPar;
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porcentagem Pares: " + porcPar);
        System.out.println("Porcentagem Impares: " + porcImpar);
	*/	
		//16
		//semelhante da Loiane
	/*	
		int[] A = new int[10];
		int menor = 0;
		int igual = 0;
		double maior = 0;
		double div = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o Array " + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] < 15){
				menor += A[i];
			}else if(A[i] == 15){
				igual++;
			}else {
				div++;
				maior += A[i];
				
			}
		}
		
		System.out.println("A soma dos numeros menores que 15 eh: " + menor);
		System.out.println("A quantidade de elementos iguais que 15 eh: " + igual);
		System.out.printf("A media dos elementos maiores que 15 eh: %.2f \n", maior/div);
	*/
		//17
		//semelhante da Loiane
	/*	
		int[] A = new int[10];
		int menor = 0;
		int maior = 0;
		
		for(int i = 0; i< A.length; i++){
			System.out.print("Digite a idade " + (i+1) + ": ");
			A[i] = ent.nextInt();
			if(A[i] > 35){
				maior++;
			}
		}
		
		System.out.print("A quantidade de pessoas com idade superior a 35 anos eh : " + maior);
	*/	
		//18
	/*	
		int[] A = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite a idade " + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] > maior){
				maior = A[i];
				posMaior = i+1;
			}
			if(A[i] < menor){
				menor = A[i];
				posMenor = i+1;
			}	
		}
		
		System.out.println("A menor idade eh :" + menor + " e a posicao do array eh: " + posMenor);		
		System.out.println("A maior idade eh :" + maior + " e a posicao do array eh: " + posMaior);
	*/
		//18 - Loiane
	/*	
		int[] idades = new int[10];
		
		for(int i = 0; i < idades.length; i++){
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idades[i] = ent.nextInt();
		}
		
		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = 0;
		
		for(int i = 1; i < idades.length; i++){
			if(idades[i] > maior){
				maior = idades[i];
				indexMaior = i;
			}else if(idades[i] < menor){
				menor = idades[i];
				indexMenor = i; 
			}
		}
		
		System.out.print("Vetor de idades = ");
		for(int i = 0; i < idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Indice menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maior);
		System.out.println("Indice maior idade: " + indexMaior);
	*/
		//19
	/*	
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas1.length];

		for(int i = 0; i < notas1.length; i++){
			System.out.print("Digite a nota 1 do aluno " + (i+1) + " : ");
			nota1[i] = ent.nextInt();
			System.out.print("Digite a nota 2 do aluno " + (i+1) + " : ");
			notas2[i] = ent.nextInt();
			
			results[i] = (notas1[i] + notas2[i])/2;
		}	
		
		for(int j = 0; j < notas1.length; j++){
			System.out.print("A media do aluno " + (j+1) + " eh: " + results[j] + "\n");
			
			if(results[j] >= 7){
				System.out.println("Aluno " + (j+1) + " foi aprovado.");
			}else{
				System.out.println("Aluno " + (j+1) + " foi reprovado.");
			}
		}
	*/
		//19 - Loiane
	/*	
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas1.length];

		for(int i = 0; i < notas1.length; i++){
			System.out.print("Entre com a nota 1 do aluno " + (i+1) + " : ");
			notas1[i] = ent.nextInt();
			
			System.out.print("Digite a nota 2 do aluno " + (i+1) + " : ");
			notas2[i] = ent.nextInt();
			
			results[i] = (notas1[i] + notas2[i])/2;
		}	
		
		System.out.println("Notas 1 = ");
		for(int i = 0; i < notas1.length; i++){
			System.out.print(notas1[i] + " ");
		}
		System.out.println();
		
		System.out.println("Notas 2 = ");
		for(int i = 0; i < notas1.length; i++){
			System.out.print(notas2[i] + " ");
		}
		System.out.println();
		
		System.out.println("Resultados = ");
		for(int i = 0; i < results.length; i++){
			if(results[i] >= 7){
				System.out.println(results[i] + " - Aprovados");
			}else{
				System.out.println(results[i] + " - Reprovados");
			}
		}
	*/	
		//20
	/*	
		double dolarReal = 3.78;
		
		double[] A = new double[21];
		
		for(int i = 1; i < A.length; i++){
			A[i] = i*dolarReal;
			System.out.printf(i + " dolar = %.2f \n", A[i]);
		}
	*/	
		//20 - Loiane
	/*	
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotacao do dolar: ");
		cotacao = ent.nextDouble();

		for(int i = 0; i < vetorA.length; i++){
			vetorA[i] = cotacao*(i+1);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.printf("%.2f  ", vetorA[i]);
		}
	*/	
		//21 > não existe
		//22
	/*	
		int[] A = new int[10];
		int varZero = 0;
		int varUm = 0;
		
		for(int i = 0; i < A.length; i++){
			A[i] = (int)Math.round(Math.random()*1);
			System.out.println(A[i]);
			
			if(A[i] == 0){
				varZero++;
			}
			if(A[i] == 1){
				varUm++;
			}
		}
		
		System.out.println();
		System.out.println("O percentual de numeros zeros eh: " + varZero*100/10 + "%");
		System.out.println("O percentual de numeros uns eh: " + varUm*100/10 + "%");
	*/	
		//22 - Loiane
	/*	
		int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;
        
        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);
            
            if (vetorA[i] == 0){
                qtd0++;
            } else {
                qtd1++;
            }
        }
        
        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;
        
        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porc 0 = " + porc0);
        System.out.println("Porc 1 = " + porc1);
	*/	
		//23
		//semelhante da Loiane
	/*	
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite uma valor para o Array " + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] % 2 != 0){
				break;
			}
		}
		
		for(int j = 0; j < A.length; j++){
			System.out.println("Vetor " + (j+1) + ": " + A[j]);
		}
	*/	
		//24
	/*	
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o vetor " + (i+1) + ": ");
			A[i] = ent.nextInt();
		}
		
		for(int j = 0, h = 9; j < A.length; j++, h--){
			if(A[j] == A[h]){
				System.out.println("Eh palindromo!"); break;
			}else{
				System.out.println("Nao eh palindromo!"); break;
			}
		}
		//abaixo, forma mais deselegante
		if(A[0] == A[9]){
			if(A[1] == A[8]){
				if(A[2] == A[7]){
					if(A[3] == A[6]){
						if(A[4] == A[5]){
							System.out.print("Eh palindromo!");
						}
					}
				}
			}
		}
		else{
			System.out.print("Nao eh palindromo!");
		}
	*/
		//24 - Loiane - Com decremento utilizando um unico contador 'i'.
	/*	
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Digite um valor para o vetor " + (i+1) + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		boolean palindromo = true;
		
		for(int i = 0; i < (vetorA.length/2); i++){
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if(palindromo){
			System.out.println("Palindromo");
		}else{
			System.out.println("Nao eh palindromo");
		}
	*/
		//25
	/*	
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o Vetor A-" + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] % 2 == 0){
				B[i] = 1;
			}
			if(A[i] % 2 != 0){
				B[i] = 0;
			}
		}
		for(int j = 0; j < A.length; j++){
			System.out.println("B-" + (j+1) + " = " + B[j]);
		}
	*/
		//25 - Loiane - Com operador ternálio
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com um numero para a posicao " + i + ": ");
			vetorA[i] = ent.nextInt();
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;			
		}
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	*/
		//26
		//semelhante da Loiane
	/*	
		int[] A = new int[10];
		int[] B = new int[vetorA.length];
		int[] C = new int[vetorA.length];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o vetor A-" + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			System.out.print("Digite um valor para o vetor B-" + (i+1) + ": ");
			B[i] = ent.nextInt();
		}
		
		for(int j = 0; j < A.length; j++){
			if(A[j] > B[j]){
				C[j] = 1;
			}
			else if(A[j] == B[j]){
				C[j] = 0;
			}
			else{
				C[j] = -1;
			}
			System.out.println("C-" + (j+1) + ": " + C[j]);
		}
	*/
		//27
		//semelhante da Loiane
	/*	
		int[] A = new int[10];
		char[] B = new char[A.length];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o vetor A-" + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			if(A[i] < 7){
				B[i] = 'a';
			}
			else if(A[i] == 7){
				B[i] = 'b';
			}
			else if(A[i] > 7 && A[i] < 10){
				B[i] = 'c';
			}
			else if(A[i] == 10){
				B[i] = 'd';
			}
			else if (A[i] > 10){
				B[i] = 'e';
			}
		}
		for(int j = 0; j < A.length; j++){
			System.out.println("B-" + (j+1) + " = " + B[j]);
		}
	*/	
		//28
	/*	
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0, j = 9; i < A.length; i++, j--){
			System.out.print("Digite um valor para o vetor A-" + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			B[j] = A[i];
		}
		for(int h = 0; h < A.length; h++){
			System.out.println("B " + (h+1) + " = " + B[h]);
		}
	*/	
		//28 - Loiane - Com decremento utilizando um unico contador 'i'.
	/*	
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++){
			System.out.print("Digite um valor para o vetor A-" + (i+1) + ": ");
			A[i] = ent.nextInt();
			
			B[A.length - 1 - i] = A[i];
		}
		for(int h = 0; h < A.length; h++){
			System.out.println("B " + (h+1) + " = " + B[h]);
		}
	*/
		//29
	/*
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[2*a.length];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Digite o vetor A-" + (i+1) + ": ");
			a[i] = ent.nextInt();
		}
		for(int i = 0; i < b.length; i++){			
			System.out.print("Digite o vetor B-" + (i+1) + ": ");
			b[i] = ent.nextInt();
		}
		for(int j = 0; j < a.length; j++){
			c[j] = a[j];
			
			System.out.println("C-" + (j+1) + " = " + c[j]);
		
		}
		for(int h = 10, k = 0; h < c.length; h++, k++){
		
			c[h] = b[k];
			System.out.println("C-" + (h+1) + " = " + c[h]);
			
		}
	*/
		//29 - Loiane
	/*	
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[2*a.length];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Digite o vetor A-" + (i+1) + ": ");
			a[i] = ent.nextInt();
			
			c[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++){			
			System.out.print("Digite o vetor B-" + (i+1) + ": ");
			b[i] = ent.nextInt();
			
			c[a.length + i] = b[i];
		}
		
		
		for(int h = 0; h < c.length; h++){
			System.out.println("C-" + (h+1) + " = " + c[h]);
		}
	*/
		//30
	/*	
		int[] a = new int[20];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Digite vetor A-" + (i+1) + ": ");
			a[i] = ent.nextInt();
			
			if(a[i] % 2 == 0){
				b[i] = a[i];
			}
			if(a[i] % 2 != 0){
				c[i] = a[i];
			}
		}
		for(int j = 0; j < a.length; j++){
			if(b[j] == 0){
				continue;
			}
			System.out.println("B " + (j+1) + " = " + b[j]);
		}
		for(int j = 0; j < a.length; j++){
			if(c[j] == 0){
				continue;
			}
			System.out.println("C " + (j+1) + " = " + c[j]);
		}
	*/
		//30 - Loiane
	/*	
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Digite vetor A-" + (i+1) + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		int posB = 0;
		int posC = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}else{
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i=0; i<posC; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
	*/
		//31
	/*
		int[] a = new int[20];
		int[] b = new int[a.length];
		int h = 0;
		int l = 10;

		for(int i = 0; i < a.length; i++){
			System.out.print("Digite o vetor A-" + (i+1) + ": ");
			a[i] = ent.nextInt();
		}
		
		for(int j = 0; j < a.length; j++){
			if(a[j] % 2 == 0){
				b[h] = a[j];
				h++;
			}
		}
		
		for(int m = 0; m < a.length; m++){
			if(a[m] % 2 != 0){
				b[l] = a[m];
				l++;
			}
		}
		
		for(int k = 0; k < a.length; k++){
			System.out.println("B " + (k+1) + " = " + b[k]);			
		}
	*/	
		//31 - Loiane 
	/*	
		int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; //pares e impares
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        int posB = 0;
        
        for (int i=0; i<vetorA.length; i++){
            
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        for (int i=0; i<vetorA.length; i++){
            
            if (vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
	*/	
		//32
	
		int[] a = new int[5];
		double testTime = System.nanoTime();
		System.out.print(testTime);
		System.out.println();
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Informe o valor do vetor A-" + (i+1) + ": ");
			a[i] = ent.nextInt();
		}
		
		System.out.println("Tabuada do " + a[0] + ":");
		for(int j = 1; j <= 10; j++){
			System.out.println(j + "X" + a[0] + " = " + a[0]*j);
		}
		
		System.out.println("Tabuada do " + a[1] + ":");
		for(int j = 1; j <= 10; j++){
			System.out.println(j + "X" + a[1] + " = " + a[1]*j);
		}
		
		System.out.println("Tabuada do " + a[2] + ":");
		for(int j = 1; j <= 10; j++){
			System.out.println(j + "X" + a[2] + " = " + a[2]*j);
		}
		
		System.out.println("Tabuada do " + a[3] + ":");
		for(int j = 1; j <= 10; j++){
			System.out.println(j + "X" + a[3] + " = " + a[3]*j);
		}
		
		System.out.println("Tabuada do " + a[4] + ":");
		for(int j = 1; j <= 10; j++){
			System.out.println(j + "X" + a[4] + " = " + a[4]*j);
		}
		double testTime2 = System.nanoTime();
		System.out.println(testTime2);
		
		double end = testTime2 - testTime;
		System.out.println("res " + end);

		//32 - Loiane - Com 'for' aninhado.
	/*	
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com o valor da posicao A - " + i);
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Tabuada de " + vetorA[i]);
		
			for(int j = 1; j <= 10; j++){
				System.out.println(j + " X " + vetorA[i] + " = " + (vetorA[i] * j));
			
			}
			System.out.println();
		}
	*/	
		//33 - Não sei o que acontece.
		//talvez fazer com do-while + uma flag
	/*	
		int[] array = new int[3];
		int[] brray = new int[3];
		int[] crray = new int[3];
		
		int b = 0;
		int res = 0;
		int l = 0;
		int j = 1;
		int resultado;
		
		for(int i = 0; i < array.length; i++){
			System.out.print("Digite o valor do vetor " + (i+1) + ": ");
			array[i] = ent.nextInt();
		}
		
		for(; j <= array[l]; j++){
			
			resultado = array[l] % j;
			
			System.out.println("dividindo " + array[l] + " por " + j);
			if(array[l] % j == 0){
				res++;
				System.out.println("res++");
			}
			
			if(j == array[l]){
				l++;
				res = 0;
				j = 0;	
				if(res == 2){
					brray[l] = array[l];
				}	
				
			}
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.println("brray " + i + " = " + brray[i]);
		}
	*/	
		/*if(res == 2){
				System.out.println("agora");
				for(int k = 0; k <= array[l]; k++){
					if(res == 2){
						brray[l] = array[l];
						l++;
						res = 0;
						j = 0;	
						System.out.println("agora2");
						System.out.println("l = " + l);
						System.out.println("j = " + j);
					}
					
				}
			}
	*/
		
		//	System.out.println("res " + res);
	
		//33 - Loiane
		//possui um erro neste codido > ele identifica o numero '1' como primo.
	/*
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com o valor da posicao A - " + i);
			vetorA[i] = ent.nextInt();
		}
		
		boolean primo;
		String msg ;
		
		for(int i = 0; i < vetorA.length; i++){
			primo = true;
			for(int j = 2; j < vetorA[i]; j++){
				if(vetorA[i] % j == 0){
					primo = false;
					break;
				}
				
			}
			
			msg = "";
			if(primo){
				msg = " primo";
			}else{
				msg = " nao eh primo";
			}
			
			System.out.println(vetorA[i] + msg);
		}
	*/
		//34
	/*
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Informe valor de A - " + (i+1) + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("A " + (i+1) + " = " + vetorA[i]);
		}
		
		for(int i = 0; i < vetorA.length; i++){		
			if(vetorA[i] % 2 != 0){
				continue;				
			}
			System.out.println("A posicao A " + (i+1) + " = " + vetorA[i] + " eh par.");
		}
	*/
		//34 - Loiane
	/*		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Informe valor de A - " + (i+1) + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Analisando o numero " + vetorA[i] + ": ");
			
			for(int j = 2; j < vetorA[i]; j++){
				if(j % 2 == 0){
					System.out.println(j + " eh par");
				}
			}
			
			System.out.println();
		}
	*/	
		//35 - Loiane
	/*	
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Informe valor de A - " + (i+1) + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Analisando o numero " + vetorA[i] + ": ");
			
			for(int j = 1; j <= vetorA[i]; j++){
				if(vetorA[i] % j == 0){
					System.out.println(j + " eh divisor");
				}
			}
			
			System.out.println();
		}
	*/	
		//36 - Loiane
	/*	
		double[] vetorA = new double[11];
		
		for(int i = 0; i < vetorA.length; i++){
			vetorA[i] = Math.pow(2, i);
		}
		 
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
	*/	
		//37 - Loiane
	/*	
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.print("Entre com o valor da posicao A - " + i + ": ");
			vetorA[i] = ent.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			vetorB[i] = 1;
			
			for(int j = 1; j <= vetorA[i]; j++){
				vetorB[i] *= j;
			}
		}
		
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Vetor A: " + vetorA[i] + "- seu fatorial eh: " + vetorB[i]);
        }
        System.out.println();
	*/	
   	}
}