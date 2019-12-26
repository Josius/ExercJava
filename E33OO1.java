//EXERCICIOS AULA 33

//PROBLEMAS COM O ARRAY

//Exercicio 1 - Lampada
public class E33OO1{
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean ligada;
	
	public E33OO1(){}

	public E33OO1(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses){
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = new String[3];
		tipos[0] = "Abajur";
		tipos[1] = "Farolete";
		tipos[2] = "Lampião";
	}
	
	public String getModelo(){
		return this.modelo;
	}
	public String getTensao(){
		return this.tensao;
	}
	public int getPotencia(){
		return this.potencia;
	}
	public String getCor(){
		return this.cor;
	}
	public String getTipoLuz(){
		return this.tipoLuz;
	}
	public int getGarantiaMeses(){
		return this.garantiaMeses;
	}
	public String[] getTipos(){
		return this.tipos;
	}
	private boolean isLigada(){
		return this.ligada;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setTensao(String tensao){
		this.tensao = tensao;
	}
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public void setTipoLuz(String tipoLuz){
		this.tipoLuz = tipoLuz;
	}
	public void setGarantiaMeses(int garantiaMeses){
		this.garantiaMeses = garantiaMeses;
	}
	public void setTipos(String[] tipos){
		this.tipos = tipos;
	}
	public void setLigada(boolean ligada){
		this.ligada = ligada;
	}
	
	private void ligar(){
		this.ligada = true;
	}
	private void desligar(){
		this.ligada = false;
	}
	
	public void mudarEstado(){
		if(ligada){
			desligar();
		}else{
			ligar();
		}
	}
	
	public void mostrarEstado(){
		if(ligada){
			System.out.println("Lampada esta ligada");
		}else{
			System.out.println("Lampada esta desligada");
		}
	}
	
	public void info(){
		System.out.println(this.modelo);
		System.out.println(this.tensao);
		System.out.println(this.potencia);
		System.out.println(this.cor);
		System.out.println(this.tipoLuz);
		System.out.println(this.garantiaMeses);
		System.out.println(this.tipos);
	}
	
	
}