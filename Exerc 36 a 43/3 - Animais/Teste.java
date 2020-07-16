public class Teste{
	public static void main(String[] args){
		
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero ursoDoCanada = new Mamifero();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		ursoDoCanada.setNome("Urso do Canada");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		
		System.out.println(camelo);
		System.out.println(tubarao);
		System.out.println(ursoDoCanada);
	}
}