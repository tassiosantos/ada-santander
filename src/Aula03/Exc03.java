package Aula03;

public class Exc03 {
    public static double calculoSalario( double[] input) {
        double salarioFinal;
        if(input[0]>=1 && input[0]<5){
            salarioFinal = input[2] + (.01+input[1]/100)*input[2];
        }else if (input[0]>5 && input[0]<10){
            salarioFinal = input[2] +  (.015 + input[1]/100)*input[2];
        }else{
            salarioFinal = input[2] +  (.02 + (input[1]/100))*input[2];
        }


        return salarioFinal;
    }
}
