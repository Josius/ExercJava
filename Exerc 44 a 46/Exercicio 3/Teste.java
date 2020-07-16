public class Teste{
	public static void main(String[] args){
		
		Triangulo tri = new Triangulo();
		Quadrado qua = new Quadrado();
		Circulo cir = new Circulo();
		
		Piramide pir = new Piramide();
		Cubo cub = new Cubo();
		Cilindro cil = new Cilindro();
		
		tri.setBase(4);
		tri.setAltura(3);
		qua.setLado(3.5);
		cir.setRaio(4);
		
		tri.calcularArea();
		qua.calcularArea();
		cir.calcularArea();
		
		pir.setLado(5);
		pir.setAltura(5);
		cub.setAresta(2);
		cil.setRaio(2);
		cil.setAltura(3);
		
		pir.calcularArea();
		cub.calcularArea();
		cil.calcularArea();
		cil.calcularAreaLateral();
		
		pir.calcularVolume();
		cub.calcularVolume();
		cil.calcularVolume();
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = tri;
		figuras[1] = qua;
		figuras[2] = cir;
		figuras[3] = pir;
		figuras[4] = cub;
		figuras[5] = cil;
		
		for(FiguraGeometrica figura : figuras){
			System.out.println(figura);
		}
		
	}
}