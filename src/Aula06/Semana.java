package Aula06;

public enum Semana {
    SEGUNDA(1, "segunda-feira"),
    TERCA(2, "terça-feira"),
    QUARTA(3, "quarta-feira"),
    QUINTA(4, "quinta-feira"),
    SEXTA(5, "sexta-feira"),
    SABADO(6, "sábado"),
    DOMINGO(7, "domingo");

    final int valor;
    final String dia;
    private Semana(int valor, String dia) {
        this.valor = valor;
        this.dia = dia;
    }



    public static Semana getEnumValueOf(String valor){

        switch (valor){
            case("segunda-feira"):
                return valueOf("SEGUNDA");
            case("terça-feira"):
                return valueOf("TERCA");
            case("quarta-feira"):
                return valueOf("QARTA");
            case("quinta-feira"):
                return valueOf("QUINTA");
            case("sexta-feira"):
                return valueOf("SEXTA");
            case("sábado"):
                return valueOf("SABADO");
            case("domingo"):
                return valueOf("DOMINGO");
        }
        return null;
    }

    public String getDia() {
        return dia;
    }

    public int getValor() {
        return valor;
    }
}
