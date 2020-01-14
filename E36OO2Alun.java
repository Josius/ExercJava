//aluno

public class E36OO2Alun{
	private String nome;
	private String matricula;
	private double[] nota;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public double[] getNota(){
		return nota;
	}
	public void setNota(double[] nota){
		this.nota = nota;
	}
	
	public String obterInfo(){
		String info = "Nome Aluno = " + nome + "; ";
		info += "Matricula = " + matricula + "; ";
		info += "Notas: ";
		
		double soma = 0;
		
		for(double nota : notas){
			soma += nota;
			info+= nota + " " ;
		}
		double media = soma/4;
		info += "\n" + "Media = " + media + " - ";
		if(media >= 7){
			info += "Aprovado";
		}else{
			info += "Reprovado";
		}
		
		return info;
	}
}