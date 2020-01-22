public class PessoaFisica extends Contribuinte{
	private double impostoPF;
	
	public double getImpostoPF(){
		return impostoPF;
	}
	public void setImpostoPF(double impostoPF){
		this.impostoPF = impostoPF;
	}
	
	public void calcularImpostoPF(getRenda()){
		if(getRenda() <= 1400){
			System.out.println("Nao ha imposto a ser calculado");
		}if((getRenda() >1400) && (getRenda() <= 2100)){
			impostoPF = (getRenda()*10)/100 + getRenda();
		}if((getRenda() >2100) && (getRenda() <= 2800)){
			impostoPF = (getRenda()*15)/100 + getRenda();
		}if((getRenda() >2800) && (getRenda() <= 3600)){
			impostoPF = (getRenda()*25)/100 + getRenda();
		}if(getRenda() >3600){
			impostoPF = (getRenda()*30)/100 + getRenda();
		}
		
	}
}