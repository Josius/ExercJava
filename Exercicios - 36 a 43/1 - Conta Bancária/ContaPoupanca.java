public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimento;
		
	public double getDiaRendimento(){
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento){
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double txRendimento){
		
		diaRendimento = (txRendimento/100)*getSaldo() + getSaldo();
		setSaldo(diaRendimento);
	}
	
	public String toString(){
		
		return Double.toString(getSaldo());
	}
}