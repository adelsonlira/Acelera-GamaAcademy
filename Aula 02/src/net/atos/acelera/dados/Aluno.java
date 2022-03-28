package net.atos.acelera.dados;

public class Aluno extends Pessoa{

    void estudar() {
    }

    /*Sobrescrita do método dormir da classe Pessoa
    @Override --> Anotação para informar ao compilador que se trata de uma sobrescrita
    */
    @Override
    public void dormir() {
        System.out.println("Aluno dormindo 10h");
    }
}
