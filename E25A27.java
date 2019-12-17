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
	double chequeEspecial;
	
	double sacar(double saque){
		if(saldo > 0 && saque <= saldo){
			saldo = saldo - saque;
			System.out.println("Voce sacou R$: " + saque);
		}
		if(saldo <= 0 && saque <= chequeEspecial){
			System.out.println("Seu cheque especial e de R$: " + chequeEspecial);
			saldo = chequeEspecial;
			saldo = saldo -saque;
			System.out.println("Voce sacou R$: " + saque);
		}
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