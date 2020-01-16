//EXERCICIOS AULA 33

//Exercicio 2 - Conta Corrente - SEMELHANTE RESOLUCAO LOIANE
public class E33OO2{
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public E33OO2(){}
	
	public E33OO2(String numero, String agencia, boolean especial, double limiteEspecial, double valorEspecialUsado, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.saldo = saldo;
	}
	
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
		return this.limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial){
		this.limiteEspecial = limiteEspecial;
	}
	
	public double getValorEspecialUsado(){
		return this.valorEspecialUsado;
	}
	public void setValorEspecialUsado(double valorEspecialUsado){
		this.valorEspecialUsado = valorEspecialUsado;
	}
	
	public double getSaldo(){
		return this.saldo;
	}	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public boolean realizarSaque(double qtdASacar){
		if(this.saldo >= qtdASacar){
			saldo -= qtdASacar;
			return true;
		}else{
			if(especial){
				double limite = limiteEspecial + saldo;
				if(limite >= qtdASacar){
					saldo -= qtdASacar;
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
	}
	
	public void depositar(double vlrDepositado){
		saldo += vlrDepositado;
	}
	
	public void consultarSaldo(){
		System.out.println("O valor em sua conta eh: " + this.saldo);
	}
	
	public boolean verificarUsoChequeEspecial(){
		return saldo < 0;
	}
	
	
}