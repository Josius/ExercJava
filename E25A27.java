public class E25A27{
	//Lampada
	/*
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	
	void ligar(){
		System.out.println("Lampada Ligada");
	}
	void desligar(){
		System.out.println("Lampada Desligada");
	}
	*/
	//Conta
	/*
	String numConta;
	String agencia;
	double saldo;
	boolean especial;
	double chequeEspecial;
	
	
	double sacar(double saque){
		
		if(saque <= saldo+chequeEspecial){
			saldo = saldo - saque;
			System.out.println("Voce sacou R$: " + saque);

		}else {
			System.out.println("O valor excede seu limite.");
			}
		if(saldo < 0 ){
			System.out.println("Voce esta usando o seu limite.");
		}	
		//System.out.println("O seu limite: " + cheEsp);
		return saldo;
		
	}
	
	double depositar(double deposito){
		if(deposito > 0){
			saldo = saldo + deposito;
			System.out.println("Voce depositou R$: " + deposito);
		}
		return saldo;
	}
	
	double consultarSaldo(){
		return saldo;
	}
	
	double consultarLimite(){
		return chequeEspecial;
	}
	
	boolean verificarEspecial(){
		return especial;
	}
	*/
	//Aluno
	/*
	String nome;
	int matricula;
	String curso;
	String[] disciplina;
	double[][] notas;
	double[] media;
	double calMedia;
	
	double calcularMedia(){
		for(int i = 0; i < notas.length; i++){
			for(int j = 0; j < notas[i].length; j++){
				calMedia += notas[i][j];
			}
			media[i] = calMedia/2;
			calMedia = 0;
		}
		
	return calMedia;
	}
	*/
	//CORRECOES - RESPOSTAS LOIANE
	//Lampada
	/*
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	
	boolean ligada;
	
	void ligar(){
		ligada = true;
	}
	
	void desligar(){
		ligada = false;
	}
	
	void mostrarEstado(){
		if(ligada){
			System.out.println("Lampada esta ligada");
		}else{
			System.out.println("Lampada esta desligada");
		}
	}
	
	void mudarEstado(){
		if(ligada){
			desligar();
		}else{
			ligar();
		}
	}
	*/
	//Conta Corrente
	/*
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar){
		
		if(saldo >= quantiaASacar){
			saldo -= quantiaASacar;
			return true;
		}else{
			if(especial){
				
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar){
					saldo -= quantiaASacar;
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado){
		saldo += valorDepositado;
	}
	
	void consultarSaldo(){
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}
	*/
	//Aluno
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];
	
	void mostrarInfo(){
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);
		
		for(int i = 0; i < notasDisciplinas.length; i++){
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for(int j = 0; j < notasDisciplinas[i].length; j++){
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice){
		
		if(obterMedia(indice) >= 7){
			return true;
		}
		return false;
	}
	
	double obterMedia(int indice){
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++){
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		return media;
	}
}












