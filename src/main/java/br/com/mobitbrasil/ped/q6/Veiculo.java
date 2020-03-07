package br.com.mobitbrasil.ped.q6;

/**
 * Veiculo
 */

abstract class Veiculo implements Exibir {
    protected Motor motor;
    protected Peca peca;

    public Motor getMotor() {
        return motor;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
}