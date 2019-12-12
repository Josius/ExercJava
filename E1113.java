//EXERCICIOS AULAS 11 A 13
import java.util.Scanner;

public class E1113{
	
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
/*		
		//1
		System.out.println("\"Alo mundo\"\n");
		
		//2
		//Scanner ent = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double num = new Scanner(System.in).nextDouble();
	
		System.out.println("O numero informado foi: " + num + "\n");
		
		//3
		//int num1, num2;
		double num1, num2;
		System.out.println("Informe um num1:");
		num1 = ent.nextDouble();
		System.out.println("Informe um num2:");
		num2 = ent.nextDouble();
		
		double resultado = num1 + num2;
		
		System.out.println("A soma de num1 mais num2 eh: " + resultado + "\n");
		
		//4
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Digite as 4 notas bimestrais:");
		nota1 = ent.nextDouble();
		nota2 = ent.nextDouble();
		nota3 = ent.nextDouble();
		nota4 = ent.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4.0);
		
		System.out.printf("A media bimestral eh: %.2f \n\n", media);
		
		//5
		
		System.out.println("Digite a quantidade de metros:");
		
		double metros = ent.nextDouble();
		
		double conversor = metros * 100.0;
		
		System.out.printf("A quantidade de metros em centimetros eh: %.0f" + "cm \n\n", conversor );
		
		
		//6
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = ent.nextDouble();
		
		double areaCirc = (Math.PI*(raio * raio));
		//double areaCirc = Math.PI * Math.pow(raio, 2); outra forma de calcular.
		
		System.out.printf("O valor da area do circulo eh: %.2f \n\n", areaCirc);
		
		
		//7
		System.out.println("Digite o valor do lado do quadrado:");
		
		double ladoQ = ent.nextDouble();
		double areaQ = ladoQ*ladoQ;//double areaQ = Math.pow(ladoQ, 2);
		//double dobroAreaQ = 2.0*areaQ;
		
		System.out.printf("A area do quadrado eh: %.2f %n", areaQ);
		System.out.printf("O dobro da area do quadrado eh: %.2f \n\n", (areaQ * 2));
	

		//8
		System.out.print("Quanto voce ganha por hora? \nR$: ");
		double horaTrab = ent.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		int horaMes = ent.nextInt();
		
		double salario = horaTrab * horaMes;
		
		System.out.printf("Seu salario deste mes eh: R$ %.2f  \n\n", salario);
	

		//9
		System.out.println("Digite a temperatura em Farenheit:");
		
		double faren = ent.nextDouble();
		
		double celsius = ((5.0*(faren - 32.0))/9.0);
		
		System.out.printf("A temperatura convertida em Celsius eh: %.2f graus Celsius\n\n", celsius);
	
	
		//10
		System.out.println("Digite a temperatura em Celsius:");
		
		double cels = ent.nextDouble();
		
		double farenheit = (((9.0*cels)/5.0)+32.0);
		
		System.out.printf("\nA temperatura convertida em Farenheit eh: %.2f graus Farenheit\n\n", farenheit);
		
	
		//11
		System.out.println("Digite dois numeros inteiros e um real:");
		
		int n1 = ent.nextInt();
		int n2 = ent.nextInt();
		double n3 = ent.nextDouble();
		
		double result1 = (2.0*n1)*n2/2.0;
		double result2 = (3.0*n1) + n3;
		//double result3 = (n3*n3*n3);
		double result3 = Math.pow(n3, 3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println();
		
	
		//12
		System.out.println("Digite sua altura:");
		
		double altura = ent.nextDouble();
		
		double pesoIdeal = ((72.7 * altura) - 58.0);
		
		System.out.printf("O peso ideal eh: %.2f Kg\n\n" , pesoIdeal);
		
	
	
		//13
		System.out.println("Quanto voce ganha por hora?");
		double porHora = ent.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		int horaPorMes = ent.nextInt();
		
		double salarioBruto = porHora*horaPorMes;
		double impostoRenda = (salarioBruto*11.0)/100.0;
		double descontoInss = (salarioBruto*8.0)/100.0;
		double sindicato = (salarioBruto*5.0)/100.0;
		double salarioLiquido = (salarioBruto -(impostoRenda + descontoInss + sindicato));
		
		System.out.printf("Salario Bruto= %.2f %n", salarioBruto);
		System.out.printf("Imposto de Renda= %.2f %n", impostoRenda);
		System.out.printf("INSS= %.2f %n", descontoInss);
		System.out.printf("Sindicato= %.2f %n", sindicato);
		System.out.printf("Salario Liquido= %.2f %n", salarioLiquido);
		System.out.println();
	

*/
		//14 
		System.out.print("Digite o tamanho do arquivo para download\nMB: ");
		double arquivoMb = ent.nextDouble();
		
		System.out.print("Digite a velocidade de download do link\nMbps: ");
		double velDown = ent.nextDouble();
		
		double tempo = arquivoMb / velDown;
		
		System.out.printf("O tempo aproximado para download eh: %.2f minutos", tempo);
		
		/*
		//convertendo arquivoMb para byte
		double mB = arquivoMb*1000000.0;
		
		//convertendo para byte
		double mbps = (velDown*1000000.0)/8.0;
		
		//tempo do download
		double tempoDown = arquivoMb/mbps;
		
		System.out.printf("O tempo aproximado para download eh: %.2f", tempoDown);
		*/
		
	}
	
	
}
















