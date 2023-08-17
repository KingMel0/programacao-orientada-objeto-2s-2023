public class VerificadorNumeroPrimo {

    public static void main(String[] args) {
        int numero = 17; 
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " eh numero primo.");
        } else {
            System.out.println(numero + " nao eh numero primo.");
        }
    }

    public static int verificaNumeroPrimo(Integer n) {

        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }
        return 1; 
    }
}
