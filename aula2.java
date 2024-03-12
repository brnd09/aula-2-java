package com.mycompany.aula;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float peso = 0;
        float maior = 0;
        float menor = 99999;
        int soma = 0;
        int i = 0;
        int qtd = 0;

        System.out.println("Quantos bois voce deseja: ");
        qtd = teclado.nextInt();

        for (i = 0; i < qtd; i++) {

            System.out.println("Me diga o peso dos bois: ");
            peso = teclado.nextFloat();
            soma += peso;
            
            if (peso > maior) {
                maior = peso;

            } 
            
            if (peso < menor) {
                menor = peso;

            }

        }
        float media = 0;

        media = soma / qtd;

        System.out.println("Media de peso dos bois: " + media);
        System.out.println("O menor boi pesa: " + menor);
        System.out.println("O maior boi pesa: " + maior);

    }
}
