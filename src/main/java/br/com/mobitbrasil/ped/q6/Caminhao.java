package br.com.mobitbrasil.ped.q6;

/**
 * Caminhao
 */
public class Caminhao extends Veiculo{
    private Integer toneladas;
    private Integer alturaMax;
    private Integer comprimento;

    public String exibe() {
        return "Caminhão! \n Motor: "+this.motor+"\t Peça: "+this.peca+"\t Toneladas: "+this.toneladas+"\t Altura máxima: "+this.alturaMax+"\t Comprimento: "+this.comprimento;
    }

    public Caminhao() {
        setMotor(new Motor(20, 40));
        setPeca(new Peca("marca2", "descricao2"));
        setToneladas(100);
        setAlturaMax(4);
        setComprimento(10);
    }

    public Caminhao(Motor motor, Peca peca, Integer toneladas, Integer alturaMax, Integer comprimento) {
        setMotor(motor);
        setPeca(peca);
        setToneladas(toneladas);
        setAlturaMax(alturaMax);
        setComprimento(comprimento);
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }

    public Integer getToneladas() {
        return toneladas;
    }

    public void setToneladas(Integer toneladas) {
        this.toneladas = toneladas;
    }
}