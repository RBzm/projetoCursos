package projetoAtividade;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classeCursos {
	
	protected String atributoCursos;
	
	protected int atributoCurso;

public String setCursos() {
		
        while(true) {
		
		//Recebo o valor do teclado na váriavel.	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o curso ou disciplina");
		
		//String variavelNome;
		
		this.atributoCursos = sc.nextLine();
		
		//Crio um padrão com RegEX.
		Pattern objetoPadrao = Pattern.compile("[A-Za-z ]+");
		
		Matcher objetoCombinado = objetoPadrao.matcher(this.atributoCursos); 
		
		//Verifico se padrão bate com o valor recebido na váriavel.
		boolean variavelVerificacao = objetoCombinado.matches();
		
		if(variavelVerificacao == true) {
			
			System.out.println("Curso ou disciplina recebido corretamente");
			
			break;
		}
		
		else {
		
			System.out.println("Não Permitido");
			continue;
		}
		
		
		          }
	
            return atributoCursos.toUpperCase();

	}

}



