public class Questao01 {

	private static final int INDICE = 13;
	private static int SOMA = 0;
	private static int K = 0;

	public static void main(String[] args) {

		while (K < INDICE) {
			K = K+1;

			SOMA = SOMA + K;
		}

        // De acordo com os testes o resultado final é 91
		System.out.println(SOMA);
	}

}