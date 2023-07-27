package aula07;

public class A07EX02 {
    public static void main(String[] args) {
        int limite = 6;
        System.out.println(fatorial(limite));
        System.out.println(fatorialRecursivo(limite));
    }

    public static int fatorial(int limite){
        int fatorial = 1;
        for(int i = limite; i >= 0; i--){
            if(i == 0)
                return fatorial;

            fatorial = fatorial*i;
        }
        return fatorial;
    }


    public static int fatorialRecursivo(int limite){
        if(limite == 0)
            return 1;

        return limite*fatorial(limite - 1);
    }
}
