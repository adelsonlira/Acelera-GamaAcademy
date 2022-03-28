package net.atos.acelera.dados;

import java.util.Date;

public class Pessoa {
    String nome;
    short idade;
    Date nascimento;

    public void dormir() {
        System.out.println("Pessoa dormindo 7h");
    }

    //Sobrecarga do método dormir()
    public void dormir(short tempo) {
        System.out.println("Pessoa dormindo "+tempo+"h");
    }

    long acordar() {
        return 0l;
    }
}
