package com.db1.db1start;

public class Alunos  extends Pessoas{

public Double nota;

public Alunos(String email, String nome) {
	super(email, nome);
}

@Override
public String toString() {
	return "Alunos [nota=" + nota + "]";
}




	
}
