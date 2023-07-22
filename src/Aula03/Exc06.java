package Aula03;

import Aula04.LadosInvalidosException;

import javax.sound.midi.Soundbank;

public class Exc06 {
    public static void main(String[] args) {
        Double a = 7.0;
        Double b = 4.0;
        Double c = 2.0;

        try {
            Double area = calcularAreaTriangulo(a, b, c);
            System.out.printf("A área do triango de lados %.2f, %.2f, %.2f é: %.2f ", a, b, c, area);
        } catch (LadosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Double calcularAreaTriangulo(Double a, Double b, Double c) throws LadosInvalidosException {
        eUmTriangulo(new Double[]{a, b, c});
        Double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


    public static void eUmTriangulo(Double[] input) throws LadosInvalidosException {
        Double a = input[0];
        Double b = input[1];
        Double c = input[2];
        if(!((a + b > c)&&(a + c >b)&&(b + c > a))){
            throw new LadosInvalidosException("Lados não formam triangulo");
        }
    }


}
