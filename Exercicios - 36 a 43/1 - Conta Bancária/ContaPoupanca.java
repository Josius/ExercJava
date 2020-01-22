public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimentoPerc;
	private double diaRendimento;
		
	public double getDiaRendimentoPerc(){
		return diaRendimento;
	}
	public void setDiaRendimentoPerc(double diaRendimentoPerc){
		this.diaRendimentoPerc = diaRendimentoPerc/100;
	}
	
	public void calcularNovoSaldo(){
		
		diaRendimento = diaRendimentoPerc*getSaldo() + getSaldo();
		setSaldo(diaRendimento);
	}
	
	/*
	public void calcularNovoSaldo(double txRendimento){
		
		diaRendimento = (txRendimento/100)*getSaldo() + getSaldo();
		setSaldo(diaRendimento);
	}
	*/
	public String toString(){
		
		return "\n"   + "\nNome do Cliente: " + getNomeCliente() + "\nNumero da Conta: " + getNumConta() + "\nSaldo: " + Double.toString(getSaldo()) + "\nTaxa de Rendimento: " + diaRendimentoPerc;
	}
}