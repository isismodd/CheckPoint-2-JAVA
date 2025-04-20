package br.com.fiap.bean;
import java.time.LocalDate;

//Isis Macedo e Andrade RM561497, Ana ..., Theodoro Spinola..., Anabelle ...

public class Aluno {
    // atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    // construtores
        public Aluno() {
            // construtor vazio
        }

        public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
            setRegistroMatricula(registroMatricula);
            setNomeCompleto(nomeCompleto);
            setAnoDeNascimento(anoDeNascimento);
        }//construtor com passagem de parametros

        // métodos getters/setters

        public int getRegistroMatricula() {
            return registroMatricula;
        }

        public void setRegistroMatricula(int registroMatricula) {
            try {
                if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                    this.registroMatricula = registroMatricula;
                } else {
                    throw new Exception("Registro de matrícula inválido! Deve ser entre 80000 e 599999");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public String getNomeCompleto() {
            return nomeCompleto;
        }

        public void setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
        }

        public int getAnoDeNascimento() {
            return anoDeNascimento;
        }

        public void setAnoDeNascimento(int anoDeNascimento) {
            try {
                int dataAtual = LocalDate.now().getYear();
                if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual) {
                    this.anoDeNascimento = anoDeNascimento;
                } else {
                    throw new Exception("Ano de nascimento é inválido! Precisa ser entre 1945 e " + dataAtual);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public int calcularIdade() {
            int dataAtual = LocalDate.now().getYear();
            return dataAtual - this.anoDeNascimento;
        }
    }

