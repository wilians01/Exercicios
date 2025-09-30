package exercicios;

import java.util.Scanner;

public class Exercicio01 {


    public static void main(String[] args) {

        double largura, comprimento, metroQuadrado, area, preco;


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a largura da área ?");
        largura = sc.nextDouble();
        System.out.println("Qual é a comprimento da área ?");
        comprimento = sc.nextDouble();
        System.out.println("Qual é o valor do metro quadrado ?");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("A área do terreno é de %.2f metros quadrados e o preço do terreno é %.2f", area, preco);

        sc.close();
    }
}
