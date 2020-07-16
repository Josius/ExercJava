//EXERCICIOS AULAS 14 A 15
import java.util.Scanner;

public class E1415IfElse{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		//1
		
		double x, y;
		
		System.out.println("Digite dois numeros:");
		x = ent.nextDouble();
		y = ent.nextDouble();
		
		if(x > y){
			System.out.println("Este eh o maior numero dentre eles: " + x);
		}
		else{
			System.out.println("Este eh o maior numero dentre eles: " + y);
		}
	
		//2
		
		System.out.println("Digite um valor positivo ou negativo:");
		
		int valor = ent.nextInt();
		
		if(valor > 0){
			System.out.println("Positivo");
		}
		else if(valor < 0){
			System.out.println("Negativo");
		}
		else{
			System.out.println("Nulo");
		}
	
		//3
		//Usar 'equals' ao invés de '==' para Strigs
		//Usar 'equalsIgnoreCase' para tratar como igual letras maiúsculas e minúsculas
		//next serve para ler uma string(como exemplo, uma palavra)
		//nextLine serve para ler strings com espaço e tudo mais, até ocorrer uma quebra de linha
		//exemplo: "Testando Scanner" com .next() printa "Testando"
		//exemplo: "Testando Scanner" com .nextLine() printa "Testando Scanner"
		System.out.println("Digite seu sexo - F/f(feminino) ou M/m(masculino):");
		
		String sexo = ent.next();
		
		if("f".equalsIgnoreCase(sexo)){
			System.out.println("Sexo feminino");
		}
		else if("m".equalsIgnoreCase(sexo)){
			System.out.println("Sexo masculino");
		}
		else{
			System.out.println("Sexo invalido");
		}
	
		//4 - somente vogal e consoante sem acentuação
		
		System.out.println("Digite uma letra:");	
		
		
		String letra = ent.next();
		//1º tipo de solução
		if("a".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else if("e".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else if("i".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else if("o".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else if("u".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else {
			System.out.println("Consoante");
		}
		
		//2º tipo de solução > acho a melhor solução
		if("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra)
			|| "u".equalsIgnoreCase(letra)){
			System.out.println("Vogal");
		}
		else {
			System.out.println("Consoante");
		}
		*/
		//3º tipo de solução
		if(letra.length > 1){
			System.out.println("Nao eh uma letra valida.");
		}
		else{
			switch(letra){
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": 
			case "A": 
			case "E": 
			case "I": 
			case "O": 
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
			}
		}
		
		
		
		//5 com if-else
	
		System.out.print("Insira a primeira nota (0 a 10): ");
		double nota1 = ent.nextDouble();
		if(nota1 > 10.0){
			System.out.println("Valor invalido para primeira nota");
			System.out.println("Reinicie o programa");
			return;
		}
				
		System.out.print("Insira a segunda nota (0 a 10): ");
		double nota2 = ent.nextDouble();
		if(nota2 > 10.0){
			System.out.println("Valor invalido para segunda nota");
			System.out.println("Reinicie o programa");
			return;
		}
		
		double media = (nota1 + nota2)/2.0;
		
		if(media == 10.0){
			System.out.println("Aprovado com Distincao");
		}
		if(media >= 7.0 && media < 10.0){
			System.out.println("Aprovado");
		}
		if(media < 7.0){
			System.out.println("Reprovado");
		}
	
		//5 com switch > NÃO ACEITA DOUBLE
		
		System.out.print("Insira a primeira nota (0 a 10): ");
		int nota1 = ent.nextInt();
		
		System.out.print("Insira a segunda nota (0 a 10): ");
		int nota2 = ent.nextInt();
		
		int media = (nota1 + nota2)/2;
		switch(media){
			case 10: System.out.println("Aprovado com Distincao"); break;
			case 7: System.out.println("Aprovado"); break;
			default: System.out.println("Reprovado");
	
		//6
		
		System.out.println("Digite tres numeros:");
		
		double num1, num2, num3;
		
		num1 = ent.nextDouble();
		num2 = ent.nextDouble();
		num3 = ent.nextDouble();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O primeiro eh o maior numero dentre os tres: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("O segundo eh o maior numero dentre os tres: " + num2);
		}
		else if(num3 > num2 && num3 > num1){
			System.out.println("O terceiro eh o maior numero dentre os tres: " + num3);
		}
		else{
			System.out.println("Os tres numeros sao iguais.");
		}
	
		//7
		
		System.out.println("Digite tres numeros: ");
		
		double nu1, nu2, nu3;
		nu1 = ent.nextDouble();
		nu2 = ent.nextDouble();
		nu3 = ent.nextDouble();
		
		// a logica if-else do exercicio 8 também funciona, soh precisa de algumas alterações
		if(nu1 > nu2 && nu1 > nu3 && nu2 < nu3){
			System.out.println("O primeiro eh o maior numero: " + nu1 + "\nO segundo eh o menor numero: " + nu2);
		}
		else if(nu1 > nu2 && nu1 > nu3 && nu3 < nu2){
			System.out.println("O primeiro eh o maior numero: " + nu1 + "\nO terceito eh o menor numero: " + nu3);
		}
		else if(nu2 > nu1 && nu2 > nu3 && nu1 < nu3){
			System.out.println("O segundo eh o maior numero: " + nu2 + "\nO primeiro eh o menor numero: " + nu1);
		}
		else if(nu2 > nu1 && nu2 > nu3 && nu3 < nu1){
			System.out.println("O segundo eh o maior numero: " + nu2 + "\nO terceiro eh o menor numero: " + nu3);
		}
		else if(nu3 > nu2 && nu3 > nu1 && nu1 < nu2){
			System.out.println("O terceiro eh o maior numero: " + nu3 + "\nO primeiro eh o menor numero: " + nu1);
		}
		else if(nu3 > nu2 && nu3 > nu1 && nu2 < nu1){
			System.out.println("O terceiro eh o maior numero: " + nu3 + "\nO segundo eh o menor numero: " + nu2);
		}
	}
		
		//o código acima está incompleto, precisa levar em consideração outras variáveis como numeros iguais.
		
		//8
		System.out.println("Informe o valor de tres produtos:");
		System.out.print("Produto 1: ");
		double produto1 = ent.nextDouble();
		System.out.print("Produto 2: ");
		double produto2 = ent.nextDouble();
		System.out.print("Produto 3: ");
		double produto3 = ent.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3){
			System.out.println("Compre o produto 1 porque eh o mais barato.");
		}
		else if(produto2 <= produto1 && produto2 <= produto3){
			System.out.println("Compre o produto 2 porque eh o mais barato.");
		}
		else if(produto3 <= produto1 && produto3 <= produto2){
			System.out.println("Compre o produto 3 porque eh o mais barato.");
		}
		else{
			System.out.println("Compre qualquer um dos tres, pois possuem o mesmo valor.");
		}
	
		//9
		
		System.out.println("Informe tres numeros:");
		int n1 = ent.nextInt();
		int n2 = ent.nextInt();
		int n3 = ent.nextInt();
		
		if(n1 <= n2 && n2 <= n3){
			System.out.println("Ordem decrescente: " + n3 + ", " + n2 + ", "  + n1 + ".");
		}
		else if(n1 <= n3 && n3 <= n2){
			System.out.println("Ordem decrescente: " + n2 + ", " + n3 + ", " + n1 + ".");
		}
		else if(n2 <= n1 && n1 <= n3){
			System.out.println("Ordem decrescente: " + n3 + ", " + n1 + ", " + n2 + ".");
		}
		else if(n3 <= n1 && n1 <= n2){
			System.out.println("Ordem decrescente: " + n2 + ", " + n1 + ", " + n3 + ".");
		}
		else if(n2 <= n3 && n3 <= n1){
			System.out.println("Ordem decrescente: " + n1 + ", " + n3 + ", " + n2 + ".");
		}
		else if(n3 <= n2 && n2 <= n1){
			System.out.println("Ordem decrescente: " + n1 + ", " + n2 + ", " + n3 + ".");
		}
	
		//10
		
		System.out.print("Em qual turno voce estuda? Digite \'M\' para matutino, \'V\' para vestertino e \'N\' para noturno: ");
		String turno = ent.nextLine();
		
		if("M".equalsIgnoreCase(turno)){
			System.out.println("Bom dia!");
		}
		else if("V".equalsIgnoreCase(turno)){
			System.out.println("Boa tarde!");
		}
		else if("N".equalsIgnoreCase(turno)){
			System.out.println("Boa noite!");
		}
		else{
			System.out.println("Valor invalido!");
		}
		
		//com switch-case
		switch(turno){
			case "m":
			case "M": System.out.println("Bom dia!"); break;
			case "v":
			case "V": System.out.println("Boa tarde!"); break;
			case "n":
			case "N": System.out.println("Boa noite!"); break;
			default: System.out.println("Valor invalido!");
		}
	
		//11
	 
		System.out.print("Insira o valor do salario, R$ ");
		double salarioAnt = ent.nextDouble();
		double salario;
		if(salarioAnt <= 280.00){
			salario = (salarioAnt*20)/100;
			System.out.printf("Salario anterior R$: %.2f \n", salarioAnt);
			System.out.printf("Percentual de aumento: 20%% \n");
			System.out.printf("Valor do aumento R$: %.2f \n", salario);
			System.out.printf("Novo salario R$: %.2f \n", salarioAnt+salario);
		}
		else if(salarioAnt > 280.00 && salarioAnt <= 700.00){
			salario = (salarioAnt*15)/100;
			System.out.printf("Salario anterior R$: %.2f \n", salarioAnt);
			System.out.printf("Percentual de aumento: 15%% \n");
			System.out.printf("Valor do aumento R$: %.2f \n", salario);
			System.out.printf("Novo salario R$: %.2f \n", salarioAnt+salario);
		}
		else if(salarioAnt > 700.00 && salarioAnt <= 1500.00){
			salario = (salarioAnt*10)/100;
			System.out.printf("Salario anterior R$: %.2f \n", salarioAnt);
			System.out.printf("Percentual de aumento: 10%% \n");
			System.out.printf("Valor do aumento R$: %.2f \n", salario);
			System.out.printf("Novo salario R$: %.2f \n", salarioAnt+salario);
		}
		else if(salarioAnt > 1500.00){
			salario = (salarioAnt*5)/100;
			System.out.printf("Salario anterior R$: %.2f \n", salarioAnt);
			System.out.printf("Percentual de aumento: 5%% \n");
			System.out.printf("Valor do aumento R$: %.2f \n", salario);
			System.out.printf("Novo salario R$: %.2f \n", salarioAnt+salario);
		}
		//de uma forma mais elegante
		System.out.print("Insira o valor do salario, R$ ");
		double salarioAnt = ent.nextDouble();
		
		double percentual = 0.0;
		if(salarioAnt <= 280.00){
			percentual = 20.0;
		}
		else if(salarioAnt > 280.00 && salarioAnt <= 700.00){
			percentual = 15.0;
		}
		else if(salarioAnt > 700.00 && salarioAnt <= 1500.00){
			percentual = 10.0;
		}
		else if(salarioAnt > 1500.00){
			percentual = 5.0;
		}
		
		double aumento = (salarioAnt/100.0)*percentual;
		double salarioAjustado = salarioAnt + aumento;
		
		System.out.printf("Salario anterior R$: %.2f \n", salarioAnt);
		System.out.printf("Percentual de aumento: %.2f%% \n", percentual);
		System.out.printf("Valor do aumento R$: %.2f \n", aumento);
		System.out.printf("Novo salario R$: %.2f \n", salarioAjustado);
		
	
		//12
	
		System.out.print("Insira o valor da hora trabalhada: ");
		double horaTrab = ent.nextDouble();
		System.out.print("Insira quantidade de horas trabalhadas no mes: ");
		double horaNoMes = ent.nextDouble();
		
		double salarioBruto = horaTrab*horaNoMes;
		
		if(salarioBruto <= 900.00){
			System.out.printf("Salario Bruto      : R$ %.2f \n", salarioBruto);
			System.out.print("(-) IR              : R$ Isento\n");
			System.out.printf("(-) INSS(10%%)      : R$ %.2f \n", (salarioBruto*10)/100);
			System.out.printf("FGTS (11%%)         : R$ %.2f \n", (salarioBruto*11)/100);
			System.out.printf("Total de descontos : R$ %.2f \n", (salarioBruto*5)/100 + (salarioBruto*10)/100);
			System.out.printf("Salario Liquido    : R$ %.2f \n", salarioBruto - (salarioBruto*5)/100 + (salarioBruto*10)/100);
		}
		else if(salarioBruto > 900.00 && salarioBruto <= 1500.00){
			System.out.printf("Salario Bruto      : R$ %.2f \n", salarioBruto);
			System.out.printf("(-) IR (5%%)        : R$ %.2f \n", (salarioBruto*5)/100);
			System.out.printf("(-) INSS(10%%)      : R$ %.2f \n", (salarioBruto*10)/100);
			System.out.printf("FGTS (11%%)         : R$ %.2f \n", (salarioBruto*11)/100);
			System.out.printf("Total de descontos : R$ %.2f \n", (salarioBruto*5)/100 + (salarioBruto*10)/100);
			System.out.printf("Salario Liquido    : R$ %.2f \n", salarioBruto - (salarioBruto*5)/100 + (salarioBruto*10)/100);
		}
		else if(salarioBruto > 1500.00 && salarioBruto <= 2500.00){
			System.out.printf("Salario Bruto      : R$ %.2f \n", salarioBruto);
			System.out.printf("(-) IR (10%%)        : R$ %.2f \n", (salarioBruto*10)/100);
			System.out.printf("(-) INSS(10%%)      : R$ %.2f \n", (salarioBruto*10)/100);
			System.out.printf("FGTS (11%%)         : R$ %.2f \n", (salarioBruto*11)/100);
			System.out.printf("Total de descontos : R$ %.2f \n", (salarioBruto*5)/100 + (salarioBruto*10)/100);
			System.out.printf("Salario Liquido    : R$ %.2f \n", salarioBruto - (salarioBruto*5)/100 + (salarioBruto*10)/100);
		}
		else {
			System.out.printf("Salario Bruto      : R$ %.2f \n", salarioBruto);
			System.out.printf("(-) IR (20%%)        : R$ %.2f \n", (salarioBruto*20)/100);
			System.out.printf("(-) INSS(10%%)      : R$ %.2f \n", (salarioBruto*10)/100);
			System.out.printf("FGTS (11%%)         : R$ %.2f \n", (salarioBruto*11)/100);
			System.out.printf("Total de descontos : R$ %.2f \n", (salarioBruto*5)/100 + (salarioBruto*10)/100);
			System.out.printf("Salario Liquido    : R$ %.2f \n", salarioBruto - (salarioBruto*5)/100 + (salarioBruto*10)/100);
		}
		//de uma forma mais elegante
		System.out.print("Insira o valor da hora trabalhada: ");
		double horaTrab = ent.nextDouble();
		System.out.print("Insira quantidade de horas trabalhadas no mes: ");
		double horaNoMes = ent.nextDouble();
		
		double salarioBruto = horaTrab*horaNoMes;
		
		double percentualIR = 0;
		if(salarioBruto <= 900){
			percentualIR = 0;
		}
		else if(salarioBruto > 900 && salarioBruto <=  1500){
			percentualIR = 5;
		}
		else if(salarioBruto > 1500 && salarioBruto <= 2500){
			percentualIR = 10;
		}
		else if(salarioBruto > 2500){
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: (" + horaTrab + " * " + horaNoMes + "): " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%):" + ir);
		System.out.println("(-) INSS ( 10% ): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario Liquido: " + salarioLiquido);
	
		//13
		
		System.out.println("Entre com um dia da semana (1 a 7): ");
		int diaSemana = ent.nextInt();
		
		switch(diaSemana){
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terca"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sabado"); break;
			default:System.out.println("Valor invalido"); 
		}
	
		//14
		
		System.out.print("Insira a nota 1: ");
		double nota1 = ent.nextDouble();
		System.out.print("Insira a nota 2: ");
		double nota2 = ent.nextDouble();
		double media = (nota1 + nota2)/2;
		
		if(media <= 4.0){
			System.out.printf("Nota 1: %.2f \nNota 2: %.2f", nota1, nota2);
			System.out.printf("\nMedia: %.2f \n", media);
			System.out.println("Conceito E");
			System.out.println("REPROVADO");			
		}
		else if(media > 4.0 && media <= 6.0){
			System.out.printf("Nota 1: %.2f \nNota 2: %.2f", nota1, nota2);
			System.out.printf("\nMedia: %.2f \n", media);
			System.out.println("Conceito D");
			System.out.println("REPROVADO");			
		}
		else if(media > 6.0 && media <= 7.5){
			System.out.printf("Nota 1: %.2f \nNota 2: %.2f", nota1, nota2);
			System.out.printf("\nMedia: %.2f \n", media);
			System.out.println("Conceito C");
			System.out.println("APROVADO");			
		}
		else if(media > 7.5 && media <= 9.0){
			System.out.printf("Nota 1: %.2f \nNota 2: %.2f", nota1, nota2);
			System.out.printf("\nMedia: %.2f \n", media);
			System.out.println("Conceito B");
			System.out.println("APROVADO");			
		}
		else if(media > 9.0 && media <= 10.0){
			System.out.printf("Nota 1: %.2f \nNota 2: %.2f", nota1, nota2);
			System.out.printf("\nMedia: %.2f \n", media);
			System.out.println("Conceito A");
			System.out.println("APROVADO");			
		}
		//DE UMA FORMA MAIS ELEGANTE
		System.out.print("Insira a nota 1: ");
		double nota1 = ent.nextDouble();
		System.out.print("Insira a nota 2: ");
		double nota2 = ent.nextDouble();
		double media = (nota1 + nota2)/2;
		
		String aproveitamento = "";
		if(media >= 9 && media <= 10){
			aproveitamento = "A";
		}
		else if(media >= 7.5 && media < 9){
			aproveitamento = "B";
		}
		else if(media >= 6 && media < 7.5){
			aproveitamento = "C";
		}
		else if(media >= 4 && media < 6){
			aproveitamento = "D";
		}
		else if(media >= 0 && media < 4){
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch(aproveitamento){
			case "A": 
			case "B":
			case "C": System.out.println("APROVADO"); break;
			case "D":
			case "E": System.out.println("REPROVADO"); break;
		}
		
		//15
		//Math.abs() linha 396 é para calcular módulo: |a-b|
		
		System.out.print("Insira o valor de um lado do suposto triangulo: ");
		double lado1 = ent.nextDouble();
		System.out.print("Insira o valor de um lado do suposto triangulo: ");
		double lado2 = ent.nextDouble();
		System.out.print("Insira o valor de um lado do suposto triangulo: ");
		double lado3 = ent.nextDouble();
		
		double soma = lado2 + lado3;
		double subtracao = Math.abs(lado2 - lado3);
		
		if(lado1 < soma && lado1 > subtracao){
			System.out.println("Os valores informados podem formar um triangulo.");
		}
		if(lado1 == lado2 && lado2 == lado3){
			System.out.println("Triangulo equilatero");
		}
		else if(lado1 == lado2 && lado2 != lado3){
			System.out.println("Triangulo isosceles");
		}
		else if(lado1 != lado2 && lado2 == lado3){
			System.out.println("Triangulo isosceles");
		}
		else if(lado1 == lado3 && lado2 != lado3){
			System.out.println("Triangulo isosceles");
		}
		else{
			System.out.println("Triangulo escaleno");
		}
		
		//16
		
		System.out.println("Calulando raizes de uma equacao do segundo grau (ax^2 + bx + c):");
		System.out.print("Insira o valor para \'a\':");
		double varA = ent.nextDouble();
		if(varA == 0){
			System.out.println("Nao eh equacao do segundo grau.");
			return;
		}//ao inves de 'return;' poderia ter dado continuidade com 'else{continuaçaõ do codigo solicitanto b e c}'		
		System.out.print("Insira o valor para \'b\':");
		double varB = ent.nextDouble();
		System.out.print("Insira o valor para \'c\':");
		double varC = ent.nextDouble();
		
		//delta poderia ser assim:
		//double delta = (varB*varB) - (4*varA*varC);
		double delta = Math.pow(varB, 2);
		double delta2 = -4.0*varA*varC;		
		double delta3 = Math.pow((delta+delta2), 0.5);
		
		if(delta3 < 0){
			System.out.println("A equacao nao possui raizes reais.");
			System.exit(0);
		}
		else if(delta3 == 0){
			System.out.println("A equacao possui apenas uma raiz real.");
		}
		else if(delta3 > 0){
			System.out.println("A equacao possui duas raizes reais.");
		}
		
		double divisao = varA*2;
		double raiz1 = (-varB + delta3 )/divisao;
		double raiz2 = (-varB - delta3 )/divisao;
		
		System.out.printf("%.2f\n", raiz1);
		System.out.printf("%.2f\n", raiz2);
		
		//codigo mais elegante:
		
		System.out.println("Entre com o valor de a: ");
		int a = ent.nextInt();
		
		if(a == 0){
			System.out.println("Nao eh equacao do segundo grau");
		}
		else{
			System.out.println("Entre com o valor de b: ");
			int b= ent.nextInt();
			System.out.println("Entre com o valor de c: ");
			int c = ent.nextInt();
			
			double delta = (b*b) - (4*a*c);
			if(delta < 0){
				System.out.println("delta negativo");
			}
			else{
				System.out.println("delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	
		//17
		
		System.out.println("Insira o ano:");
		int ano = ent.nextInt();
		
		int div1 = ano % 4;
		int div2 = ano % 100;
		int div3 = ano % 1000;
		
		if(div1 == 0 && div2 != 0){
			System.out.println("Eh ano bissexto.");
		}
		else if(div1 == 0 && div2 == 0 && div3 == 0){
			System.out.println("Eh ano bissexto.");
		}
		else{
			System.out.println("Nao eh ano bissexto.");
		}
		
		//mais elegante
		
		System.out.println("Insira o ano: ");
		int ano = ent.nextInt();
		
		if((ano % 400 ==0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("Eh bissexto!");
		}
		else{
			System.out.println("Nao eh bissexto!");
		}
		
		//18
		
		System.out.println("Insira um numero:");
		int nume = ent.nextInt();
		
		int resultado = nume % 2;
		
		if(resultado == 0){
			System.out.println("O numero informado eh par");
		}
		else{
			System.out.println("O numero informado eh impar");
		}
		
		//mais elegante
		
		System.out.println("Insira o numero: ");
		int numero = ent.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("O numero informado eh par");
		}
		else{
			System.out.println("O numero informado eh impar");
		}
		
		
		//19
		//Ainda há erros, como divisao por 0;
		
		System.out.println("Qual operacao realizar; soma, sub, mult ou div?");
		String resp = ent.next();
		System.out.println("Insira o primeiro numero:");
		double numer1 = ent.nextDouble();
		System.out.println("Insira o segundo numero:");
		double numer2 = ent.nextDouble();
		
		
		double soma = numer1 + numer2;
		double subtracao = numer1 - numer2;
		double divisao = numer1 / numer2;
		double multiplicacao = numer1 * numer2;
		
		
		if("soma".equalsIgnoreCase(resp)){
			System.out.println("A soma eh: " + soma);
			if(soma % 2 == 0){
				System.out.println("O numero eh par");
			}
			else{
				System.out.println("O numero eh impar");
			}
			if(soma >0) {
				System.out.println("O numero eh positivo");
			}
			else{
				System.out.println("O numero eh negativo");
			}
		}
		else if("sub".equalsIgnoreCase(resp)){
			System.out.println("A subtracao eh: " + subtracao);
			if(subtracao % 2 == 0){
				System.out.println("O numero eh par");
			}
			else{
				System.out.println("O numero eh impar");
			}
			if(subtracao >0) {
				System.out.println("O numero eh positivo");
			}
			else{
				System.out.println("O numero eh negativo");
			}
		}
		else if("div".equalsIgnoreCase(resp)){
			System.out.println("A divisao eh: " + divisao);
			if(divisao % 2 == 0){
				System.out.println("O numero eh par");
			}
			else{
				System.out.println("O numero eh impar");
			}
			if(divisao >0) {
				System.out.println("O numero eh positivo");
			}
			else{
				System.out.println("O numero eh negativo");
			}
		}
		else if("mult".equalsIgnoreCase(resp)){
			System.out.println("A multiplicacao eh: " + multiplicacao);
			if(multiplicacao % 2 == 0){
				System.out.println("O numero eh par");
			}
			else{
				System.out.println("O numero eh impar");
			}
			if(multiplicacao >0) {
				System.out.println("O numero eh positivo");
			}
			else{
				System.out.println("O numero eh negativo");
			}
		}
		
		//mais elegante
		System.out.println("Entre com o primeiro numero: ");
		int num1 = ent.nextInt();
		System.out.println("Entre com o segundo numero: ");
		int num2 = ent.nextInt();

		System.out.println("Entre com a operacao (+ - / *): ");
		String operacao = ent.next();

		double resultado = 0;
		boolean valida = true;//FLAG = operacao que inicialmente é verdadeira, e somente se não for uma operacao valida, mudamos o valor dela.

		Switch(operacao){
			case "+": resultado = num1 + num2; break;
			case "-": resultado = num1 - num2; break;
			case "*": resultado = num1 * num2; break;
			case "/": resultado = num1 / num2; break;
			default: System.out.println("Operacao Invalida"); 
			valida = false;//FLAG = operacao que inicialmente é verdadeira, e somente se não for uma operacao valida, mudamos o valor dela.
		}

		if(valida){//FLAG: Se ela for false, o programa não entra neste if, caso contrário, entra.
			
			System.out.println("Resultado: " + resultado);
			
			if(resultado >= 0){
				System.out.println("Resultado positivo");
			}
			else{
				System.out.println("Resultado negativo");
			}
			
			if(resultado % 2 == 0){
				System.out.println("Resultado par");
			}
			else{
				System.out.println("Resultado impar");
			}
		}

	
		//20
		
		System.out.println("Responda as seguintes 5 perguntas com sim(1) ou nao(0):");
		System.out.println("Telefonou para a vitima?");
		int resp1 = ent.nextInt();
		System.out.println("Esteve no local do crime?");
		int resp2 = ent.nextInt();
		System.out.println("Mora perto da vitima?");
		int resp3 = ent.nextInt();
		System.out.println("Devia para a vitima?");
		int resp4 = ent.nextInt();
		System.out.println("Ja trabalhou para a vitima?");
		int resp5 = ent.nextInt();
		
		int soma = resp1 + resp2 + resp3 + resp4 + resp5;
		
		if(soma == 2){
			System.out.println("Suspeita");
		}
		else if(soma == 3 || soma == 4){
			System.out.println("Cumplice");
		}
		else if(soma == 5){
			System.out.println("Culpado");
		}
		else {
			System.out.println("Inocente");
		}
		
		//com switch-case
		switch(soma){
			case 2: System.out.println("Suspeita"); break;
			case 3: System.out.println("Cumplice"); break;
			case 4: System.out.println("Cumplice"); break;
			case 5: System.out.println("Culpado"); break;
			default: System.out.println("Inocente"); 
		}
		
		//mais elegante - COM CONTADOR 
		
		System.out.println("Responda as seguintes 5 perguntas com sim(S/s) ou nao(N/n):");
		System.out.println("Telefonou para a vitima?");
		String resp1 = ent.next();
		System.out.println("Esteve no local do crime?");
		String resp2 = ent.next();
		System.out.println("Mora perto da vitima?");
		String resp3 = ent.next();
		System.out.println("Devia para a vitima?");
		String resp4 = ent.next();
		System.out.println("Ja trabalhou para a vitima?");
		String resp5 = ent.next();
		
		int cont = 0;//contador para somar as respostas;
		
		if(resp1.equalsIgnoreCase("S")){
			cont++;//soma +1 ao valor anterior do contador que no caso é 0 + 1 = 1
		}
		if(resp2.equalsIgnoreCase("S")){
			cont++;//soma +1 ao valor anterior do contador que no caso é 1 + 1 = 2
		}
		if(resp3.equalsIgnoreCase("S")){
			cont++;//soma +1 ao valor anterior do contador que no caso é 2 + 1 = 3
		}
		if(resp4.equalsIgnoreCase("S")){
			cont++;//soma +1 ao valor anterior do contador que no caso é 3 + 1 = 4
		}
		if(resp5.equalsIgnoreCase("S")){
			cont++;//soma +1 ao valor anterior do contador que no caso é 4 + 1 = 5
		}
		
		if(soma == 2){
			System.out.println("Suspeita");
		}
		else if(soma == 3 || soma == 4){
			System.out.println("Cumplice");
		}
		else if(soma == 5){
			System.out.println("Culpado");
		}
		else {
			System.out.println("Inocente");
		}
		
		//21
		
		System.out.print("Informe o tipo de combustivel(A-alcool G-gasolina)\nTipo: ");
		String comb = ent.next();
		
		System.out.print("Informe a quantidade de litros\nLitros: ");
		double litros = ent.nextDouble();
		
		double pagarAlco = 1.90*litros;
		double pagarGaso = 2.50*litros;
		
		double descAlco1 = (pagarAlco*3)/100;
		double descAlco2 = (pagarAlco*5)/100;
		double descGaso1 = (pagarGaso*4)/100;
		double descGaso2 = (pagarGaso*6)/100;
		
		
		if("A".equalsIgnoreCase(comb) && litros <= 20){
			System.out.printf("O valor pelo total de %.2f litros de alcool eh R$ %.2f.", litros, pagarAlco-descAlco1);			
		}
		if("A".equalsIgnoreCase(comb) && litros > 20){
			System.out.printf("O valor pelo total de %.2f litros de alcool eh R$ %.2f.", litros, pagarAlco-descAlco2);			
		}		
		else if("G".equalsIgnoreCase(comb) && litros <= 20){
			System.out.printf("O valor pelo total de %.2f litros de gasolina eh R$ %.2f.", litros, pagarGaso-descGaso1);			
		}
		else if("G".equalsIgnoreCase(comb) && litros > 20){
			System.out.printf("O valor pelo total de %.2f litros de gasolina eh R$ %.2f.", litros, pagarGaso-descGaso2);			
		}
		
		//menos elegante
System.out.print("Informe a quantidade de litros\nLitros: ");
double litros = ent.nextDouble();

System.out.print("Informe o tipo de combustivel(A-alcool G-gasolina)\nTipo: ");
String tipo = ent.next();

double precoGas = 2.5;
double precoAlc = 1.9;
int percDesconto = 0;
double total = 0;
double totalDesc = 0;


if(tipo.equalsIgnoreCase("a")){
	
	if(litros <= 20){
		percDesconto = 3;
	}
	else{
		percDesconto = 5;
	}
	
	total = litros * precoAlc;
}
else if(tipo.equalsIgnoreCase("g")){
	if(litros <= 20){
		percDesconto = 4;
	}
	else{
		percDesconto = 6;
	}
	
	total = litros * precoGas;
}

totalDesc = (total / 100) * percDesconto;

double precoAPagar = total - totalDesc;

System.out.println("Valor a ser pago: " + precoAPagar);
	
		//22
		
		System.out.print("Qual tipo de fruta? Morango ou maca?\n");
		String fruta = ent.nextLine();
		System.out.print("Quantos quilos?\n");
		double quilos = ent.nextDouble();
		
		double precoMora1 = quilos*2.50;
		double precoMora2 = quilos*2.20;
		
		double precoMaca1 = quilos*1.80;
		double precoMaca2 = quilos*1.50;
		
		
		if("morango".equalsIgnoreCase(fruta) && quilos <= 5.0){
			System.out.printf("O valor total eh: %.2f", precoMora1);
		}
		else if("morango".equalsIgnoreCase(fruta) && quilos > 5.0 && quilos < 8.0){
			System.out.printf("O valor total eh: %.2f", precoMora2);
		}
		else if("morango".equalsIgnoreCase(fruta) && quilos >= 8.0){
			System.out.printf("O valor total eh: %.2f", precoMora2-(precoMora2*10)/100);
		}
		else if("maca".equalsIgnoreCase(fruta) && quilos <= 5.0){
			System.out.printf("O valor total eh: %.2f", precoMaca1);
		}
		else if("maca".equalsIgnoreCase(fruta) && quilos > 5.0 && quilos < 8.0){
			System.out.printf("O valor total eh: %.2f", precoMaca2);
		}
		else if("maca".equalsIgnoreCase(fruta) && quilos >= 8.0){
			System.out.printf("O valor total eh: %.2f", precoMaca2-(precoMaca2*10)/100);
		}
	
		//23
		System.out.print("Qual o tipo de carne?\nFD-File duplo - A-Alcatra - P-Picanha\nTipo: ");
		String carne = ent.next();
		System.out.print("Qual a quantidade de carne?\nKgs: ");
		double peso = ent.nextDouble();
		System.out.print("Qual a forma de pagamento?\nD-Dinheiro - C-Cheque - Ca-Cartao - Ct-Cartao Tabajara\nResp: ");
		String resposta = ent.next();
		
		//até 5 kgs
		double totalFD = 4.90*peso;
		double totalA = 5.90*peso;
		double totalP = 6.90*peso;
		//acima 5 kgs
		double totalFD1 = 5.80*peso;
		double totalA1 = 6.80*peso;
		double totalP1 = 7.80*peso;
		
		//file duplo sem cartao tabajara
		if("FD".equalsIgnoreCase(carne) && peso <= 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: File Duplo");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalFD);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalFD);
		}
		else if("FD".equalsIgnoreCase(carne) && peso > 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: File Duplo");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalFD1);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalFD1);
		}
		
		//file duplo com cartao tabajara
		if("FD".equalsIgnoreCase(carne) && peso <= 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: File Duplo");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalFD);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalFD-(totalFD*5)/100);
		}	
		else if("FD".equalsIgnoreCase(carne) && peso > 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: File Duplo");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalFD1);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalFD1-(totalFD1*5)/100);
		}	
		
		//alcatra sem cartao tabajara
		if("A".equalsIgnoreCase(carne) && peso <= 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Alcatra");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalA);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalA);
		}
		else if("A".equalsIgnoreCase(carne) && peso > 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Alcatra");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalA1);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalA1);
		}
		//alcatra com cartao tabajara
		if("A".equalsIgnoreCase(carne) && peso <= 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Alcatra");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalA);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalA-(totalA*5)/100);
		}	
		else if("A".equalsIgnoreCase(carne) && peso > 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Alcatra");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalA1);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalA1-(totalA1*5)/100);
		}	
		
		//picanha sem cartao tabajara
		if("P".equalsIgnoreCase(carne) && peso <= 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Picanha");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalP);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalP);
		}
		else if("P".equalsIgnoreCase(carne) && peso > 5.0){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Picanha");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalP1);
			
			if("D".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Dinheiro" );
			}
			else if("C".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cheque" );
			}
			else if("Ca".equalsIgnoreCase(resposta)){
				System.out.println("Forma de pagamento: Cartao" );
			}			
			System.out.println("Desconto: 0%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalP1);
		}
		//alcatra com cartao tabajara
		if("P".equalsIgnoreCase(carne) && peso <= 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Picanha");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalP);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalP-(totalP*5)/100);
		}	
		else if("P".equalsIgnoreCase(carne) && peso > 5.0 && "Ct".equalsIgnoreCase(resposta)){
			System.out.println("\nCupom Fiscal");
			System.out.println("Tipo de carne: Picanha");
			System.out.printf("Quantidade: %.2f Kgs\n", peso);
			System.out.printf("Preco total: R$ %.2f\n", totalP1);
			System.out.println("Forma de pagamento: Cartao Tabajara" );
			System.out.println("Desconto: 5%");
			System.out.printf("Valor a pagar: R$ %.2f\n", totalP1-(totalP1*5)/100);
		}	
		
		
		//MAIS ELEGANTE
		System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = ent.nextInt();
        
        System.out.println("Entre com a quantidade (kg):");
        double qtd = ent.nextDouble();
        
        double precoKg = 0;
        
        if (tipo == 1){
            
            System.out.println(qtd + "kg - file duplo");
            
            if (qtd < 5){
               precoKg = 4.9; 
            } else {
                precoKg = 5.8;
            }
            
            
        } else if (tipo == 2){
            
            System.out.println(qtd + "kg - alcatra");
            
            if (qtd < 5){
               precoKg = 5.9; 
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3){
            
            System.out.println(qtd + "kg - picanha");
            
            if (qtd < 5){
               precoKg = 6.9; 
            } else {
                precoKg = 7.8;
            }
        }
        
        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);
        
        System.out.println("Compra no cartão? digite 1 para sim:");
        int cartao = scan.nextInt();
        
        if (cartao == 1){
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
	}
}