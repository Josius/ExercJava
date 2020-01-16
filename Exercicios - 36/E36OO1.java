//Agenda

public class E36OO1{
	private String nomeAgenda;
	private E36OO1Contatos[] contatos;
	
	E36OO1(){
		
	}
	
	E36OO1(String nomeAgenda){
		this.nomeAgenda = nomeAgenda;
	}
	
	public String getNomeAgenda(){
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda){
		this.nomeAgenda = nomeAgenda;
	}
	
	public E36OO1Contatos[] getContatos(){
		return contatos;
	}
	public void setContatos(E36OO1Contatos[] contatos){
		this.contatos = contatos;
	}
	
	public String obterInfo(){
		String info = "Nome = " + nomeAgenda + "\n";
		
		if(contatos != null){
			for(E36OO1Contatos c : contatos){
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;
	}
	
}