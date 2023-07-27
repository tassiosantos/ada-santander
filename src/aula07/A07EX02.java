package aula07;

public class A07EX02 {
    public static void main(String[] args) {
        System.out.println(fatorial(4));
    }

    public static int fatorial(int limite){
        if(limite == 0)
            return 1;

        return limite*fatorial(limite - 1);
    }
}
