package polimorfismo;

import java.security.Permission;

import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.produtos.Abacaxi;
import polimorfismo.mercado.produtos.Alho;

public class Executavel {

    public static void main(){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Abacaxi a1 = new Abacaxi("abacaxi comun", 5.99, 1);
        Abacaxi a2 = new Abacaxi("Abacaxi Prem", 12.99, 3);
        Alho a3 = new Alho("Alho comum", 18.99, 0.5);
        carrinho.adicionarProduto(a1);

        System.out.println(carrinho.finalizarCompra());
    }

    

}