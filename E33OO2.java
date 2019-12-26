//EXERCICIOS AULA 33

//Exercicio 2 - Conta Corrente
public class E33OO2{
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public String getNumero(){
		return this.numero;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public boolean isEspecial(){
		return this.especial;
	}
	public void setEspecial(boolean especial){
		this.especial = especial;
	}
	
	public double getLimiteEspecial(){
		return this.limiteEspecial
	}
	public void setLimiteEspecial(double limiteEspecial){
		this.limiteEspecial = limiteEspecial;
	}
	
	public double getValorEspecialUsado(){
		return this.valorEspecialUsado
	}
	public void setValorEspecialUsado(double valorEspecialUsado){
		this.valorEspecialUsado = valorEspecialUsado;
	}
	
	public double getSaldo(){
		return this.saldo
	}	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	
	
}