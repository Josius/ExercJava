public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimento;
	
	public ContaPoupanca(){
		super();
	}
	
	public double getDiaRendimento(){
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento){
		this.diaRendimento = diaRendimento;
	}
	
	public ContaPoupanca(double diaRendimento){
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double txRendimento){
		setDiaRendimento((txRendimento/100)*super.getSaldo() + super.getSaldo());
		super.setSaldo(diaRendimento);
	}
	
}