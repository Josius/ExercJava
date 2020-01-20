public abstract class ContaBancaria{
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria(){}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo){
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
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
	
	public double sacar(double valor){		
		if(getSaldo() >= valor){
			this.saldo -= valor;
		}else{
			System.out.println("Saldo insuficiente");
		}
		return saldo;
	}
	
	public void depositar(double valor){
		if(valor < 0){
			System.out.println("Valor de deposito invalido");
		}else{
			this.saldo += valor;
		}
	}
}