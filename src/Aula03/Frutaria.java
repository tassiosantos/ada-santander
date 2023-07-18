package Aula03;

public class Frutaria {
    public static double custoCompra(double input) {
        if(input<=10){
            return 1.45*input;
        }else{
            return 1.25*input;
        }
    }
}
