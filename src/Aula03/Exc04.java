package Aula03;

public class Exc04 {
    public static void main(String[] args) {
        System.out.println(primeiroCaractereUnico("uazaluoolzmnm"));

    }

    public static int primeiroCaractereUnico(String input) {
        String[] stringArray = input.split("");

        for (int i = 0; i < stringArray.length; i++) {

            for (int j = 0; j < stringArray.length; j++) {
                if(i == j){
                    if(i == stringArray.length - 1){
                        return i;
                    }
                    continue;
                }
                if(stringArray[i].equals(stringArray[j])){
                    break;
                }else{
                    if(j == stringArray.length - 1){
                        return i;
                    }
                }

            }



        }
        return -1;
    }
}
