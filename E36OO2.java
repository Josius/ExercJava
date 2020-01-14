//curso

public class E36OO2{
	private String nomeCurso;
	private String horario;
	private E36OO2Prof professor;
	private E36OO2Alun[] alunos;
	
	public String getNomeCurso(){
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}
	
	public String getHorario(){
		return horario;
	}
	public void setHorario(String horario){
		this.horario = horario;
	}
	
	public E36OOProf getProfessor(){
		return professor;
	}
	public void setProfessor(E36OOProf professor){
		this.professor = professor;
	}
	
	public E36OO2Alun[] getAluno(){
		return alunos;
	}
	public void setAluno(E36OO2Alun[] alunos){
		this.alunos = alunos;
	}
	
	public String obterInfo(){
		String info = "Nome do Curso = " + nomeCurso + "\n";
		
		if(professor != null){
			info += professor.obterInfo();
		}
		
		if(alunos != null){
			System.out.println("---Alunos---");
			for(E36OO2Alun aluno : alunos){
				if(aluno != null){
					info += aluno.obterInfo();
					info += "\n";
				}
				
			}
			info += "\nMedia da turma = " + obterMediaTurma();
		}
		return info;
	}
	
	public double obterMediaTurma(){
		double soma = 0;
		for(E36OO2Alun aluno : alunos){
			if(aluno != null){
				soma += aluno.obterMedia(); 
			}
		}
		return soma/alunos.length;
	}
	
}