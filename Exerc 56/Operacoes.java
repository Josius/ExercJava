public enum Operacoes{
	
	SOMAR("+"){
		public double executarOperacao(double x, double y){
			//return Calular.somar(double x, double y);
			return x+y;
		}
	}, SUBTRAIR("-"){
		public double executarOperacao(double x, double y){
			//return Calular.subtrair(double x, double y);
			return x-y;
		}
	}, MULTIPLICAR("*"){
		public double executarOperacao(double x, double y){
			//return Calular.multiplicar(double x, double y);
			return x*y;
		}
	}, DIVIDIR("/"){
		public double executarOperacao(double x, double y){
			//return Calular.dividir(double x, double y);
			return x/y;
		}
	};
			
	private String simbolo;
	
	Operacoes(String simbolo){
		this.simbolo = simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	//do exercicio, resposta do num 3 abaixo
	public String toString(){
		return this.simbolo;
	}
	/*
	public String getSimbolo(){
		return simbolo;
	}*/
	
	/*
	public String toString(){
		String s = "Operacao Realizada: ";
		
		if(Operacoes == SOMAR){
			s+= "+";
		}if(Operacoes == SUBTRAIR){
			s+= "-";
		}if(Operacoes == MULTIPLICAR){
			s+= "*";
		}if(Operacoes == DIVIDIR){
			s+= "/";
		}
		
		return s;
	}*/
}