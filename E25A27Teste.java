import java.util.Scanner;

public class E25A27Teste{
	public static void main(String[] args){
		
		//Lampada
		/*
		E25A27 lamp = new E25A27();
		lamp.tipos = new String[5];
		Scanner ent = new Scanner(System.in);
		
		
		lamp.modelo = "A 60";
		lamp.tensao = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarelo";
		lamp.tipoLuz = "Amarelo";
		lamp.garantiaMeses = 36;
		lamp.tipos[0] = "Lampião";
		lamp.tipos[1] = "Abajur";
		
		System.out.println("Digite l para ligar ou d para desligar a lâmpada:");
		String ligDeslg = ent.nextLine();
	
		if(ligDeslg.equals("d")){
			lamp.ligar();
		}else if(ligDeslg.equals("l")){
			lamp.desligar();
		}else{
			System.out.println("Entrada Invalida");
		}
		*/
		//Conta
		/*
		E25A27 conta = new E25A27();
		
		conta.numConta = "123456";
		conta.agencia = "3456";
		conta.saldo = 500.0;
		conta.especial = true;
		conta.chequeEspecial = 200.0;
		
		System.out.println("Conta: " + conta.numConta);
		System.out.println("Agencia: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Especial: " + conta.especial);
		System.out.println("Cheque Especial: " + conta.chequeEspecial);
		
		double saldo, depositar, sacar;
		boolean especial;
		
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		depositar = conta.depositar(356.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(856.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(150.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(150.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(50.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(1.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		depositar = conta.depositar(356.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		depositar = conta.depositar(356.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		
		
		especial = conta.verificarEspecial();
		System.out.println("Conta Especial?");
		if(especial == true){
			System.out.print("R: Sim");
		}else{
			System.out.print("R: Nao");
		}
		*/
		//Aluno
		/*
		Scanner ent = new Scanner(System.in);
		
		E25A27 aluno = new E25A27();
		
		System.out.println("Informe o nome do Aluno:");
		aluno.nome = ent.next();
		System.out.println("Informe a matricula do Aluno:");
		aluno.matricula = ent.nextInt();
		System.out.println("Informe o curso do Aluno:");
		aluno.curso = ent.next();
		System.out.println("Informe a quantidade de disciplinas do Aluno:");
		int numDisciplinas = ent.nextInt();
		
		aluno.disciplina = new String[numDisciplinas];
		aluno.notas = new double[numDisciplinas][2];
		aluno.media = new double[numDisciplinas];
		
		for(int i = 0; i < aluno.disciplina.length; i++){
			System.out.println("Informe o nome da " + (i+1) + "ª disciplina do  Aluno: ");
			aluno.disciplina[i] = ent.next();
		}
		
		for(int i = 0; i < aluno.notas.length; i++){
			for(int j = 0; j < aluno.notas[i].length; j++){
			System.out.println("Informe a nota " + (i+1) + "º Semestre do Aluno na disciplina " + aluno.disciplina[i] + ": ");
				aluno.notas[i][j] = ent.nextDouble();
			}
		}
		
		//PODERIA TER CRIADO UM METODO SOMENTE PARA MOSTRAR ESSAS INFORMACOES:
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Matricula: " + aluno.matricula);
		System.out.println("Curso: " + aluno.curso);
		System.out.println();
		
		for(int i = 0; i < aluno.disciplina.length; i++){
			System.out.println("Disciplina " + (i+1) + ": " + aluno.disciplina[i]);
		}
		System.out.println();
		for(int i = 0; i < aluno.notas.length; i++){
			for(int j = 0; j < aluno.notas[i].length; j++){
				System.out.println("Disciplina " + (i+1) + ": " + aluno.disciplina[i] + " Nota " + (j+1) + ": " + aluno.notas[i][j]);
			}
			System.out.println();
		}
		
		double mediaAlun = aluno.calcularMedia();
		for(int i = 0; i < aluno.media.length; i++){
			if(aluno.media[i] >= 7){
				System.out.println("Aluno aprovado na disciplina " + aluno.disciplina[i] + " media: " + aluno.media[i]);
			}else{
				System.out.println("Aluno reprovado na disciplina " + aluno.disciplina[i] + " media: " + aluno.media[i]);
			}
		}
		*/
		//CORRECOES - RESPOSTAS LOIANE
		//Lampada
		/*
		E25A27 lamp = new E25A27();
		
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		*/
		//Conta Corrente
		/*
		E25A27 conta = new E25A27();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);

		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else{
			System.out.println("Nao foi possivel realizar saque.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else{
			System.out.println("Nao foi possivel realizar saque.");
		}
		
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		}else{
			System.out.println("Nao esta usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		}else{
			System.out.println("Nao esta usando cheque especial");
		}
		*/
		//Aluno
		E25A27 aluno = new E25A27();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula");
		aluno.matricula = scan.next();
		
		//aluno.nomeDisciplinas = new String[3];
		
		for(int i = 0; i < aluno.nomeDisciplinas.length; i++){
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		for(int i = 0; i < aluno.notasDisciplinas.length; i++){
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for(int j = 0; j < aluno.notasDisciplinas[i].length; j++){
				System.out.println("Entre com a nota " + (j+1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i = 0; i < aluno.nomeDisciplinas.length; i++){
			if(aluno.verificarAprovado(i)){
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
			}
		}
			
	}
}
