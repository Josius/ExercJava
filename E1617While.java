//NOTA SOBRE FLAG - Posso usar a flag como uma forma de sair do programa, sem ter que utilizar 'return;' ou 'System.exit(0);' > ver exercicio 25
//menor valor [síntaxe]= 'tipo variavel = Tipo.MAX_VALUE;'
//maior valor [síntaxe]= 'tipo variavel = Tipo.MIN_VALUE;'

//Menor valor > 'double menor = Double.MAX_VALUE;' > exercicio 27
//Maior valor > 'double maior = Double.MIN_VALUE;' > exercicio 27 
//PESQUISAR COMO FUNCIONA O STRING OUTPUT - EXERCICIO 32

import java.util.Scanner;


public class E1617While{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		
		//1
	/*	
		System.out.println("Digite uma nota entre 0 e 10: ");
		
		double nota = ent.nextDouble();
		if((nota < 0.0) || (nota > 10.0)){
			while((nota < 0.0) || (nota > 10.0)){
				System.out.println("NOTA INVALIDA!\nDigite corretamente uma nota entre 0 e 10: ");
				nota = ent.nextDouble();
			}
		}else{
			System.out.println("NOTA VALIDA!");
		}
	*/
		//1 - Loiane - com flag e do-while
	/*	
		boolean notaValida = false;
		
		do{
			System.out.println("Digite uma nota entre 0 e 10: ");
			
			double nota = ent.nextDouble();
			
			if(nota >=0.0 && nota<= 10.0){
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			}else{
				System.out.println("Nota invalida, digite novamente.");
			}
		}while(!notaValida);
	*/
		
		//2
	/*	
		System.out.println("Digite nome de usuario: ");
		String nome = ent.next();
		
		System.out.println("Digite senha: ");
		String senha = ent.next();
		
		if(nome.equalsIgnoreCase(senha)){
			while(nome.equalsIgnoreCase(senha)){
				System.out.println("NOME E SENHA NAO PODEM SER IGUAIS!\n");
				System.out.println("Digite novamente nome de usuario: ");
				nome = ent.next();
			
				System.out.println("Digite novamente senha: ");
				senha = ent.next();
			}
		}else{
			System.out.println("Nome e senha digitados corretamente!");
		}
	*/
		//2  - Loiane - com flag e do-while
	/*	
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do{
			System.out.println("Entre com o nome do usuario:");
			nomeUser = ent.next();
			
			System.out.println("Entre com a senha:");
			senha = ent.next();
			
			if(nomeUser.equalsIgnoreCase(senha)){
				//infoValidas = false;
				System.out.println("Senha igual ao usuario, digite novamente.");
			}else{
				infoValidas = true;
				System.out.println("Senha e usuarios validos.");
			}
		}while(!infoValidas);
	*/
		//3
	/*			
		System.out.println("Digite nome:");
		String nome = ent.next();
		
		while(nome.length() < 4){
			System.out.println("NOME PRECISA TER MAIS QUE TRES DIGITOS\nDigite nome novamente:");
			nome = ent.next();
		}
		
		System.out.println("Digite idade:");
		int idade = ent.nextInt();
		
		while((idade < 0) || (idade > 150)){
			System.out.println("IDADE PRECISA SER ENTRE 0 E 150\nDigite idade novamete:");
			idade = ent.nextInt();
		}
		
		System.out.println("Digite salario:");
		double salario = ent.nextDouble();
		
		while(salario < 0){
			System.out.println("SALARIO PRECISA SER MAIOR QUE ZERO\nDigite salario novamete:");
			salario = ent.nextDouble();
		}
		
		System.out.println("Digite sexo(f ou m):");
		String sexo = ent.next();
		
		while((! "f".equalsIgnoreCase(sexo)) && (! "m".equalsIgnoreCase(sexo))){
			System.out.println("SEXO INVALIDO\nDigite sexo novamete:");
			sexo = ent.next();
		}
		
		System.out.println("Digite estado civil(\'s\' - \'c\' - \'v\' - \'d\'):");
		String estCivil = ent.next();
		
		while((! "s".equalsIgnoreCase(estCivil)) && (! "c".equalsIgnoreCase(estCivil)) && (! "v".equalsIgnoreCase(estCivil)) && (! "d".equalsIgnoreCase(estCivil))){
			System.out.println("ESTADO CIVIL INVALIDO\nDigite estado civil novamete:");
			estCivil = ent.next();
		}
	*/	
		//3 - Loiane - com flag e do-while
	/*	
		boolean infoValida = false;
		
		String nome, sexo, estCivil;
		int idade;
		double salario;
		
		
		do{
			System.out.println("Entre com o nome:");
			nome = ent.next();
			
			if(nome.length() > 3){
				infoValida = true;
			}else{
				System.out.println("Nome precisa de 4 caracteres.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			System.out.println("Entre com a idade:");
			idade = ent.nextInt();
			
			if(idade >= 0 && idade <= 150){
				infoValida = true;
			}else{
				System.out.println("Idade precisa ser entre 0 e 150 anos.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			System.out.println("Entre com o salario:");
			salario = ent.nextDouble();
			
			if(salario > 0){
				infoValida = true;
			}else{
				System.out.println("Salario precisa ser maior que zero.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			System.out.println("Entre com o genero:");
			sexo = ent.next();
			
			if("f".equalsIgnoreCase(sexo) || "m".equalsIgnoreCase(sexo)){
				infoValida = true;
			}else{
				System.out.println("Sexo invalido.");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do{
			System.out.println("Digite estado civil:");
			estCivil = ent.next();
			
			if("s".equalsIgnoreCase(estCivil) || "c".equalsIgnoreCase(estCivil) || "v".equalsIgnoreCase(estCivil) || "d".equalsIgnoreCase(estCivil)){
				infoValida = true;
			}else{
				System.out.println("Estado civil invalido.");
			}
		}while(!infoValida);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Genero: " + sexo);
		System.out.println("Estado civil: " + estCivil);
		
	*/	
		//4
	/*	
		double popA = 80;
		double popB = 200;
		int anos = 0;
		
		while(popA <= popB){
			popA += (popA*3)/100;
			popB += (popB*1.5)/100;
			anos++;
		}
		
		System.out.println(anos);
	*/
		//5
	/*	
		System.out.println("Digite a populacao A:");
		double popA = ent.nextDouble();
		
		System.out.println("Digite a populacao B:");
		double popB = ent.nextDouble();
		
		System.out.println("Digite a taxa de crescimento da populacao A:");
		double txA = ent.nextDouble();
		
		System.out.println("Digite a taxa de crescimento da populacao B:");
		double txB = ent.nextDouble();
		
		int anos = 0;
		
		if ((popA < popB) && txA > txB){
			while(popA <= popB){				
				popA += (popA*txA)/100;
				popB += (popB*txB)/100;
				anos++;
			}
		}
		
		if((popA > popB) && txA < txB){
			while(popB <= popA){				
				popA += (popA*txA)/100;
				popB += (popB*txB)/100;
				anos++;
			}
		}
		
		if(popA == popB){
			System.out.println("Populacao A possui a mesma quantidade de habitantes que a populacao B.");
		}
		
		else{
			System.out.println("Nao eh possivel haver equalizacao entre o numero de habitantes");
		}	
		
		System.out.println(anos);
	*/
		//5 - Loiane - com flag e do-while
	/*	
		boolean valido = false;
		
		double popA, popB, txA, txB;
		int anos = 0;
		
		do{
			System.out.println("Digite a populacao A:");
			popA = ent.nextDouble();
			
			if(popA > 0){
				valido = true;
			}else{
				System.out.println("Populacao A precisa ser maior que zero.");
			}
		}while(!valido);
		
		valido = false;
		
		do{
			System.out.println("Digite a populacao B:");
			popB = ent.nextDouble();
			
			if(popB > 0){
				valido = true;
			}else{
				System.out.println("Populacao B precisa ser maior que zero.");
			}
		}while(!valido);
		
		valido = false;
		
		do{
			System.out.println("Entre com a taxa de crescimento da populacao A:");
			txA = ent.nextDouble();
			
			if(txA > 0){
				valido = true;
			}else{
				System.out.println("A taxa de A precisa ser maior que zero.");
			}
		}while(!valido);
		
		valido = false;
		
		do{
			System.out.println("Entre com a taxa de crescimento da populacao B:");
			txB = ent.nextDouble();
			
			if(txB > 0){
				valido = true;
			}else{
				System.out.println("A taxa de B precisa ser maior que zero.");
			}
		}while(!valido);
		
		
		
		while(popA <= popB){
			popA += (popA*txA)/100;
			popB += (popB*txB)/100;
			anos++;
		}
		
		System.out.println(anos);
	*/
		//6
	/*	
		int num = 0;
		int max = 20;
		
		while(num <= max){
			num++;
			//System.out.println(num);
			System.out.print(num + " ");
		}
	*/
		//7
		//resolução procurada
	/*	
		int maior = 0;
		int i = 1;
		
		while(i < 6){
			System.out.println("Digite um numero:");
			int num  = ent.nextInt();
			if(num > maior){
				maior = num;
			}
			i++;
		}
		System.out.println("O numero maior dentre eles eh: " + maior);
	*/
		//7 - Loaine - Integer.MIN_VALUE; > MENOR numero possivel
	/*	
		int num;
		int maior = Integer.MIN_VALUE;//MENOR numero possivel
		
		for(int i = 0; i < 5; i++){
			System.out.println("Entre com um numero:");
			num = ent.nextInt();
			if(num > maior){
				maior = num;
			}
		}
		System.out.println("O numero maior dentre eles eh: " + maior);
	*/	
		//8
	/*	
		double num = 0;
		double soma = 0;
		double media = 0;
		int i = 0;
		while(i < 5){
			System.out.println("Digite um numero:");
			num = ent.nextInt();
			i++;
			soma += num;
		}
		
		media = soma / 5;
		System.out.println("A soma entre os numeros eh: " + soma);
		System.out.printf("A media entre os numeros eh: %.2f", media);
	*/	
		//8 - Loiane
	/*	
		int num;
		int soma = 0;
		double media;
		
		for(int i = 0; i < 5; i++){
			System.out.printf("Digite um numero:");
			num = ent.nextInt(); 
			
			soma += num;
		}
		media = soma/5;
		System.out.println("A soma entre os numeros eh: " + soma);
		System.out.printf("A media entre os numeros eh: %.2f", media);
	*/	
		//9
	
	/*	
		int num = 0;
		int max = 50;
		int result = 0;
		while(num <= 50){
			result = num % 2;
			num++;
			//não entendi o que aconteceu abaixo, o correto seria 'result != 0' e nao 'result == 0' para imprimir os impares.
			if(result == 0){
				System.out.println(num);
			}
		}
	*/	
		//9 - Loiane
	/*	
		for(int i = 0; i < 50; i++){
			if(i % 2 != 0){
				System.out.println(i);	
			}
		}
	*/	
		//10
	/*	
		System.out.println("Digite o primeiro numero:");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = ent.nextInt();		
		
		while(num1 < num2){
			num1++;
			System.out.println("Os numeros sao: " + num1);
		}
		while(num2 < num1){
			num2++;
			System.out.println("Os numeros sao: " + num2);
		}
	*/
		//10 - Loiane
	/*	
		System.out.println("Digite o primeiro numero:");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = ent.nextInt();		
		
		for(int i = num1; i <= num2; i++){
			System.out.println(i);
		}
		//faltou este for abaixo
		for(int i = num2; i <= num1; i++){
			System.out.println(i);
		}
	*/	
		//11
	/*	
		System.out.println("Digite o primeiro numero:");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = ent.nextInt();		
		
		int soma1 = 0;
		int soma2 = 0;
		if(num1 < num2){
			while(num1 < num2){
				num1++;
				soma1 += num1;
				
				System.out.println("Os numeros sao: " + num1);
			}
			
			System.out.println("A soma dos numeros eh: " + soma1);
		}
		else if(num2 < num1){
			while(num2 < num1){
				num2++;
				soma2 += num2;
				
				System.out.println("Os numeros sao: " + num2);
			}
			
			System.out.println("A soma dos numeros eh: " + soma2);
		}
	*/
		//11
	/*	
		System.out.println("Digite o primeiro numero:");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = ent.nextInt();		
		
		int soma = 0;
		
		for(int i = num1; i <= num2; i++){
			soma +=i;
		}
		//faltou este for abaixo
		for(int i = num2; i <= num1; i++){
			soma +=i;
		}
		System.out.println(soma);		
	*/
		//12
	/*	
		System.out.print("Digite o numero da tabuada: ");
		int numTab  = ent.nextInt();
		int mult = 0;
		int resulta = 0;
		while(mult < 10){
			mult++;
			resulta = numTab * mult;
			System.out.println(numTab + " X " + mult + " = " + resulta);
		}
	*/
		//12 - Loiane
	/*	
		System.out.print("Digite o numero da tabuada: ");
		int numTab  = ent.nextInt();
		
		System.out.print("Tabuada de " + numTab + ":");
		
		for(int i =1; i <= 10; i++){
			System.out.println(numTab + " X " + i + " = " + (numTab*i)); 
		}
	*/
		//13
	/*	
		System.out.println("Digite a base: ");
		int base = ent.nextInt();
		System.out.println("Digite o expoente: ");
		int expoente = ent.nextInt();
		int result = 1;
		int cont = 0;
		
		while(cont < expoente){
			cont++;
			result *= base;	
			//System.out.println("1: " + result); aqui ele dah todos os resultados da exponenciacao
		}
		
		System.out.println("1: " + result);//aqui eh o resultado total
	*/	
		//13 - Loiane
	/*	
		System.out.println("Digite a base: ");
		int base = ent.nextInt();
		System.out.println("Digite o expoente: ");
		int expoente = ent.nextInt();
		
		int resultado = base;
		
		for(int i = 1; i < expoente; i++){
			resultado *= base;
		}
		
		System.out.println(resultado);
	*/
		//14
	/*	
		int contPar = 0;
		int contImpar = 0;
		int i = 0;
		while(i < 10){
			i++;
			System.out.println("Digite um numero:");
			int num = ent.nextInt();
			if(num % 2 == 0){
				contPar++;
			}
			if(num % 2 != 0){
				contImpar++;
			}
		}
		System.out.println("A quantidade de numeros pares eh: " + contPar);
		System.out.println("A quantidade de numeros impares eh: " + contImpar);
	*/	
		//14 - Loiane
	/*	
		int num;
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um numero:");
			num = ent.nextInt();
			
			if(num % 2 == 0){
				par++;
			}else{
				impar++;
			}
		}
		System.out.println("A quantidade de numeros pares eh: " + par);
		System.out.println("A quantidade de numeros impares eh: " + impar);
	*/
	
		//15
	/*	
		int inicial = 1;
		int fibo = 0;
		int result;
		System.out.println("Digite ate que termo voce quer a sequencia Fibonacci:");
		int enesimo = ent.nextInt();
		int i = 0;
		
		
		while(i < enesimo){
			
			result = fibo;
			fibo += inicial;
			inicial = result;
			
			System.out.println(fibo);
			i++;
		}
	*/	
		//15 - Loiane
	/*	
		System.out.println("Entre com o enesimo termo da serie de fibonacci:");
		int n = ent.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= n; i++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	*/	
		//16
	/*	
		int inicial = 1;
		int fibo = 0;
		int result = 0;
		int i = 0;
		
		
		while(result < 500){
			
			result = fibo;
			fibo += inicial;
			inicial = result;
			
			System.out.println(fibo);
			i++;
		}
	*/	
		//16 - Loiane
	/*	
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo < 500){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	*/		
		//17
		//problemas quan 'n' chega a 0, não consigo deixar ele == 1;
	/*
		System.out.println("Digite um numero:");
		int n = ent.nextInt();
		int N = 1;
		int M = 1;
		int O = n;
		//contadores
		int i = 0;
		int j = 0;
		while(i < n){
			i++;
			j++;
			N = n - j;			
			M *= N;			
			System.out.println("N: " + N);
			System.out.println("M: " + M);				
		}				
		O *= M;
		System.out.println("O: " + O);
	*/
		
		//17 da internet
	/*
		int x = ent.nextInt(); // aqui criamos uma variável que irá armazenar o numero do fatorial 
		int f = x; // aqui criamos outra var. Será o resultado temporário da multiplicação 

		while (x > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves 

			f = f *(x-1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1 
			x--; // aqui decrementamos o valor de x em um, no final do loop 
		}
		System.out.println(f); // Esse comando imprime o valor de f. O último será o valor final do Fatorial. 
	*/
		//17 - Loiane
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		for(int i = num; i > 0; i--){
			fatorial *= i;
			System.out.print(i + " * ");
		}
		
		System.out.println("Resultado: " + fatorial);
	*/
		//18
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		int i = 1;
		int result = 0;
		int primo = 0;
		while(i <= num){
			result = num % i;
			++i;
			
			if(result == 0){
				primo += 1;
			}
		}
		
		if(primo == 2){
			System.out.println("Eh primo!");
		}
		else{
			System.out.println("Nao eh primo!");
		}
	*/
		//18 - Loiane - For e Flag
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				System.out.println("Nao eh primo - Divisivel por " + i);
				primo = false;
			}
		}
		if(primo){
			System.out.println("Eh numero primo.");
		}
	*/	
		//19
	/*	
		int i = 0;
		
		System.out.println("Digite a quantidade de notas:");
		int max = ent.nextInt();
		
		int notas = 0;
		
		while(i < max){
			System.out.println("Digite a nota:");
			notas += ent.nextInt();
			i++;
		}
		System.out.println("A media aritmetica eh: " + notas/max);
	*/	
		//19 - Loiane
	/*	
		System.out.println("Digite a quantidade de notas:");
		double max = ent.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for(int i = 0; i < max; i++){
			System.out.println("Entre com a nota " + (i + 1));
			nota = ent.nextDouble();
			
			soma += nota;
		}
		
		media = soma / max;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	*/	
		//20
	/*	
		System.out.println("Digite a quantidade de pessoas que informarao a idade:");
		int pessoas = ent.nextInt();
		int idade = 0;
		int i = 0;
		int result = 0;
		
		while(i < pessoas){
			System.out.println("Digite a idade:");
			idade += ent.nextInt();
			i++;
		}
		
		result = idade / pessoas;
		
		if(result <= 25){
			System.out.println("A turma eh jovem!");
		}
		else if(result <= 60){
			System.out.println("A turma eh adulta!");
		}
		else {
			System.out.println("A turma eh idosa!");
		}
	*/
		//20 - Loiane - for
	/*	
		System.out.println("Digite a quantidade de pessoas que informarao a idade:");
		int pessoas = ent.nextInt();
		int idade;
		int soma = 0;

		for(int i = 0; i < pessoas; i++){
			System.out.println("Digite a idade da pessoa " + (i + 1));
			idade = ent.nextInt();
			
			soma += idade;
		}
		
		double media = soma / pessoas;
		
		System.out.println("A media de idade eh: " + media);
		
		if(result <= 25){
			System.out.println("A turma eh jovem!");
		}
		else if(result <= 60){
			System.out.println("A turma eh adulta!");
		}
		else {
			System.out.println("A turma eh idosa!");
		}
	*/		
		//21
	/*	
		System.out.println("Digite a quantidade de turmas:");
		int turmas = ent.nextInt();
		
		int i = 0;
		int alunos = 0;
		int mediaAlTu = 0;
		int soma = 0;
		
		while(i < turmas){
			System.out.println("Digite a quantidade de alunos:");
			alunos = ent.nextInt();
			if(alunos <= 40){
				soma += alunos;
				i++;
			}
			else{
				System.out.println("A TURMA NAO PODE TER MAIS QUE 40 ALUNOS!");
			}
		}
		System.out.println("soma: " + soma);
		mediaAlTu = soma / turmas;
		
		System.out.println("O numero medio de alunos por turma eh: " + mediaAlTu);
	*/	
		//21 - Loiane - Flag, for e do-while
	/*	
		System.out.println("Digite a quantidade de turmas:");
		int turmas = ent.nextInt();
		int alunos;
		int soma = 0;
		boolean invalido = true;
		
		for(int i = 1; i <= turmas; i++){
			
			invalido = true;
			do{
				System.out.println("Entre com o numero de alunos da turma " + i);
				alunos = ent.nextInt();
				if(alunos <= 40){
					invalido = false;
				}else{
					System.out.println("Numero de alunos invalido. Digite novamente: ");
				}	
			}while(invalido);
			soma += alunos;
		}
		double media = soma / turmas;
		System.out.println("Media " + media);
	*/	
		//22
	/*
		System.out.println("Digite a quantidade de CD's:");
		int cd = ent.nextInt();
		int i = 0;
		double valor = 0;
		
		while(i < cd){
			i++;
			System.out.println("Digite o valor do CD:");
			valor += ent.nextDouble();
		}
		System.out.println("Total investido eh R$ " + valor);
		System.out.printf("Valor medio gasto em cada um eh R$ %.2f\n", valor/cd);
	*/	
		//22 - Loiane
	/*	
		System.out.println("Digite a quantidade de CD's:");
		int cd = ent.nextInt();
		double valor;
		double soma = 0;
		
		for(int i = 1; i <= cd; i++){
			System.out.println("Digite o valor do CD " + i);
			valor = ent.nextDouble();
			
			soma += valor;
		}
		
		double media = soma /cd;
		
		System.out.println("Media gasta com cada cd: " + media);
	*/
		//23
	/*	
		int i = 0;
		double valor = 1.99;
		double total = 0;
		System.out.println("Lojas Quase Dois - Tabela de Precos");
		
		while(i < 50){
			i++;
			total = valor * i;
			
			System.out.printf(i + " - RS %.2f\n", total);
		}
	*/	
		//23 - Loiane - For
	/*	
		System.out.println("Lojas Quase Dois - Tabela de Precos");
		
		for(int i =1; i <= 50; i++){
			System.out.println(i + " - R$ " + (1.99 * i));
		}
	*/	
		//24
	/*	
		int i = 0;
		double valor = 0.18;
		double total = 0;
		System.out.println("Preco do pao: R$ 0,18\nPanificadora Pao de Ontem - Tabela de Precos");
		
		while(i < 50){
			i++;
			total = valor * i;
			
			System.out.printf(i + " - RS %.2f\n", total);
		}
	*/	
		//24 - Loiane - For
	/*	
		System.out.println("Preco do Pao: R$ 0.18");
		System.out.println("Panificadora pao de ontem - Tabela de Precos");
		
		for(int i =1; i <= 50; i++){
			System.out.println(i + " - R$ " + (0.18 * i));
		}
	*/	
		//25
		//Não completo, muitas duvidas
		
	/*	
		int produtos = 0;//contador
		double valor = 1;
		double soma = 0;
		double dinheiro = 0;
		
		
		
		System.out.println("valor(es) do(s) item(ns):");
		
		while(valor != 0){
			produtos++;
			valor = ent.nextDouble();
			soma += valor;
			
			System.out.printf("Produto " + produtos + ":" + " R$ %.2f\n", valor);
		}
		
		System.out.printf("Total: R$ %.2f\n", soma);
		
		System.out.printf("Qual o valor em dinheiro fornecido?\n");
		dinheiro = ent.nextDouble();
		System.out.printf("Dinheiro: R$ %.2f\n", dinheiro);
		System.out.printf("Troco: R$ %.2f\n", dinheiro - soma);
	*/	
		//25 - Loiane - Output, flag, for e do-while
		//Possui alguns bugs, mas é fácil de corrigir;
	/*	
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;
		
		do{
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = ent.next();
			
			if(continuarCompra.equalsIgnoreCase("s")){
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProdutos = ent.nextInt();
				
				total = 0;
				
				for(int i = 1; i <= qtdProdutos; i++){
					System.out.println("Informe preco do produto " + i);
					preco = ent.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
					
				}
				
				output += "Total: R$ " + total + "\n";
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Entre com o valor pago:");
				valorPago = ent.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = total - valorPago;
				
				output += "Troco: R$ " + troco + "\n";
				
				System.out.println(output);
				
			}else{
				sair = true;
			}
			
			
		}while(!sair); 
	*/
		//26
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		int N = 0;
		int nN = num;
		int f = num;
		int i = 0;
		
		System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");
		while(num > 1){
			
			f = f*(num - 1);//calcula o fatorial
			N = nN + i;//calcula (num - 1),  (num - 2),  (num - 3), etc..
			num--;
			i--;
			//System.out.print(num + "! = " + f);
			System.out.print(N + " * " );
			
		}
		System.out.print("1 = " + f);
	*/	
		//26 - Loiane
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		
		System.out.println("Fatorial de " + num);
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		for(int i = num; i > 1; i--){
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.print("1 = " + fatorial);
	*/	
		//27
		//problemas com menor numero
	/*	
		System.out.println("Digite a quantidade de temperaturas a comparar:");
		int quant = ent.nextInt();
		
		int i = 0;
		double temp = 0;
		double menor = 0;
		double maior = 0;
		double soma = 0;
		
		System.out.println("Digite as temperaturas:");
		
		while(i < quant){
			i++;
			temp = ent.nextDouble();
			soma += temp;
			
			if(temp < 0){
				menor = temp;
			}
			if((temp > 0) && (temp < maior)){
				menor = temp;
			}
			if(temp == 0){
				menor = temp;
			}
			
			if(temp > maior){
				maior = temp;
			}

		}
		System.out.println("Menor temperatura: " + menor);
		
		System.out.println("temperatura 1: " + temp);
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Media das temperaturas: " + soma/quant);
	*/	
		//27 - Loiane
	/*	
		System.out.println("Entre com a qtd de temperaturas");
		int qtdTemperaturas = ent.nextInt();
		double temp; 
		double soma = 0; 
		double menor = Double.MAX_VALUE; 
		double maior = Double.MIN_VALUE; 
		
		
		for(int i = 1; i <= qtdTemperaturas; i++){
			System.out.println("Entre com a temperatura " + i);
			temp = ent.nextDouble();
			soma += temp;
			
			if(temp > maior){
				maior = temp;
			}
			if(temp < menor){
				menor = temp;
			}
		}
		
		System.out.println("Media: " + (soma/qtdTemperaturas));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
	*/	
		//28 - Exercicio duplicado com o 18.
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		int i = 1;
		int result = 0;
		int primo = 0;
		while(i <= num){
			
			result = num % i;
			i++;
			if(result == 0){
				primo++;
			}
			
			
		}
		if(primo == 2){
			System.out.println("Eh primo");
		}
		else{
			System.out.println("Nao eh primo");
		}
	*/
		//29
		//problemas
	/*	
		System.out.println("Digite um numero:");
		int num = ent.nextInt();
		int inicial = 0;
		int i = 1;
		int b = 0;
		
		int primo = 0;
		
		while(inicial <= num){
			
			if(inicial % i == 0){
				b++;
			}
			i++;
			if(i > inicial){
				inicial++;
				i = 1;
				if(b == 2)
				primo++;
				b = 0;				
			}
			if((b == 2) || (primo == 1))
				System.out.println("inicial " + inicial);	
			
			
		}
		System.out.println("primo " + primo);	
	*/
		//29 - Loiane - For aninhado (i, j, k ...)
	/*	
		System.out.println("Entre com um numero");	
		int num = ent.nextInt();
		boolean primo;
		
		for(int i = 1; i <= num; i++){
			primo = true;
			
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					//System.out.println("Nao eh primo - Divisivel por " + i);
					primo = false;
				}
			}
			if(primo){
				System.out.println(i);
			}
		}
	*/	
		//30
	/*	
		System.out.print("Montar a tabuada de: ");
		int num = ent.nextInt();
		
		System.out.print("Comecar por: ");
		int num2 = ent.nextInt();
		
		System.out.print("Terminar em: ");
		int num3 = ent.nextInt();
		
		int result = 0;
		
		System.out.print("Vou montar a tabuada de " + num + " comecando em " + num2 + " terminando em " + num3 + ":\n");
		while(num2 <= num3){
			
			result = num * num2;
			num2++;
			System.out.println(num + " * " + (num2-1) + " = " + result);
		}
	*/
		//30 - Loiane
	/*	
		System.out.print("Digite o numero da tabuada: ");
		int numTab  = ent.nextInt();
		int numFinal, numInicio;
		boolean invalido = true;
		
		do{
			System.out.print("Entre com o inicio da tabuada: ");
			numInicio  = ent.nextInt();
			
			System.out.print("Entre com o final da tabuada: ");
			numFinal  = ent.nextInt();
			
			if(numFinal < numInicio){
				invalido = false;
			}
		}while(!invalido);		
		
		System.out.println("Tabuada de " + numTab + ":");
		System.out.println("Comecar por: " + numInicio);
		System.out.println("Terminar em: " + numFinal);
		System.out.println();
		
		for(int i = numInicio; i <= numFinal; i++){
			System.out.println(numTab + " X " + i + " = " + (numTab*i)); 
		}
	*/	
		//31 A
	/*	
		double sal = 1000.00;
		double i = 1.5/100;
		double res = sal;
		int ano = 1995;
		int max = 2019;
		
		while(ano < max){
			if(i == 0.015){
				System.out.printf("Salario do ano de " + ano +": "+ "%.2f\n", res);
				res += (sal*i);
				//System.out.println("Aumento de 1996: " + i + "%");		
			}
			i*=2;
			ano++;
			System.out.printf("Salario do ano de " + ano +": "+ "%.2f\n", res);
			res += (sal*i);
	
			//System.out.println("Aumento do ano " + (ano+1) + " " + i + "%");		
		}
	*/	
		//31 B
	/*	
		System.out.println("Digite o salario inicial:");
		double sal = ent.nextDouble();
		double i = 1.5/100;
		double res = sal;
		int ano = 1995;
		int max = 2019;
		
		while(ano < max){
			if(i == 0.015){
				System.out.printf("Salario do ano de " + ano +": "+ "%.2f\n", res);
				res += (sal*i);
				//System.out.println("Aumento de 1996: " + i + "%");		
			}
			i*=2;
			ano++;
			System.out.printf("Salario do ano de " + ano +": "+ "%.2f\n", res);
			res += (sal*i);
	
			//System.out.println("Aumento do ano " + (ano+1) + " " + i + "%");		
		}
	*/	
		//31 - Loiane - Problemas com Decimal Format
	/*	
		double salario = 1000.0; //95
		
		double percentual = 1.5; //96
		
		salario += (salario/100) * percentual; //96
		
		//DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i <= 2015; i++){
			
			percentual *= 2;
			
			salario += (salario/100) * percentual;
			//System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");		
			System.out.println(i + " = " + salario + " - " + percentual + "%");		
		}
	*/
		//32
	/*	
		double cQ = 100;
		int quantCq = 0;
		double valorCq = 0;
		
		double bS = 101;
		int quantBs = 0;
		double valorBs = 1;
		
		double bO = 102;
		int quantBo = 0;
		double valorBo = 1;
		
		double hB = 103;
		int quantHb = 0;
		double valorHb = 1;
		
		double cB = 104;
		int quantCb = 0;
		double valorCb = 1;
		
		double rF = 105;
		int quantRf = 0;
		double valorRf = 1;
				
		System.out.println("Para iniciar o pedido digite qualquer codigo do produto (100/101/102/103/104/105): ");
		double cod = ent.nextDouble();
				
		while((cod >= 100) && (cod <= 105)){
			System.out.println("Digite o codigo do produto e adicionaremos uma unidade do produto ao seu pedido: ");
			cod = ent.nextDouble();
					
			if(cod == 100){
				quantCq++;
				valorCq = quantCq * 1.20;
			}
			if(cod == 101){
				quantBs++;
				valorBs = quantBs * 1.30;
			}
			if(cod == 102){
				quantBo++;
				valorBo = quantBo * 1.50;
			}
			if(cod == 103){
				quantHb++;
				valorHb = quantHb * 1.20;
			}
			if(cod == 104){
				quantCb++;
				valorCb = quantCb * 1.30;
			}
			if(cod == 105){
				quantRf++;
				valorRf = quantRf * 1.00;
			}	
		}
		
		System.out.printf(quantCq + " Cachorro Quente: %.2f \n",valorCq);
		System.out.printf(quantBs + " Bauru Simples %.2f \n",valorBs);
		System.out.printf(quantBo + " Bauru com ovo %.2f \n",valorBo);
		System.out.printf(quantHb + " Hamburguer %.2f \n",valorHb);
		System.out.printf(quantCb + " Cheeseburguer %.2f \n",valorCb);
		System.out.printf(quantRf + " Refrigerante %.2f \n",valorRf);
		
		double total = valorCq + valorBs + valorBo + valorHb + valorCb + valorRf;
		System.out.printf("Total e: %.2f ", total);
	*/	
		//32 B
		/*double cQ = 100;
		int quantCq = 0;
		double valorCq = 0;
		
		double bS = 101;
		int quantBs = 0;
		double valorBs = 0;
		
		double bO = 102;
		int quantBo = 0;
		double valorBo = 0;
		
		double hB = 103;
		int quantHb = 0;
		double valorHb = 0;
		
		double cB = 104;
		int quantCb = 0;
		double valorCb = 0;
		
		double rF = 105;
		int quantRf = 0;
		double valorRf = 0;
				
		System.out.println("Para iniciar o pedido digite qualquer codigo do produto (100/101/102/103/104/105): ");
		double cod = ent.nextDouble();
		
		while((cod >= 100) && (cod <= 105)){
			System.out.println("Para finalizar o pedido, digite qualquer numero.\nDigite o codigo do produto: ");
			cod = ent.nextDouble();
					
			if(cod == 100){
				System.out.println("Digite a quantidade de Cachorro Quente:");
				quantCq = ent.nextInt();	
			}
			if(cod == 101){
				System.out.println("Digite a quantidade de Bauru Simples:");
				quantBs = ent.nextInt();
			}
			if(cod == 102){
				System.out.println("Digite a quantidade de Bauru com ovo:");
				quantBo = ent.nextInt();
			}
			if(cod == 103){
				System.out.println("Digite a quantidade de Hamburguer:");
				quantHb = ent.nextInt();
				
			}
			if(cod == 104){
				System.out.println("Digite a quantidade de Cheeseburguer:");
				quantCb = ent.nextInt();
				
			}
			if(cod == 105){
				System.out.println("Digite a quantidade de Refrigerante:");
				quantRf = ent.nextInt();
				
			}	
		}
		valorCq = quantCq * 1.20;
		valorBs = quantBs * 1.30;
		valorBo = quantBo * 1.50;
		valorHb = quantHb * 1.20;
		valorCb = quantCb * 1.30;
		valorRf = quantRf * 1.00;
		
		System.out.printf(quantCq + " Cachorro Quente: %.2f \n",valorCq);
		System.out.printf(quantBs + " Bauru Simples %.2f \n",valorBs);
		System.out.printf(quantBo + " Bauru com ovo %.2f \n",valorBo);
		System.out.printf(quantHb + " Hamburguer %.2f \n",valorHb);
		System.out.printf(quantCb + " Cheeseburguer %.2f \n",valorCb);
		System.out.printf(quantRf + " Refrigerante %.2f \n",valorRf);
		
		double total = valorCq + valorBs + valorBo + valorHb + valorCb + valorRf;
		System.out.printf("Total: %.2f ", total);*/
		//32 
		//Com do-while
	/*	
		double cQ = 100;
		int quantCq = 0;
		double valorCq = 0;
		
		double bS = 101;
		int quantBs = 0;
		double valorBs = 0;
		
		double bO = 102;
		int quantBo = 0;
		double valorBo = 0;
		
		double hB = 103;
		int quantHb = 0;
		double valorHb = 0;
		
		double cB = 104;
		int quantCb = 0;
		double valorCb = 0;
		
		double rF = 105;
		int quantRf = 0;
		double valorRf = 0;
		
		String resp;
				
		do{
			System.out.println("\nCardapio\n");
			System.out.print("Alimento \t\tcodigo\n");
			System.out.print("Cachorro Quente \t100\nBauru Simples \t\t101\nBauru com ovo \t\t102\nHamburguer \t\t103\n");
			System.out.print("Cheeseburguer \t\t104\nRefrigerante \t\t105\n\n");
			System.out.println("Digite o codigo do produto: ");
			int cod = ent.nextInt();
					
			if(cod == 100){
				System.out.println("Digite a quantidade de Cachorro Quente:");
				quantCq = ent.nextInt();	
			}
			if(cod == 101){
				System.out.println("Digite a quantidade de Bauru Simples:");
				quantBs = ent.nextInt();
			}
			if(cod == 102){
				System.out.println("Digite a quantidade de Bauru com ovo:");
				quantBo = ent.nextInt();
			}
			if(cod == 103){
				System.out.println("Digite a quantidade de Hamburguer:");
				quantHb = ent.nextInt();
				
			}
			if(cod == 104){
				System.out.println("Digite a quantidade de Cheeseburguer:");
				quantCb = ent.nextInt();
				
			}
			if(cod == 105){
				System.out.println("Digite a quantidade de Refrigerante:");
				quantRf = ent.nextInt();
			}
			System.out.println("Deseja continuar o pedido? (s/n):");	
			resp = ent.next();
		}		
		while("s".equalsIgnoreCase(resp));
			
		
		valorCq = quantCq * 1.20;
		valorBs = quantBs * 1.30;
		valorBo = quantBo * 1.50;
		valorHb = quantHb * 1.20;
		valorCb = quantCb * 1.30;
		valorRf = quantRf * 1.00;
		
		System.out.printf(quantCq + " Cachorro Quente: %.2f \n",valorCq);
		System.out.printf(quantBs + " Bauru Simples %.2f \n",valorBs);
		System.out.printf(quantBo + " Bauru com ovo %.2f \n",valorBo);
		System.out.printf(quantHb + " Hamburguer %.2f \n",valorHb);
		System.out.printf(quantCb + " Cheeseburguer %.2f \n",valorCb);
		System.out.printf(quantRf + " Refrigerante %.2f \n",valorRf);
		
		double total = valorCq + valorBs + valorBo + valorHb + valorCb + valorRf;
		System.out.printf("\nTotal: %.2f ", total);
	*/
		//32 - Loiane - String output, flag e do-while 
	/*	
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do{
			System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair.");
			cod = ent.nextInt();
			qtd = ent.nextInt();
			
			if(cod == 0 && qtd == 0){
				naoTerminar = false;
				output += "Total a pagar = " + total;
			}else{
				if(cod == 100){
					output += "Cachorro Quente -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd + "\n");
					total += 1.2 * qtd;
				}else if(cod == 101){
					output += "Bauru Simples -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd + "\n");
					total += 1.3 * qtd;
				}else if(cod == 102){
					output += "Bauru com Ovo -> 1,50 * " + qtd;
					output += " = " + (1.5 * qtd + "\n");
					total += 1.5 * qtd;
				}else if(cod == 103){
					output += "Hamburguer -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd + "\n");
					total += 1.2 * qtd;
				}else if(cod == 104){
					output += "Cheeseburguer -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd + "\n");
					total += 1.3 * qtd;
				}else if(cod == 105){
					output += "Refrigerante -> 1,00 * " + qtd;
					output += " = " + (1.0 * qtd + "\n");
					total += 1.0 * qtd;
				}
			}
			
		}while(naoTerminar);
		
		System.out.println(output);
	*/	
		//33 - NAO ENTENDI
	/*	
		int n = 1;
		int m = 1;
		int result = 0;
		int res = result;
		int i = 0;
		while(i < 10){
			
			result = n/m;
			res += result;
			i++;
			n++;
			m +=2;
			System.out.println(result);
			System.out.println("n"+n);
			System.out.println("m"+m);
			System.out.println("res"+res);
		}
	*/	
		//33 - Loiane
	/*	
		System.out.println("Digite o valor de n");
		int n = ent.nextInt();
		//int i = 1;
		//int j = 1;
		double soma = 0;
		
		for(int i = 1, j = 1; i <= n; i++, j+=2){
			System.out.print(i + "/" + j + " + " );
			soma += i/j;	
		}
		
		
		//System.out.print( "... + " + i + "/" + j);
		System.out.print("\nSoma = " + soma);
	*/	
		//34 - Loiane
	/*	
		System.out.println("Digite o valor de n");
		int n = ent.nextInt();
		
		double soma = 0;
		
		for(int i = 1; i <= n; i++){
			
			soma += 1/i;	
		}
		System.out.print("\nSoma = " + soma);
	}
	*/
}





























