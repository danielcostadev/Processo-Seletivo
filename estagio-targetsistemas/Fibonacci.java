import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * *
 * 
 * @author Daniel Costa
 * 
 **/
public class Fibonacci {

    // Referência para Lista isFibo, que será responsável por armazenar os números
    // da Sequência Fibonnaci
    private List<Integer> isFibo = new ArrayList<>();

    // Declaração das varíavis primitivas que servirão como controle para calculo da
    // Sequência Fibonacci
    private int a = 0, b = 1, temp, n;

    // Referência para teclado que receberá uma instância da Classe Scanner, aqui
    // declarada como estática para poder ser utilizada em qualquer parte do código
    private Scanner teclado = new Scanner(System.in);

    // Método que recebe o número digitado pelo usário e faz o tratamento de
    // exceções
    public int getNumero() {

        try {
            System.out.print("Por favor digite um número positivo: ");

            // Recebe o valor como String e converte para Int, um tratamento de exceção foi
            // utilizado para nos casos onde o usuário digite um valor não númerico receba o
            // aviso informado no catch
            n = Integer.parseInt(teclado.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("O valor digitado não é um número!");
        }

        return n;
    }

    // Método que calcula a sequência Fibonacci
    public void calculaFibonacci(int n) {

        // Estrutura condicional principal da aplicação para examinar se o valor
        // digitado é positivo e se o mesmo pertence a Sequência Fibonacci
        if (n < 0) {
            System.out.println("Números negativos não são permitidos!");
        } else if (n <= 1) {
            isFibo.add(n);
        } else {
            // System.out.print("0");

            while (b <= n) {

                temp = a;
                a = b;
                b = temp + b;
                isFibo.add(b);
                // System.out.printf("..%d", b);
            }
        }
        // Estrutura condicional para verificar se a lista possui elementos.
        if (!isFibo.isEmpty()) {
            System.out.print((!isFibo.contains(n)) ? " Não pertence a sequência Fibonacci!"
                    : " Pertence a sequência Fibonacci!");
        } else {
            System.out.println("A lista de números Fibonacci está vazia!");
        }
    }
}