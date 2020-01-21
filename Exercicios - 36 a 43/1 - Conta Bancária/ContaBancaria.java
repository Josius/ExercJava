public class ContaBancaria{
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
		
	public String getNomeCliente(){
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	public String getNumConta(){
		return numConta;
	}
	public void setNumConta(String numConta){
		this.numConta = numConta;
	}
	
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void sacar(double valor){
		if((saldo >= valor) && (valor >= 0)){
			saldo -= valor;
		}
		if((saldo <= 0) || (valor <= 0)){//pode ser que de conflito no saque da conta especial
			System.out.println("Seu saldo e insuficiente");
		}
		else{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}else{
			System.out.println("Valor invalido");
		}
	}
}