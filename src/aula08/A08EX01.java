package aula08;

public class A08EX01 {
    public static void main(String[] args) {
//        System.out.println(766/100);
        System.out.println(somaAlgarismos(665));
    }



    public static int somaAlgarismos(int input) {
        int soma = 0;
        if(input > 0){
            String inputString = String.valueOf(input);
            for (int i =0; i<inputString.length(); i++ ) {
                    soma += Integer.parseInt(String.valueOf(inputString.charAt(i)));
            }
        }
        else{
            return -1;
        }
        return soma;

    }



}
