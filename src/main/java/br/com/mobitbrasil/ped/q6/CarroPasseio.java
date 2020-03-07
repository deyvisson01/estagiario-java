package br.com.mobitbrasil.ped.q6;

/**
 * CarroPasseio
 */
public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;
    //static Motor motor = new Motor(10, 20);
    //Peca peca = new Peca("marca1", "descricao1");

    public String exibe() {
        return "Carro de Passeio! \n Motor: "+this.motor+"\t Peça: "+this.peca+"\t Cor: "+this.cor+"\t Modelo: "+this.modelo;
    }

    CarroPasseio() {
        setMotor(new Motor(10, 20));
        setPeca(new Peca("marca1", "descricao1"));
        setCor("Azul");
        setModelo("Modelo_1");
    }

    CarroPasseio(Motor motor, Peca peca, String cor, String modelo){
        setMotor(motor);
        setPeca(peca);
        setCor(cor);
        setModelo(modelo);
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}