import java.util.Scanner;

public class E33OOExec{
	public static void main(String[] args){
		//EXERCICIO 1
		//PROBLEMAS COM O ARRAY
		
		//E33OO1 lamp3 = new E33OO1("A6001");
		//Nao entedo porque esta dando error a linha acima
		
		/*
		//String[] tipo = new String[]{1};
		//tipo[0] = "A";
		E33OO1 lamp = new E33OO1("A60", "Bivolt", 7, "Amarela", "Amarela", 36);
		
		//lamp.setTipos(1);
		
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.info();
		
		E33OO1 lamp2 = new E33OO1();
		//lamp2.info();
		lamp2.setModelo("Adf");
		lamp2.setTensao("Bfdfd");
		lamp2.setPotencia(7);
		lamp2.setCor("fdfC");
		lamp2.setTipoLuz("D");
		lamp2.setGarantiaMeses(12);
		lamp2.info();
		*/
		
		//EXERCICIO 2
		/*
		E33OO2 conta = new E33OO2();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
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
		
		//EXERCICIO 3
		/*
		Scanner ent = new Scanner(System.in);
		
		E33OO3 aluno = new E33OO3();
		
		System.out.println("Entre com o nome do aluno:");
		aluno.setNome(ent.next());
		
		System.out.println("Entre com o nome do curso:");
		aluno.setNomeCurso(ent.next());
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(ent.next());
		
		for(int i=0; i<aluno.getNomeDisciplina().length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
			aluno.setNomeDisciplinaPos(i, ent.next());
		}
		
		for(int i=0; i<aluno.getNotasDisciplinas().length; i++){
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplina()[i]);
			for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
				System.out.println("Entre com a nota " + (j + 1));
				aluno.setNomePosIJ(i, j, ent.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i=0; i<aluno.getNomeDisciplina().length; i++){
			if(aluno.verificarAprovado(i)){
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " - foi aprovado");
			}else{
				System.out.println("Disciplina " + aluno.getNomeDisciplina()[i] + " - reprovado");
			}
		}
		*/
		
		//EXERCICIO 4
		
		Scanner scan = new Scanner(System.in);

        E33OO4 jogoDaVelha = new E33OO4();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogoDaVelha.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogoDaVelha.getJogada() > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;

	}
}