package Aula02.Exercicio2;

import java.util.Scanner;

public class Frutaria {
    public static void main(String[] args) {
        String[] frutas = {"Pêra", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] qtdFrutas = new int[frutas.length];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < qtdFrutas.length; i++) {
            System.out.println("Digite a quantidade de " + frutas[i] + "s: ");
            qtdFrutas[i] = read.nextInt();
        }

        double precoTotal = calcularPrecoTotal(qtdFrutas);

        System.out.printf("O preço final é %.2f", precoTotal);

    }

    private static double calcularPrecoTotal(int[] qtdFrutas) {
        double precoTotal = 0;
        for (int qtdFruta : qtdFrutas) {
            precoTotal += calcularPreco(qtdFruta);
            System.out.println(precoTotal);
        }

        return precoTotal;
    }


    public static double calcularPreco(int qtd){
        if(qtd<=10){
            return 1.45*qtd;
        }else{
            return 1.25*qtd;
        }
    }





}
