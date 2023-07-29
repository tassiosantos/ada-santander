package aula08;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A08EX03 {

    public static void main(String[] args) {
        System.out.println(valorProdutoFinal(new double[]{220.50, 3.0}));
    }

    public static double valorProdutoFinal(double[] input) {
        double estado = input[1];
        double valor = input[0];
        double imposto = 0;

        switch((int) estado){
            case 1:
                imposto = .07;
                break;
            case 2:
                imposto = .12;
                break;
            case 3:
                imposto = .15;
                break;
        }

        return arredondar(valor*(1 + imposto));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

}
