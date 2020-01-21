public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public double getLimite(){
		return limite;
	}
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	public void sacar(double valor){
		if((getSaldo() >= valor) && (valor >= 0)){
			setSaldo(getSaldo()-valor);
		}
		if(limite >= valor){
			if((getSaldo() < valor) || (getSaldo() <= 0)){
				limite -= valor;
			}
		}
	}
	public String toString(){
		
		return Double.toString(getSaldo());
	}
}