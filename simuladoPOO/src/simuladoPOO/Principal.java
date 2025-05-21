package simuladoPOO;


/*
 * 
 * Corrija os erros do projeto
 * Implemente o que se pede na interface
 * implemente o que se pede na classe abstrata
 * 
 * 1 - As pessoas juridicas tem os campos (nome, endereco, telefone, cnpj, nomeFantasia, valorMensal)
 * 2 - As pessoas Físicas tem os campos (nome, endereço, telefone, cpf, filiacao, valorMensal)
 * 3 - Ao escolher no menu, pessoa fisica, entrar com uma tela para entrar com os dados da pessoa
 * 	3.1 - o valorFatura não deve ter seu valor digitado e sim calculado
 * 4 - Ao escolher no menu, pessoa juridica, entrar com uma tela que vai entrar com os dados da pessoa
 * 	4.1 - o valorFatura não deve ter seu valor digitado e sim calculado
 * 5 - Ao final da entrada dos dados, calcular a fatura de cada pessoa
 * 	5.1 - caso seja pessoa física, a fatura deverá ser 12.5% do valor mensal
 * 	5.2 - Caso seja pessoa juridica, a fatura deverá ser 3.5% do valor mensal
 * 6 - Ao final da entrada dos dados, deve-se calcular o valor da fatura e mostrar em tela, voltando para o menu logo após isto
 * 7 - O valor digitado para sair do sistema, deve ser 99
 * 
 * Obs: Não esquecer do encapsulamento dos atributos 
 * 
 */

import pessoa.Fisica;
import pessoa.Juridica;
import pessoa.PessoaAbstract;
import simuladoPOO.menu.Menu;

public class Principal {

	public static void main(String[] args) {

		PessoaAbstract pessoa;
		
        int menu = 0;



		
		while (menu != 99) {

			
			switch (menu) {
			case 1 :
				pessoa = new Fisica();
				pessoa.telaEntradaDados();
				pessoa.setValorFatura(pessoa.faturar());
				System.out.print("O valor da fatura de  " + pessoa.getNome() + " foi: " + pessoa.getValorFatura()+"\n");;
				break;

			case 2 :
				pessoa = new Juridica();
				pessoa.telaEntradaDados();
				pessoa.setValorFatura(pessoa.faturar());
				System.out.print("O valor da fatura de  " + pessoa.getNome() + " foi: " + pessoa.getValorFatura()+"\n");;
				break;

			}


			menu = Menu.mostrar();

		}
	}
}
