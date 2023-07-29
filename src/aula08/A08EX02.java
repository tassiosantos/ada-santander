package aula08;

import java.util.ArrayList;
import java.util.Arrays;

public class A08EX02 {


    public static void main(String[] args) {
        System.out.println(Arrays.asList(substringStr(new String[]{"casa", "asmor", "as"})));
    }



    public static String[] substringStr( String[] input) {
        String subs = "";
        for (String palavra: input) {
            for (String pal: input) {
                if(pal.equalsIgnoreCase(palavra))
                    continue;

                if(palavra.contains(pal))
                    if(!verificaIguais(subs, pal))
                        subs += pal + ",";
            }
        }

        return subs.split(",");
    }

    public  static boolean verificaIguais(String subs, String pal){
        String[] subsArray = subs.split(",");
        for (int i=0; 1 < subsArray.length; i++) {
            if(pal.equalsIgnoreCase(subsArray[i]))
                return true;
            if(i == subsArray.length-1)
                return false;
        }
        return false;
    }


}
