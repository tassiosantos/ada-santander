package Aula04;

public class A04EX05 {
        public static void main(String[] args) {
            String[] entradas = {
                    "amor",
                    "cocada",
                    "mora",
                    "ovo",
                    "cachorro",
                    "kaka",
                    "saudades",
                    "palalelepipedo",
                    "fofocalizando",
                    "papagaio",
                    "ateiaateiab"
            };

            int[] saidas = {
                    0,
                    1,
                    0,
                    1,
                    1,
                    -1,
                    2,
                    9,
                    4,
                    4,
                    10
            };

            for (int i = 0; i < entradas.length; i++) {
                double resultado = primeiroCaractereUnico(entradas[i]);
                double esperado = saidas[i];

                System.out.println("Resultado: " + resultado);
                System.out.println("Esperado: " + esperado);
                System.out.println(resultado == esperado);
                System.out.println();
            }
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
