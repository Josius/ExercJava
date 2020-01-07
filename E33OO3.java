//EXERCICIOS AULA 33

//Exercicio 3 - Aluno
public class E33OO3{
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplina;
	private double[][] notasDisciplinas;
	
	public E33OO3(){
		nomeDisciplina = new String[3];
		notasDisciplinas = new double[3][4];
	}
	
	public E33OO3(String nome, String matricula, String nomeCurso){
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplina = new String[3]; 
		this.notasDisciplinas = new double[3][4];
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String Matricula){
		this.matricula = matricula;
	}
	
	public String getNomeCurso(){
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	public String[] getNomeDisciplina(){
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String[] nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public double[][] getNotasDisciplinas(){
		return notasDisciplinas;
	}
	public void setNotasDisciplinas(double[][] notasDisciplinas){
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void mostrarInfo(){
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length; i++){
			System.out.println("Notas da Disciplina " + nomeDisciplina[i]);
			for(int j=0; j<notasDisciplinas[i].length; j++){
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean verificarAprovado(int indice){
		if(obterMedia(indice) >= 7){
			return true;
		}
		return false;
	}
	
	private double obterMedia(int indice){
		double soma = 0;
		
		for(int i=0; i<notasDisciplinas[indice].length; i++){
			soma+=notasDisciplinas[indice][i];
		}
		
		double media = soma/4;
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
		this.nomeDisciplina[pos] = nomeDisciplina;
	}
	
	public void setNomePosIJ(int posI, int posJ, double nota){
		this.notasDisciplinas[posI][posJ] = nota;
	}

	
}