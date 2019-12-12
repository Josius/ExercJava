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

//RESPOSTAS LOIANNE

//1
/*
public class Exer01 {

    public static void main(String[] arg){

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}
*/

//2
/*
public class Exer02 {

    public static void main(String[] args){

        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
*/

//3
/*
public class Exer03 {

    public static void main(String[] args){

        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
*/

//4
/*
public class Exer04 {

    public static void main(String[] args){

        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro = " + livro.nome);
    }
}
*/

//5
/*
public class Exer05 {

    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
*/

//6
/*
public class Exer06 {

    public static void main(String[] args){

        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";
    }
}
*/

