package Exercicio3;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
    }


    private static int[] sortDescendingOrder(int[] originalNumbers) {
        int[] numbers = new int[originalNumbers.length];
        System.arraycopy(originalNumbers, 0, numbers, 0, originalNumbers.length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    int a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;

                }
            }
        }
        return numbers;
    }

    private static int[] sortAscendingOrder(int[] originalNumbers) {
        int[] numbers = new int[originalNumbers.length];
        System.arraycopy(originalNumbers, 0, numbers, 0, originalNumbers.length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                    int a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;

                }
            }
        }
        return numbers;
    }



}
