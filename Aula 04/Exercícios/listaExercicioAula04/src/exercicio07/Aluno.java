package exercicio07;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private Integer matricula;
    private String curso;

    public Aluno(String nome, Integer matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void media (){
        double medianotas = 0, notas;
        for (int i = 0; i < 3; i++) {
        System.out.println("Digite a " + (i+1) + " nota do aluno");
             notas = scanner.nextDouble();
             medianotas += notas;
        }
        System.out.println("Media de notas do aluno: " + medianotas/3);
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " Curso: " + curso + " matricula: " + matricula;
    }
}


