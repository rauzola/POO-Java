package com.db1.db1start;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MateriaTest {

	public class MatetiaTest{
		
		@Test
		public void deveCriarProfessorPorMeioDoConstrutor() {
			String nome = "Matematica";
			String descricao = "Não sei matematica Basica ";
			
			Materia materia = new Materia ();
			
			Assert.assertEquals(descricao, materia.getClass());           
			Assert.assertEquals(nome, materia.getClass());
		}
		
		
	}
}
