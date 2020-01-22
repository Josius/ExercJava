public class Teste{
	public static void main(String[] args){
		
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("12345");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);  
		
		System.out.println(contaSimples);
		
		System.out.println();
		
		System.out.println("*** Teste Conta Poupanca ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta poupanca");
		contaPoupanca.setNumConta("54321");
		contaPoupanca.setDiaRendimento(23);
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);  
		
		if(contaPoupanca.calcularNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, novo saldo e de = " + contaPoupanca.getSaldo());
		}else{
			System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado");
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println();
		
		System.out.println("*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("666");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);  
		
		realizarSaque(contaEspecial, 80);  
		
		System.out.println(contaEspecial);
		
		
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
		if(conta.sacar(valor)){
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		}else{
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
		}
	}
}