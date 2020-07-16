import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		Contato contato = new Contato();
		
		System.out.println("Digite 1 para consultar contato\nDigite 2 para adicionar contato\n");
		int opcao = ent.nextInt();
		String resp = "S";
		
		do{			
			if(opcao == 1){
				
			}
			if(opcao == 2){
				contato.adicionarContato();
			}
			
			
			System.out.println("Deseja adicionar outro contato?(S/N)");
			resp = ent.next();
		}while(resp.equalsIgnoreCase("S"));
		
		System.out.println(contato);
	}
}