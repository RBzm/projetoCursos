package projetoAtividade;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classeProfessores {
		
		protected String atributoNomeProf;
		
		protected String atributoNumeroProf;
		
		protected String atributoDisciplinaProf;
		
		protected int atributoProf;
		
		public String setNome() {
		
	        while(true) {
			
			//Recebo o valor do teclado na váriavel.	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o nome do professor");
			
			//String variavelNome;
			
			this.atributoNomeProf = sc.nextLine();
			
			//Crio um padrão com RegEX.
			Pattern objetoPadrao = Pattern.compile("[A-Za-z ]+");
			
			Matcher objetoCombinado = objetoPadrao.matcher(this.atributoNomeProf); 
			
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
		
	            return atributoNomeProf.toUpperCase();
		}


	public String setNumero() {
		
	    while(true) {
		
		//Recebo o valor do teclado na váriavel.	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero do professor");
		
		//String variavelNome;
		
		this.atributoNumeroProf = sc.nextLine();
		
		//Crio um padrão com RegEX.
		Pattern objetoPadrao = Pattern.compile("[0-9]+");
		
		Matcher objetoCombinado = objetoPadrao.matcher(this.atributoNumeroProf); 
		
		//Verifico se padrão bate com o valor recebido na váriavel.
		boolean variavelVerificacao = objetoCombinado.matches();
		
		if(variavelVerificacao == true) {
			
			System.out.println("Numero recebida corretamente");
			
			break;
		}
		
		else {
		
			System.out.println("Não Permitido");
			continue;
		}
		
		
		          }

	        return atributoNumeroProf.toUpperCase();

	   }

}
