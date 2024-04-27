
/**
 * *
 * 
 * @author Daniel Costa
 * 
 **/

import SequenceManipulation.Fibonacci;
import UserUtilManager.InputHandler;

public class Questao02 {

    public static void main(String[] args) {

        Fibonacci fibo = new Fibonacci();
        InputHandler Input = new InputHandler();

        fibo.calculaFibonacci(Input.getNumero());

    }
}