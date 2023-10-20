package collections;

import java.util.HashMap;

public class ExemploHashMap {
    
    public static void main(String[] args) {
        
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasilia");
        capitais.put("Franca", "Paris");
        capitais.put("Japao", "Toquio");

        System.out.println(capitais.get("Brasil"));

        if(capitais.containsKey("Franca")){
            System.out.println("A capital da Franca esta no HashMap");
        }

        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " + capitais.get(chave));
        }

    }

}