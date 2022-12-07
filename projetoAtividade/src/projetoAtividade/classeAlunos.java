package projetoAtividade;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classeAlunos {
	
	protected String atributoNome;
	
	protected String atributoNumero;
	
	protected String atributoCurso;
	
	protected int atributoAlunos;
	
	public String setNome() {
	
        while(true) {
		
		//Recebo o valor do teclado na váriavel.	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno");
		
		//String variavelNome;
		
		this.atributoNome = sc.nextLine();
		
		//Crio um padrão com RegEX.
		Pattern objetoPadrao = Pattern.compile("[A-Za-z ]+");
		
		Matcher objetoCombinado = objetoPadrao.matcher(this.atributoNome); 
		
		//Verifico se padrão bate com o valor recebido na váriavel.
		boolean variavelVerificacao = objetoCombinado.matches();
		
		if(variavelVerificacao == true) {
			
			System.out.println("Nome recebido corretamente");
			break;
		}
		
		else {
		
			System.out.println("Não Permitido");
			continue;
		}
	
		          }
	
            return atributoNome.toUpperCase();
	}


public String setNumero() {
	
    while(true) {
	
	//Recebo o valor do teclado na váriavel.	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o numero do aluno");
	
	//String variavelNome;
	
	this.atributoNumero = sc.nextLine();
	
	//Crio um padrão com RegEX.
	Pattern objetoPadrao = Pattern.compile("[0-9]+");
	
	Matcher objetoCombinado = objetoPadrao.matcher(this.atributoNumero); 
	
	//Verifico se padrão bate com o valor recebido na váriavel.
	boolean variavelVerificacao = objetoCombinado.matches();
	
	if(variavelVerificacao == true) {
		
		System.out.println("Sigla recebida corretamente");
		
		break;
	}
	
	else {
	
		System.out.println("Não Permitido");
		continue;
	}
	
	
	          }

        return atributoNumero.toUpperCase();

   }

}
