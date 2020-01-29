import java.util.Scanner;

public class Contato implements Agenda{
	
	private String nome;
	private String[] telefone;
	private static int identificador;
	
	public Contato(){
		identificador++;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String[] getTelefone(){
		return telefone;
	}
	public void setTelefone(String[] telefone){
		this.telefone = telefone;
	}
	protected void setQtdTelefone(int qtdTelefone){
		telefone = new String[qtdTelefone];
	}
	public void setTelefonePos(int pos, String telefone){
		this.telefone[pos] = telefone;
	}
	
	public void adicionarContato(){
		Scanner ent = new Scanner(System.in);
				
		System.out.println("Digite nome");
		setNome(ent.next());
		
		System.out.println("Digite quantidade de telefones");
		setQtdTelefone(ent.nextInt());
		
		//String[] telefones = new String[qtdTelefone];
		
		for(int i=0; i<telefone.length; i++){
			System.out.println("Digite telefone " + (i+1));
			setTelefonePos(i, ent.next());
		}
	
	}
	
	public String toString(){
		String s = "Telefone: " + telefone + "\nNome: " + nome + "\nIdentificador: " + identificador;
		return s;
	}
	
}