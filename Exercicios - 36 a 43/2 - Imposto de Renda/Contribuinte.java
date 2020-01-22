public class Contribuinte{
	private String nome;
	private double renda;
	private int[] contribuinte;
	
	public Contribuinte(){
		contribuinte = new int[6];
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getRenda(){
		return renda;
	}
	public void setRenda(double renda){
		this.renda = renda;
	}
	
	public int[] getContribuinte(){
		return contribuinte;
	}
	public void setContribuinte(int[] contribuinte){
		this.contribuinte = contribuinte;
	}
	
	public String toString(){
		
	}
}