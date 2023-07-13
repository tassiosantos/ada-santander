package Exercicio1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        double far;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");

        far = scan.nextDouble();

        System.out.println("A temperatura em celsius é: " + convertFahrToCelsius(far));

        scan.close();

    }

    public static double convertFahrToCelsius(double fahr){
        return 5 * ((fahr - 32) / 9);
    }
}
