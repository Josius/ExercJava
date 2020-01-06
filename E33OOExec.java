public class E33OOExec{
	public static void main(String[] args){
		//EXERCICIO 1
		//PROBLEMAS COM O ARRAY
		
		//E33OO1 lamp3 = new E33OO1("A6001");
		//Nao entedo porque esta dando error a linha acima
		
		/*
		//String[] tipo = new String[]{1};
		//tipo[0] = "A";
		E33OO1 lamp = new E33OO1("A60", "Bivolt", 7, "Amarela", "Amarela", 36);
		
		//lamp.setTipos(1);
		
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.info();
		
		E33OO1 lamp2 = new E33OO1();
		//lamp2.info();
		lamp2.setModelo("Adf");
		lamp2.setTensao("Bfdfd");
		lamp2.setPotencia(7);
		lamp2.setCor("fdfC");
		lamp2.setTipoLuz("D");
		lamp2.setGarantiaMeses(12);
		lamp2.info();
		*/
		
		//EXERCICIO 2
		E33OO2 conta = new E33OO2();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(10);

		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else{
			System.out.println("Nao foi possivel realizar saque.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else{
			System.out.println("Nao foi possivel realizar saque.");
		}
		
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		}else{
			System.out.println("Nao esta usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()){
			System.out.println("Esta usando cheque especial");
		}else{
			System.out.println("Nao esta usando cheque especial");
		}
		
	}
}