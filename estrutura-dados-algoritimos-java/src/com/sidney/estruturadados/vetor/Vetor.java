package com.sidney.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	//Inst�ncia de um vetor de String
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	/*
	//Adicionar elementos no vetor *POUCO EFICI�NTE
	public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length;i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				//parar na primeira posi��o que se encontra null
				break;
			}
		}
	}*/
//	public void adiciona(String elemento) throws Exception {
//		
//		if(this.tamanho < this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;	
//		}else {
//			throw new Exception("Vetor j� esta cheio. N�o � poss�vel adiciobar mais elementos");
//		}
//		
//		
//	} OU 3.� Maneira melhorada
	
	public boolean adiciona(String elemento){

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		}
		return false;

	}
}
