package aula03;

public class Exc05 {
    public static boolean elementosRepetidos(double[] input) {
        for(int i = 0; i< input.length; i++){
            if(i == input.length - 1){
                return false;
            }
            for(int j = i +1; j<input.length; j++){
                if(input[i] == input[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
