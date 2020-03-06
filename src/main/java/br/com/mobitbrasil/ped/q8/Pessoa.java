package br.com.mobitbrasil.ped.q8;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;
    private String telefone;

    Pessoa(String nome, Integer idade, String email, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }
     
    Pessoa(){
        
    }

    public Integer setIdade(int idade) {
        return idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
