public interface Agenda{
		
	void adicionarContato();
	
	//String consultarContato();
	/*{
		Scanner ent = new Scanner(System.in);
		
		//int qtdTelefone = 0;
				
		System.out.println("Digite nome");
		this.setNome(ent.next());
		
		System.out.println("Digite quantidade de telefones");
		setQtdTelefone(ent.nextInt());
		
		//String[] telefones = new String[qtdTelefone];
		
		for(int i=0; i<qtdTelefone; i++){
			System.out.println("Digite telefone " + (i+1));
			setTelefonePos(i, ent.next());
		}
	
	}*/
	/*
	public void adicionarContato(){
		for(int i=0; i<contatos.length; i++){
			Contato c = new Contato();
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
	}*/
}