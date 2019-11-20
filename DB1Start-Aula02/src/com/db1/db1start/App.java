package com.db1.db1start;

import java.util.ArrayList;

public class App {

	public static void main(String [] args) {
	
		Alunos aluno1 = new Alunos( "raul_sigoli@hotmail.com",   "Raul Sigoli");
		Alunos aluno2 = new Alunos( "raul_sigoli@gamil.com",  "Raul Silva");
		

		Professor professor = new Professor("igor.silva@db1.com.br", "Igor Silva" );
	
		
		
		com.db1.db1start.Materia materia = new Materia();
		materia.nome = "POO";
		materia.descicao ="Abstação, encapullamento";
		materia.cargaHoraria = (int) 10.5;
		materia.quantidadedeaulas = 3;
		materia.professor = professor;
		
		
		Aulas aula = new Aulas();
		aula.materia = materia;
		aula.Alunos = new ArrayList<Alunos>();
		aula.Alunos.add(aluno1);
		aula.Alunos.add(aluno2);
		
		System.out.print(aula);
		
		
	}
}