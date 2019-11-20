package com.db1.db1start;



public abstract class Pessoas{

	private String email;
	private String nome;
	
	
	
	
	
	public Pessoas (String email, String nome) {
		this.email = email;
		this.nome = nome;
	}

 


	public String getEmail() {
	
		return email;
}


	public String getNome() {
	
		return nome;
}


	@Override
	public String toString() {
		return "Pessoas [email=" + email + ", nome=" + nome + "]";
	}
	
	

	      	
	
					
	}
	


