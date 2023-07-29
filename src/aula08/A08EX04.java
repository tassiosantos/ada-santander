package aula08;

import java.util.Arrays;

public class A08EX04 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(soletrandoInvertidoStr("amor")));
    }


    public static String[] soletrandoInvertidoStr(String input) {
        String revert = "";
        String[] letras = input.split("");
        for(int i = letras.length - 1; i>=0; i--){
            revert += letras[i];
        }
        return revert.split("");
    }
}
