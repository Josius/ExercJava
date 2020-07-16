import java.util.Scanner;

public class Teste{
	public static void main(String[] args){
		PessoaFisica pessoaF = new PessoaFisica();
		PessoaJuridica pessoaJ = new PessoaJuridica();
		//Contribuinte cont = new Contribuinte();
		Scanner ent = new Scanner(System.in);
		int resp=0;
		boolean sair = false;
		int contador = 0;
		do{
			System.out.println("Digite '1' para pessoa fisica\nDigite '2' para pessoa juridica\n");
			resp = ent.nextInt();
			if(resp == 1){
				System.out.println("Informe o nome do contribuinte nº " + (contador+1) + ": ");
				pessoaF.setNomePos(contador, ent.next());
				
			}if(resp == 2){
				System.out.println("Informe o nome do contribuinte nº " + (contador+1) + ": ");
				pessoaJ.setNomePos(contador, ent.next());
				
			}if((contador >= 5) || (resp>2) || (resp<1)){
				System.out.println("Saiu");
				sair = true;
			}
			contador++;
		}while(sair==false);
		/*
		for(int i = 0; i < cont.getNome().length; i++){
			System.out.println("Informe o nome do contribuinte nº " + (i+1) + ": ");
			cont.setNomePos(i, ent.next());
		}
		*/
		System.out.println(pessoaF);
		System.out.println(pessoaJ);
		
	}
}