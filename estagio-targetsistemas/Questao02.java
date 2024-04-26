import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao02 {

    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {

        List<Integer> isFibo = new ArrayList<>();

        try {

            System.out.print("Por favor digite um número positivo: ");
            int n = Integer.parseInt(teclado.nextLine());

            if (n > 0 && n <= 1) {
                System.out.println(n);
            } else if (n < 0) {
                System.out.println("Por favor digite um número positivo!");
            } else {
                int a = 0, b = 1, temp;

                System.out.print("0");

                for (int i = 1; i <= n; i++) {
                    temp = a;
                    a = b;
                    b = temp + b;
                    isFibo.add(b);

                    System.out.printf("..%d", b);
                }
                System.out.print((!isFibo.contains(n)) ? " Não pertence a sequência Fibonacci!"
                        : " Pertence a sequência Fibonacci!");
            }

        } catch (NumberFormatException e) {
            System.out.println("O valor digitado não é um número!");
        }
    }
}