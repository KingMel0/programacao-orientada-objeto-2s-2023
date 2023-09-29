package atividades.atividade6;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Gabrielle", 19, 12345);
        Professor Professor = new Professor("Marco Tulio Ferreira", 35, "Mathematics");

        aluno.introducao();
        aluno.estudar();
        System.out.println("Aluno ID: " + aluno.getAlunoId());

        Professor.introducao();
        Professor.teach();
        System.out.println("Subject: " + Professor.getMateria());
    }
}