package atividades.atividade6;

public class Aluno extends Pessoa {
    private int alunoId;

    public Aluno(String nome, int idade, int alunoId) {
        super(nome, idade);
        this.alunoId = alunoId;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void estudar() {
        System.out.println(getNome() + " esta estudando.");
    }
}