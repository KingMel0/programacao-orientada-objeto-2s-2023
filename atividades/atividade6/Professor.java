package atividades.atividade6;

public class Professor extends Pessoa {
    private String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void teach() {
        System.out.println(getNome() + " está dando aula de " + materia + ".");
    }
}