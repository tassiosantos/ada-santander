package Aula02.Exercicio3;

import static Aula02.Exercicio3.Sort.sortAscendingOrder;

public class Separate {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};

        separateOdd(numbers);
        separateEven(numbers);

    }

    private static void separateOdd(int[] numbers) {
        sortAscendingOrder(numbers);
        for (int num: numbers) {
            if(num%2 != 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }


    private static void separateEven(int[] numbers) {
        sortAscendingOrder(numbers);
        for (int num: numbers) {
            if(num%2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }
}
