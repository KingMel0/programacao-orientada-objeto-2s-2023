package atividade6;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void introducao() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos de idade.");
    }
}

