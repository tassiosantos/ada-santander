package aula08;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A08EX05 {


    public static void main(String[] args) {
        System.out.println(valorEntrada(new double[]{4.0, 50.00, 1.0}));
    }



    public static double valorEntrada(double[] input) {
        double dia = input[0];
        double valorEntrada = input[1];
        double musicaVivo = input[2];
        double descontoDia = 0;
        double descontoMusica = 0;
        double valorFinal = 0;

        switch ((int) musicaVivo){
            case(1):
                descontoMusica = 0.15;
                break;
            case(2):
                descontoMusica = 0;
                break;
        }

        switch ((int) dia){
            case 1:
                descontoDia = valorEntrada*(.25);
                break;
            case 2:
                descontoDia = valorEntrada*(.25);
                break;
            case 3:
                descontoDia = 0;
                break;
            case 4:
                descontoDia = valorEntrada*(.25);
                break;
            case 5:
                descontoDia = 0;
                break;
            case 6:
                descontoDia = 0;
                break;
            case 7:
                descontoDia = 0;
                break;
        }


        return arredondar((valorEntrada - descontoDia)*(1 + descontoMusica));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.###", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

}
