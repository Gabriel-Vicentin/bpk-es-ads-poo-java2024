package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private Integer salario;


    public Professor(String nome, String disciplina, Integer salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public void darAula(){
        System.out.println("Dando aula de " + disciplina);
    }

    public void corrigirProvas(){
        System.out.println("Corrigindo provas de " + disciplina);
    }


    @Override
    public String toString() {
        return "Professor: " + nome + " de " + disciplina + " Com o salario de: " + salario + "R$";
    }
}
