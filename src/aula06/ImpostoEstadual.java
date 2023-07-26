package aula06;

public enum ImpostoEstadual {
    MG(0.07),
    SP(0.12),
    RJ(0.15);

    final double valor;

    private  ImpostoEstadual(Double valor){
        this.valor = valor;
    }


    public Double getValor(){return this.valor;}
}
