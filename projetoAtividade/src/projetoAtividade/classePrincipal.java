package projetoAtividade;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classePrincipal {

		static String variavelNome = null;
		
		public static void main(String[] args) {
			
			classeAlunos objetoAlunos = new classeAlunos();
			
			String variavelNome = objetoAlunos.setNome();
			
			String variavelNumero = objetoAlunos.setNumero();
			
            classeCursos objetoCurso = new classeCursos();
            
            String variavelCursos = objetoCurso.setCursos();
            
            classeProfessores objetoProfessor = new classeProfessores();
			
			String variavelNomeProf = objetoProfessor.setNome();
			
			String variavelNumeroProf = objetoProfessor.setNumero();
            
            String variavelCursosProf = objetoCurso.setCursos();
			
			System.out.printf("O aluno escolhido eh %s e o " + "numero eh %s.O curso eh %s. ", variavelNome, variavelNumero, variavelCursos);
			System.out.printf("O professor escolhido eh %s e o " + "numero eh %s. a disciplina eh %s.", variavelNomeProf, variavelNumeroProf, variavelCursosProf);
		}
		
		
	}
