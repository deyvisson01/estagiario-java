package br.com.mobitbrasil.ped.q6;

public class Peca implements Exibir {
    private String descricao;
    private String marca;

    public String exibe() { // Descrição de como as informações da classe devem ser exibidas.
        return "Marca: "+this.marca+"\t Descrição: "+this.descricao;
    }

    Peca(String marca, String descricao){
        setMarca(marca);
        setDescricao(descricao);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}