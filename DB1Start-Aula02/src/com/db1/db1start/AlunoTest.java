package com.db1.db1start;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AlunoTest {

	
	@Test
	public void deveCriarAlunoPorMeioDoConstrutor() {
		String email = "raul.sigoli@hotmail.com";
		String nome = "Fake";
		Alunos aluno = new Alunos (email, nome);
		Assert.assertEquals(email, aluno.getEmail());
		Assert.assertEquals(nome, aluno.getNome());
	}
	
	
	
	
	
	
	
	
}
