package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;

public class MainAluno {
    public static void main(String[] args) {


        //region Variaveis
        //alunos sem construtores
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //alunos com construtores
        Aluno aluno3 = new Aluno(564526, "Anabelle Rosseto Rodrigues",2004);
        Aluno aluno4 = new Aluno(561957, "Ana Clara de Oliveira",2007);
        //endregion

        //Atribuindo valores ao aluno1
        aluno1.setRegistroMatricula(566019);
        aluno1.setNomeCompleto("Theodoro Spinola Furtado");
        aluno1.setAnoDeNascimento(2005);

        //Atribuindo valores ao aluno2
        aluno2.setRegistroMatricula(561497);
        aluno2.setNomeCompleto("Isis Macedo e Andrade");
        aluno2.setAnoDeNascimento(2006);

        //Atribuindo valores ao aluno3
        aluno3.setRegistroMatricula(564526);
        aluno3.setNomeCompleto("Anabelle Rosseto Rodrigues");
        aluno3.setAnoDeNascimento(2004);

        //Atribuindo valores ao aluno4
        aluno4.setRegistroMatricula(561957);
        aluno4.setNomeCompleto("Ana Clara de Oliveira");
        aluno4.setAnoDeNascimento(2007);

        //Exibindo os alunos



        String myStr = String.format("Aluno 1: RM: %d; Nome: %s; Idade: %d" +
                "\nAluno 2: RM: %d; Nome: %s, Idade:%d" +
                "\nAluno 3: RM: %d; Nome: %s, Idade:%d" +
                "\nAluno 4: RM: %d; Nome: %s, Idade:%d",aluno1.getRegistroMatricula(),aluno1.getNomeCompleto(),aluno1.calcularIdade(),aluno2.getRegistroMatricula(),aluno2.getNomeCompleto(),aluno2.calcularIdade(), aluno3.getRegistroMatricula(),aluno3.getNomeCompleto(),aluno3.calcularIdade(), aluno4.getRegistroMatricula(),aluno4.getNomeCompleto(),aluno4.calcularIdade());

        JOptionPane.showMessageDialog(null,myStr);
    }
}
