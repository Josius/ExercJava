public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public double getLimite(){
		return limite;
	}
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	public void sacar(double valor){
		if(valor > 0){
			if(getSaldo() >= valor){
				setSaldo(getSaldo()-valor);
			}
			if(getSaldo() < valor){
				if((getSaldo() > 0) && (limite >= valor)){
					valor -= getSaldo();
					setSaldo(-valor);
					limite -= valor;
				}
				if((getSaldo() == 0) && (limite >= valor)){
					limite -= valor;
					setSaldo(-valor);
				}
				if((getSaldo() == 0) && (limite < valor) && (limite != 0)){
				//if(limite < valor){
					System.out.println("Limite inferior ao valor do saque");
				}
				
			}
		}else{
			System.out.println("Valor de saque invalido");
		}
		

	}
	public String toString(){
		
		return  "\n"   + "\nNome do Cliente: " + getNomeCliente() + "\nNumero da Conta: " + getNumConta() + "\nSaldo: " + Double.toString(getSaldo()) + "\nLimite: " + Double.toString(limite) + "\nNome do Cliente: " + getNomeCliente() + "\nNumero da Conta: " + getNumConta();
	}
}
