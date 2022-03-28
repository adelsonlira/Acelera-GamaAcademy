package net.atos.acelera.processa;

import net.atos.acelera.dados.Aluno;
import net.atos.acelera.dados.Funcionario;
import net.atos.acelera.dados.Pessoa;
import net.atos.acelera.dados.Professor;

public class ExecutaPrograma extends Pessoa{

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.dormir();

        Aluno aluno = new Aluno();
        aluno.dormir();

        Funcionario funcionario = new Funcionario();
        funcionario.dormir();

        Professor professor = new Professor();
        professor.dormir();

        pessoa.dormir((short) 22);
    }
}
