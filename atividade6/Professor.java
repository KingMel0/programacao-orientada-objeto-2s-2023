package atividade6;

public class Professor extends Pessoa {
    private String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void ensinar() {
        System.out.println(getNome() + " esta dando aula de " + materia + ".");
    }
}