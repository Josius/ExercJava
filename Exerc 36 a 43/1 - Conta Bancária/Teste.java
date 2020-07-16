import java.util.Scanner;

public class Teste{
	public static void main(String[] args){
				
		ContaEspecial contaE = new ContaEspecial();
		ContaPoupanca contaP = new ContaPoupanca();
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Deseja criar uma conta?\nS/N:  ");
		String resp = ent.next();
		
		double resp2 = 0;
		
		if(resp.equalsIgnoreCase("s")){
			System.out.print("Qual tipo de conta? Especial ou Poupanca?\nE/P:  ");
			resp = ent.next();
			if(resp.equalsIgnoreCase("e")){
				
				System.out.print("Digite o nome do cliente: ");
				contaE.setNomeCliente(ent.next());
				
				System.out.print("Digite o numero da conta: ");
				contaE.setNumConta(ent.next());
				
				System.out.print("Digite o limite do cliente: ");
				resp2 = ent.nextDouble();
				contaE.setLimite(resp2);
				
				System.out.print("O cliente fara algum deposito?\nS/N:  ");
				resp = ent.next();
				
				if(resp.equalsIgnoreCase("s")){
					System.out.print("Digite o valor do deposito:  ");
					resp2 = ent.nextDouble();
					contaE.depositar(resp2);
				}	
				
				System.out.println(contaE);
			}if(resp.equalsIgnoreCase("p")){

				System.out.print("Digite o nome do cliente: ");
				contaP.setNomeCliente(ent.next());
				
				System.out.print("Digite o numero da conta: ");
				contaP.setNumConta(ent.next());
				
				System.out.print("Digite a taxa de redimento da conta: ");
				resp2 = ent.nextDouble();
				contaP.setDiaRendimentoPerc(resp2);
				
				System.out.print("O cliente fara algum deposito?\nS/N:  ");
				resp = ent.next();
				
				if(resp.equalsIgnoreCase("s")){
					System.out.print("Digite o valor do deposito:  ");
					resp2 = ent.nextDouble();
					contaP.depositar(resp2);
				}
				contaP.calcularNovoSaldo();
				System.out.println(contaP);
			}/*else{
				System.out.println("Dados invalidos. Reinicie o sistema.");
			}*/
			
		}else{
			System.out.println("Sistema finalizado");
			
		}
		
		/*
		ContaEspecial conta = new ContaEspecial();
		ContaPoupanca conta = new ContaPoupanca();
		System.out.println(conta);
		conta.sacar(0);
		System.out.println(conta);
		
		conta.sacar(-1);
		System.out.println(conta);
		
		conta.sacar(10);
		System.out.println(conta);
		
		conta.depositar(10);
		System.out.println(conta);
		
		conta.sacar(10);
		System.out.println(conta);
		
		conta.setLimite(100);
		System.out.println(conta);

		conta.sacar(10);
		System.out.println(conta);

		
		
		//conta.calcularNovoSaldo(15);
		//System.out.println(conta);
			*/	
			
	}
	
	
}
