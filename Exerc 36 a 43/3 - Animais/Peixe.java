public class Peixe extends Animal{
	
	private String caracteristicas;
	
	public Peixe(){
		super.setPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzenta");
		caracteristicas = "Barbatanas e Cauda";
	}
	
	public String getCaracteristicas(){
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas){
		this.caracteristicas = caracteristicas;
	}
	
	public String toString(){
		
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristicas;	
		
		return s;
	}
}