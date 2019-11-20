package com.db1.db1start;

import java.sql.Date;
import java.util.List;

public class Aulas {
	 
	public Date data ;
	public Materia materia;
	public List<Alunos> Alunos;
	
	@Override
	public String toString() {
		return "Aulas [data=" + data + ", Materia=" + materia + ", Alunos=" + Alunos + "]";
	}
	
	         
	 
}
