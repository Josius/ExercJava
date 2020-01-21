public class Teste{
	public static void main(String[] args){
		//ContaBancaria conta = new ContaBancaria();
		
		/*conta.setSaldo(30);
		System.out.println(conta.getSaldo());
		conta.sacar(29.0);
		System.out.println(conta.getSaldo());
		conta.sacar(1.0);
		System.out.println(conta.getSaldo());
		conta.sacar(1.0);
		System.out.println(conta.getSaldo());
		conta.depositar(1.0);
		System.out.println(conta.getSaldo());
		conta.depositar(-1.0);
		System.out.println(conta.getSaldo());
		conta.depositar(-1.0);
		System.out.println(conta.getSaldo());*/
		ContaBancaria conta = new ContaPoupanca();
//		ContaPoupanca cont = new ContaPoupanca();
		conta.setSaldo(30);
		System.out.println(conta.getSaldo());
		conta.calcularNovoSaldo(5.0);
		System.out.println(conta.getSaldo());
		conta.depositar(31);
		System.out.println(conta.getSaldo());
		conta.calcularNovoSaldo(5.0);
		System.out.println(conta.getSaldo());
		
	}
}
