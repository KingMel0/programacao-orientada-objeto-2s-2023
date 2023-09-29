package atividade6;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Gabrielle", 19, 12345);
        Professor professor = new Professor("Marco Tulio Ferreira", 35, "Portugues");

        aluno.introducao();
        aluno.estudar();
        System.out.println("Aluno ID: " + aluno.getAlunoId());

        professor.introducao();
        professor.ensinar();
        System.out.println("Materia: " + professor.getMateria());
    }
}
