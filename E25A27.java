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
	
	String numConta;
	String agencia;
	double saldo;
	boolean especial;
	double chequeEspecial, cheEsp;
	
	double sacar(double saque){
		cheEsp = chequeEspecial;
		if(saque <= saldo+chequeEspecial){
			saldo = saldo - saque;
			System.out.println("Voce sacou R$: " + saque);

		}else {
			System.out.println("O valor excede seu limite.");
			}
		/*if(saldo < 0 ){
			cheEsp = cheEsp - saque;
		}	*/
		System.out.println("O seu limite: " + cheEsp);
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
	/*
	double verificarChequeEspecial(){
		if(saldo < 0){
			return true;
		}
		return false;
	}
	*/
	
	
}
