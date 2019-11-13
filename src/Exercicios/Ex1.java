package Exercicios;

/**
 *
 * @author vitoria.csilva15
 */
public class Ex1 {

    /**
     * Dado um vetor de números inteiros, fazer um programa que imprimi todos os
     * elementos do vetor
     */

    public static void main(String[] args) {

        int n = 10;
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = i;
            System.out.println("O tamanho do vetor é: " + vetor[i]);
        }

    }
}
