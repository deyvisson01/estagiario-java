package br.com.mobitbrasil.ped.q6;

/**
 * CarroPasseio
 */
public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;

    public String exibe() { // Descrição de como as informações da classe devem ser exibidas.
        return "Carro de Passeio! \n Motor: "+this.motor+"\t Peça: "+this.peca+"\t Cor: "+this.cor+"\t Modelo: "+this.modelo;
    }

    CarroPasseio() { // Construtor com valores default.
        setMotor(new Motor(10, 20));
        setPeca(new Peca("marca1", "descricao1"));
        setCor("Azul");
        setModelo("Modelo_1");
    }

    CarroPasseio(Motor motor, Peca peca, String cor, String modelo){ // Construtor com valores da entrada.
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