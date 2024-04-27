package SequenceManipulation;
import java.util.ArrayList;
import java.util.List;

/**
 * *
 * 
 * @author Daniel Costa
 * @version 1.0
 * 
 * Classe para calcular a sequencia Fibonacci a partir de um número informado pelo usuário
 * 
 **/
public class Fibonacci{


    // Referência para Lista isFibo, que será responsável por armazenar os números
    // da Sequência Fibonnaci
    private List<Integer> isFibo = new ArrayList<>();

    // Declaração das varíavis primitivas que servirão como controle para calculo da
    // Sequência Fibonacci
    private int a = 0, b = 1, temp;

    // Método que calcula a sequência Fibonacci
    public void calculaFibonacci(int n) {

        // Estrutura condicional principal da aplicação para examinar se o valor
        // digitado é positivo e se o mesmo pertence a Sequência Fibonacci
        if (n < 0) {
            System.out.print(" | Números negativos não são permitidos!");
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
            System.out.print((!isFibo.contains(n)) ? n +" | Não pertence a sequência Fibonacci!"
                    : n +" | Pertence a sequência Fibonacci!");
        } else {
            System.out.println("A lista de números Fibonacci está vazia!");
        }
    }
}