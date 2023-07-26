package aula06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A06EX01 {

    public static void main(String[] args) {

        System.out.println(valorProdutoFinal(250.10, ImpostoEstadual.MG) == 267.607);
        System.out.println(valorProdutoFinal(250.10, ImpostoEstadual.RJ) == 287.615);
        System.out.println(valorProdutoFinal(250.10, ImpostoEstadual.SP) == 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, ImpostoEstadual estado) {
        return arredondar(valorProduto*(1+estado.getValor()));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
