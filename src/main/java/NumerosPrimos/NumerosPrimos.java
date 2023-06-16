
package NumerosPrimos;

import RefactorNumerosPrimos.CribaEratostenesRefactor;

public class NumerosPrimos {

    public static void main(String[] args) {
        int[] centArray = CribaEratostenesRefactor.generarPrimos(100); // Probamos a generar los primos entre 1 y 100
        for (int i = 0; i < centArray.length; i++) {
            System.out.println(centArray[i]); // Los mostramos
        }
    }
}
