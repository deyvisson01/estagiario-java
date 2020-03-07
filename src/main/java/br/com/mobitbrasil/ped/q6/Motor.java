package br.com.mobitbrasil.ped.q6;

class Motor implements Exibir {
    private Integer potencia;
    private Integer cilindrada;

    public String exibe() {
        return "Potência: "+this.potencia+"\t Cilindrada: "+this.cilindrada;
    }

    Motor(Integer potencia, Integer cilindrada){
        setCilindrada(cilindrada);
        setPotencia(potencia);
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
}