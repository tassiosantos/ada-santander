package Aula03;

import java.util.ArrayList;
import java.util.Arrays;

public class CompraVeiculo {

    public static void main(String[] args) {
        double[] array = {53000,
                2350,
                8450};
        System.out.println(Arrays.toString(custosCarro(array)));

    }
    public static double[] custosCarro(double[] input) {
        double[] percent = new double[2];
        double distribuidor = 100*(input[1]/input[0]);
        double impostos = 100*(input[2]/input[0]);

        String manipular = String.valueOf(distribuidor);
        String inteiro = manipular.split("\\.")[0];
        String decimal = manipular.split("\\.")[1];

        if(Double.valueOf(decimal.substring(2,3)) < 5){
            distribuidor = Double.valueOf((inteiro + "." + decimal.substring(0,2)));
        }else{
            decimal = String.valueOf(Double.valueOf(decimal.substring(0,2)) + 1);
            distribuidor = Double.valueOf((inteiro + "." + decimal.substring(0,2)));
        }

        manipular = String.valueOf(impostos);
        System.out.println(manipular.split("\\.")[1]);
        inteiro = manipular.split("\\.")[0];
        decimal = manipular.split("\\.")[1];
        System.out.println(decimal.charAt(2));
        if(Double.valueOf(decimal.substring(2,3)) < 5){
            impostos = Double.valueOf((inteiro + "." + decimal.substring(0,2)));
        }else{
            decimal = String.valueOf(Double.valueOf(decimal.substring(0,2)) + 1);
            impostos = Double.valueOf((inteiro + "." + decimal.substring(0,2)));
        }

//        percent[0] = 100*(input[1]/input[0]);
//        percent[1] = 100*(input[2]/input[0]);
        percent[0] = distribuidor;
        percent[1] = impostos;
        return percent;
    }



}
