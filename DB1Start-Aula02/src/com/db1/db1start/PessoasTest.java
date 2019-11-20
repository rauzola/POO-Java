package com.db1.db1start;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PessoasTest {

	public class Pessoas{
		
		@Test
		public void PessoasTest() {
			String nome = "Matematica";
			String Professor = "Não sei matematica Basica ";
			
			Pessoas pessoas = new Pessoas ();
			
			Assert.assertEquals(Professor, pessoas.getClass());           
			Assert.assertEquals(nome, pessoas.getClass());
		}
		
		
	}
}
