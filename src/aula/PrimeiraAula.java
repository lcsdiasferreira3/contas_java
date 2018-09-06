package aula;

public class PrimeiraAula {
	public static void main(String args[]) {

		// variavel do tipo primitivo inteiro
		int numero = 10, numero2 = 1, total = 0;

		/*
		 * Operadores matematicos + -> Adicao - -> Subtracao * -> Multiplicacao '/' ->
		 * Divisao
		 */

		total = numero * numero2;

		/*
		 * Operadores logicos > -> Maior que < -> Menor que == -> Igual >= -> Maior ou
		 * igual <= -> Menor ou igual != -> Diferente && -> E || -> Ou
		 */

		/*if (total > 10) {
			System.out.println(total);
		} else if (total == 10) {
			System.out.println("O valor é igual a 10");
		} else {
			System.out.println("O valor é inferior a 10");
		}*/

		/*
		 * Lacos de repeticao
		 * 
		 */

		int i = 0;
		
		
		/*while(i <= 10000) {
		 	System.out.println("A vida é bela");
		 	i = i + 1;
		}*/
		
		for(int x =0; x <= 10; x = x + 1) {
			System.out.println(x);
		}
	}
}
