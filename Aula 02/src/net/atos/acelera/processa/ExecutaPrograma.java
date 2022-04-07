package net.atos.acelera.processa;

import net.atos.acelera.dados.Aluno;
import net.atos.acelera.dados.Funcionario;
import net.atos.acelera.dados.Pessoa;
import net.atos.acelera.dados.Professor;

public class ExecutaPrograma extends Pessoa{

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.dormir();
        pessoa.nome = "Luiz";
        Pessoa.altura = 1.70f;

        Aluno aluno = new Aluno();
        aluno.dormir();
        aluno.nome = "Adelson";
        Aluno.altura = 1.81f;

        Funcionario funcionario = new Funcionario();
        funcionario.dormir();
        funcionario.nome = "Fulano";
        Funcionario.altura = 1.75f;

        Professor professor = new Professor();
        professor.dormir();
        professor.nome = "Sergio";
        Professor.altura = 1.60f;

        pessoa.dormir((short) 22);

        pessoa.crescer();
        Pessoa.crescer();
        Aluno.crescer("Fulano");

        //Por ser uma variável estática a altura será a última modificada, no caso pela Classe Professor.altura
        System.out.println("Pessoa = "+pessoa.nome+" Altura = "+Pessoa.altura);
        System.out.println("Aluno = "+aluno.nome+" Altura = "+Aluno.altura);
        System.out.println("Funcionário = "+funcionario.nome+" Altura = "+Funcionario.altura);
        System.out.println("Professor = "+professor.nome+" Altura = "+Professor.altura);
    }
}
