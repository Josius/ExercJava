import java.util.Arrays;

public abstract class Contribuinte{
	private String[] nome;
	
	public Contribuinte(){
		nome = new String[6];
	}
	
	public String[] getNome(){
		return nome;
	}
	public void setNome(String[] nome){
		this.nome = nome;
	}
	public void setNomePos(int pos, String nome){
		this.nome[pos] = nome;
	}
	
	public String toString(){
		return Arrays.toString(nome) ;
	}
}