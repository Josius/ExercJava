//EXERCICIOS AULA 24

//1
public class Lampada{
	double vidaUtil; //em horas
	double fluxoLuminoso;
	double tempCor; //em temperatura Kelvin
	int indRepCor; //indice de reprodução de cor, vária de 0 a 100;
	double preco;
}

//2
public class Livro{
	String nome;
	String tipoCapa; //dura, mole
	String editora;
	String idioma;
	int ISBN;
	int dimensoes; //larg X Comp X Alt
	double peso;
	int qtdPaginas;
}

//3
public class LivroDeLivraria{
	double preço;
	long codBarra;
	String endLivraria; //em qual estante o livro se encontra
	String tema; //do que o livro se trata, ficção, infantil, economia, etc..
	int estoque; //qtd na livraria
}

//4
public class LivroDeBiblioteca{
	String endBiblioteca;
	String tema;
	long codBarra;
	String estado; //emprestado, indisponível, disponível
}

//5
public class ContaCorrente{
	int numContaCorrente;
	double saldo;
	char status;
	double limite;
}

//6
public class Contato{
	String nome;
	int num;
	String tipo; //celular, casa, trabalho.
	String email;
	String tipoEmail; //casa, trabalho
}
