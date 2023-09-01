package atividades.atividade3.Estoque;

import java.util.ArrayList;

class Inventario {
    private ArrayList<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void add(String nome, int qtd) {
        Item newItem = new Item(nome, qtd);
        itens.add(newItem);
    }

    public void rem(String nome) {
        Item rem = null;
        for (Item item : itens) {
            if (item.nome().equals(nome)) {
                rem = item;
                break;
            }
        }
        if (rem != null) {
            itens.remove(rem);
        } else {
            System.out.println("Item não encontrado");
        }
    }

    public void listar() {
        for (Item item : itens) {
            System.out.println(item.toString()); 
        }
    }

    public void atualizar(String nome, int nqtd) {
        for (Item item : itens) {
            if (item.nome().equals(nome)) {
                item.atualizar(nqtd);
                return;
            }
        }
        System.out.println("Item não encontrado");
    }
}