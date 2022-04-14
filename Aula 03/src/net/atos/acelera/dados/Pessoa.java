package net.atos.acelera.dados;

import java.util.Date;

public class Pessoa {

    public static float altura;
    public String nome;
    short idade;
    Date nascimento;

    //Bloco estático (primeiro dos blocos a ser executado)
    static {
        System.out.println("Bloco Estático...");
    }

    //Bloco anônimo (segundo a ser executado - bloco)
    {
        System.out.println("Bloco anônimo...");
    }

    //Construtor (terceiro a ser executado - bloco)
    public Pessoa(){
        System.out.println("Contrutor...");
    }

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

    //Método Estático
    public static void crescer(){
        System.out.println("Pessoa Crescendo");

//        Pessoa pessoa = new Pessoa();
//        pessoa.dormir();
    }
}
