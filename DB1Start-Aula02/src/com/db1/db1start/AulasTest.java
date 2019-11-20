package com.db1.db1start;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AulasTest {

	public class Aulas{
		
		@Test
		public void AulasTest() {
			String materia = "Matematica";
			String descricao = "Não sei matematica Basica ";
			
			Aulas aulas = new Aulas ();
			
			Assert.assertEquals(descricao, aulas.getClass());           
			Assert.assertEquals(materia, aulas.getClass());
		}
		
		
	}
}
