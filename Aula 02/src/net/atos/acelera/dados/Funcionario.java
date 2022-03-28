package net.atos.acelera.dados;

public class Funcionario extends Pessoa{

    long numeroMatricula;

    /*Sobrescrita do método dormir da classe Pessoa
     @Override --> Anotação para informar ao compilador que se trata de uma sobrescrita
    */
    public void dormir() {
        System.out.println("Funcionario dormindo 8h");
    }
}
