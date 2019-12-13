//EXERCICIOS AULA 24

//Exercicio 1 - Lampada
public class Exer{
	public static void main(String[] args){
		//Lampada
		E24OO lamp = new E24OO();
		
		lamp.modelo = "A60";
		lamp.tensao = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarelo";
		lamp.tipoLuz = "Amarelo";
		lamp.garantiaMeses = 36;
		
		lamp.tipos = new String[5];
		lamp.tipos[0] = "Lampiao";
		lamp.tipos[1] = "Abajur";
		
		System.out.println(lamp.modelo);
		System.out.println(lamp.tensao);
		System.out.println(lamp.potencia + "W");
		System.out.println(lamp.cor);
		System.out.println(lamp.tipoLuz);
		System.out.println(lamp.garantiaMeses + "Meses");
		System.out.println(lamp.tipos[1]);
	}
}