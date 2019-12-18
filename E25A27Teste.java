import java.util.Scanner;

public class E25A27Teste{
	public static void main(String[] args){
		
		//Lampada
		/*
		E25A27 lamp = new E25A27();
		lamp.tipos = new String[5];
		Scanner ent = new Scanner(System.in);
		
		
		lamp.modelo = "A 60";
		lamp.tensao = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarelo";
		lamp.tipoLuz = "Amarelo";
		lamp.garantiaMeses = 36;
		lamp.tipos[0] = "Lampião";
		lamp.tipos[1] = "Abajur";
		
		System.out.println("Digite l para ligar ou d para desligar a lâmpada:");
		String ligDeslg = ent.nextLine();
	
		if(ligDeslg.equals("d")){
			lamp.ligar();
		}else if(ligDeslg.equals("l")){
			lamp.desligar();
		}else{
			System.out.println("Entrada Invalida");
		}
		*/
		
		E25A27 conta = new E25A27();
		
		conta.numConta = "123456";
		conta.agencia = "3456";
		conta.saldo = 500.0;
		conta.especial = true;
		conta.chequeEspecial = 200.0;
		/*
		System.out.println("Conta: " + conta.numConta);
		System.out.println("Agencia: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Especial: " + conta.especial);
		System.out.println("Cheque Especial: " + conta.chequeEspecial);
		*/
		double saldo, depositar, sacar, especial;
		
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		depositar = conta.depositar(356.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(856.40);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(150.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(150.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(50.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		
		sacar = conta.sacar(1.0);
		saldo = conta.consultarSaldo();
		System.out.println("Seu saldo e R$: " + saldo);
		/*
		especial = conta.verificarChequeEspecial();
		System.out.println("Especial? \nR:" + especial);
		*/
		
	}
}
