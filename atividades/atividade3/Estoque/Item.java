package atividades.atividade3.Estoque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Item {
    private String nome;
    private int qtd;

    public Item(String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public String nome() {
        return nome;
    }

    public int qtd() {
        return qtd;
    }

    public void atualizar(int nqtd) {
        this.qtd = nqtd;
    }

    @Override
    public String toString() {
        return "Item: " + nome + " | quantidade: " + qtd;
    }
}