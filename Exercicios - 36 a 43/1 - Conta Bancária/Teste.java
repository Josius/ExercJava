public class Teste{
	public static void main(String[] args){
		ContaEspecial conta = new ContaEspecial();
		//ContaPoupanca conta = new ContaPoupanca();
		System.out.println(conta);
		conta.sacar(0);
		System.out.println("lim " + conta.getLimite());
		System.out.println(conta);
		conta.sacar(-1);
		System.out.println("lim " + conta.getLimite());
		System.out.println(conta);
		conta.sacar(10);
		System.out.println("lim " + conta.getLimite());
		System.out.println(conta);
		conta.depositar(10);
		System.out.println("lim " + conta.getLimite());
		System.out.println(conta);
		conta.sacar(10);
		conta.setLimite(100);
		System.out.println(conta);
		System.out.println("lim " + conta.getLimite());
		conta.sacar(10);
		System.out.println(conta);
		System.out.println("lim " + conta.getLimite());
		
		
		//conta.calcularNovoSaldo(15);
		//System.out.println(conta);
		
		
		
		
	}
}
