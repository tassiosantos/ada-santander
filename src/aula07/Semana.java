package aula07;

public enum Semana {
    SEGUNDA(1, new String[]{"segunda-feira", "seg"}),
    TERCA(2, new String[]{"terça-feira", "ter"}),
    QUARTA(3, new String[]{"quarta-feira", "qua"}),
    QUINTA(4, new String[]{"quinta-feira", "qui"}),
    SEXTA(5, new String[]{"sexta-feira", "sex"}),
    SABADO(6, new String[]{"sábado", "sab"}),
    DOMINGO(7, new String[]{"domingo", "dom"});

    final int valor;
    final String[] dia;
    private Semana(int valor, String[] dia) {
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
        throw new IllegalArgumentException();
    }

    public static Semana getEnumValue(String valor){
        Semana[] dias = Semana.values();
        for (Semana dia: dias) {
            for (int i = 0; i < dia.getDias().length; i++) {
                if(valor.equalsIgnoreCase(dia.getDias()[i])){
                    return dia;
                }

            }

        }
        throw new IllegalArgumentException();
    }




    public String getDia() {
        return dia[0];
    }

    public String[] getDias(){
        return dia;
    }

    public int getValor() {
        return valor;
    }
}
