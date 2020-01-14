import java.util.Scanner;

public class E36OOExec{
	public static void main(String[] args){
		/*
		Scanner ent = new Scanner(System.in);
		
		//EXERCICIO 1
		E36OO1 agenda = new E36OO1();
		
		System.out.println("Entre com o nome da Agenda");
		agenda.setNomeAgenda(ent.nextLine());
		
		String nome;
		String telefone;
		String email;
		
		E36OO1Contatos[] contatos = new E36OO1Contatos[3];		
		
		//Abaixo, resolução Loiane
		for(int i=0; i<contatos.length; i++){
			E36OO1Contatos c = new E36OO1Contatos();//nesta linha, o objeto eh criado novamente, usando o mesmo nome de variavel, mas nao ocorre erro. Porque?
			System.out.println("Entre com as informações do contato " + (i+1));
			System.out.println("Entre com o nome");
			nome = ent.nextLine();
			c.setNome(nome);
			System.out.println("Entre com o telefone");
			telefone = ent.nextLine();
			c.setTelefone(telefone);
			System.out.println("Entre com o e-mail");
			email = ent.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null){
			System.out.println(agenda.obterInfo());
		}
		
	*/



/*
		E36OO1Contatos cont1 = new E36OO1Contatos();
		E36OO1Contatos cont2 = new E36OO1Contatos();
		E36OO1Contatos cont3 = new E36OO1Contatos();
		
		
		//System.out.println(agenda.getNomeAgenda());
		//System.out.println("");
		
		
		System.out.println("Nome do contato 1");
		cont1.setNome(ent.next());
		System.out.println("Telefone  do contato 1");
		cont1.setTelefone(ent.next());
		System.out.println("E-mail do contato 1");
		cont1.setEmail(ent.next());
		
		System.out.println("Nome do contato 2");
		cont2.setNome(ent.next());
		System.out.println("Telefone  do contato 2");
		cont2.setTelefone(ent.next());
		System.out.println("E-mail do contato 2");
		cont2.setEmail(ent.next());
		
		System.out.println("Nome do contato 3");
		cont3.setNome(ent.next());
		System.out.println("Telefone  do contato 3");
		cont3.setTelefone(ent.next());
		System.out.println("E-mail do contato 3");
		cont3.setEmail(ent.next());
		
		contatos[0] = cont1;
		contatos[1] = cont2;
		contatos[2] = cont3;
*/		
		
		//EXERCICIO 2 - RESOLUCAO LOIANE
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso:");
		String nome = ent.nextLine();
		
		System.out.println("Entre com o horario do curso:");
		String horario = ent.nextLine();
		
		System.out.println("Entre com o nome do professor:");
		String nomeProf = ent.nextLine();
		
		System.out.println("Entre com o departamento do professor:");
		String depProf = ent.nextLine();
		
		System.out.println("Entre com o email do professor:");
		String emailProf = ent.nextLine();
		
		E36OO2 curso = new E36OO2();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		E36OO2Prof professor = new E36OO2Prof();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("---Alunos---");
		
		E36OO2Alun[] alunos = new E36OO2Alun[5];
		for(int i=0; i<alunos.length; i++){
			
			System.out.println("Entre com o nome do aluno " + (i+1));
			String nomeAluno = ent.nextLine();
			
			System.out.println("Entre com a matricula do aluno " + (i+1));
			String matAluno = ent.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j < notas.length; j++){
				System.out.println("Entre com a nota " + (j+1));
				notas[j] = ent.nextDouble();
			}
			
			E36OO2Alun aluno = new E36OO2Alun();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNota(notas);
		}
		
		curso.setAluno(alunos);
		
		System.out.println(curso.obterInfo());
	}
	
}