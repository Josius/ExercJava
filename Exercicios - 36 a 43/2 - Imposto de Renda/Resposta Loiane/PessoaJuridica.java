public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;
	
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public double calcularImposto(){
		return this.getRendaBruta()*0.1;
		//return (this.getRendaBruta()/100)*10;
	}
	
	public String toString(){
		String s = "Pessoa Juridica\n";
		s += super.toString();
		s += "\nCNPJ: " + cnpj;
		s += "\nImposto a ser pago: " + calcularImposto();
		
		return s;
	}
}