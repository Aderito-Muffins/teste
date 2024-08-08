package Aula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Aderito
 */
public class Home {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
            // Caso base: 0! = 1
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Deseja fazer?");
        System.out.println("1. Pilha ");
        System.out.println("2. Recursividade ");
        System.out.println("3. Vetor");
        Scanner in = new Scanner(System.in);
        String op = in.next();

        if (op.equals("1")) {
            System.out.println("Exercicio/Exemplos de Stack ");
            System.out.println(" ");
         Pilha.pilha();
           
        }

        if (op.equals("2")) {
            System.out.println("Exercicio de factorial sobre recursividade ");
            System.out.println(" ");
            System.out.println("Digite o valor para calculo do factorial");
            int factorial = in.nextInt();
            factorial(factorial);
        }

    }

}
