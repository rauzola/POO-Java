package com.db1.db1start;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProfessorTest {

	public class ProfessorTeste{
		                                                                
		@Test                                                           
		public void deveCriarProfessorPorMeioDoConstrutor() {           
			String email = "Fake@gmail.com";                            
			String nome = "Fake";                                       
			                                                            
			Professor professor = new Professor (email, nome);          
			                                                            
			Assert.assertEquals(email, professor.getEmail());           
			Assert.assertEquals(nome, professor.getNome());
		}
		
		
	}
}
