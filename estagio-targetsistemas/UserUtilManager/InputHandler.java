package UserUtilManager;

import java.util.Scanner;

/**
 * *
 * 
 * @author Daniel Costa
 * @version 1.0
 * 
 **/
public class InputHandler {

    // Referência para teclado que receberá uma instância da Classe Scanner, aqui
    // declarada como estática para poder ser utilizada em qualquer parte do código
    private Scanner teclado = new Scanner(System.in);
    private int n;
    private boolean status = false;

    // Método que recebe o número digitado pelo usário e faz o tratamento de
    // exceções
    public int getNumero() {
        while (status == false) {
            try {
                System.out.print("Por favor digite um número positivo: ");

                // Recebe o valor como String e converte para Int, um tratamento de exceção foi
                // utilizado para nos casos onde o usuário digite um valor não númerico receba o
                // aviso informado no catch
                n = Integer.parseInt(teclado.nextLine());

                // Atribui true ao status para prosseguir com a aplicação
                status = true;

            } catch (NumberFormatException e) {
                System.out.print("O valor digitado não é um número. ");
                status = false;
            }
        }

        return n;
    }
}
