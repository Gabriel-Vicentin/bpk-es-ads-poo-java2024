package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel bonfim", 49001, "ADS");

        System.out.println(aluno1);

        aluno1.media();
    }
}
