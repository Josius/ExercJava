public class Mamifero extends Animal{
	
	private String alimento;
	 
	public String getAlimento(){
		return alimento;
	}
	public void setAlimento(String alimento){
		this.alimento = alimento;
	}
	
	public String toString(){
		
		String s = super.toString();	
		s += "\nAlimento: " + alimento;
		
		return s;
	}
}