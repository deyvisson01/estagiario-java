package br.com.mobitbrasil.ped.q6;

public class Main {

    public static void main(String[] args) {
        Motor testeMotor = new Motor(10, 20);
        Peca testePeca = new Peca("marcaTeste", "descricaoTeste");

        CarroPasseio carro = new CarroPasseio();
        Caminhao caminhao = new Caminhao();
        
        CarroPasseio carro2 = new CarroPasseio(testeMotor, testePeca, "azul", "modelo4");
        Caminhao caminhao2 = new Caminhao(testeMotor, testePeca, 200, 5, 20);

        System.out.println(carro.exibe());
        System.out.println(caminhao.exibe());

        System.out.println(carro2.exibe());
        System.out.println(caminhao2.exibe());
    }
}