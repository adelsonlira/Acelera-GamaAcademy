package net.atos.acelera.dados;

public class Professor extends Funcionario{

    void lecionar(){
    }

    /*Sobrescrita do método dormir da classe Pessoa
      @Override --> Anotação para informar ao compilador que se trata de uma sobrescrita
    */
    public void dormir() {
        System.out.println("Professor dormindo 6h");
    }
}
