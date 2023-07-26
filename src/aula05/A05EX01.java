package aula05;

import java.util.Scanner;

public class A05EX01 {
    public static void main(String[] args) throws ComprasInvalidasExceptions {
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

    private static double calcularPrecoTotal(int[] qtdFrutas) throws ComprasInvalidasExceptions {
        validarItens(qtdFrutas);
        double precoTotal = 0;
        for (int qtdFruta : qtdFrutas) {
            precoTotal += calcularPreco(qtdFruta);
        }

        return precoTotal;
    }


    public static double calcularPreco(int qtd) throws ComprasInvalidasExceptions {
        if(qtd<=10){
            return 1.45*qtd;
        }else{
            return 1.25*qtd;
        }
    }

    private static void validarItens(int[] itens) throws ComprasInvalidasExceptions {
        int total = 0;
        for (int qtd: itens) {
            if(qtd < 0){
                throw new ComprasInvalidasExceptions("A quantidade de itens não pode ser negativa.");
            }else{
                total += qtd;
            }
            if(total == 0){
                throw new ComprasInvalidasExceptions("O carrinho não pode estar vazio");
            }

        }

    }



}
