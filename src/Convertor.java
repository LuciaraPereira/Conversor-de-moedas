import java.util.Scanner;

public class Convertor {
    Scanner scanner = new Scanner(System.in);

    public void convertendoMoeda(String moedaBase, String moedaDestino) {
        System.out.print("Digite o valor a ser convertido de " + moedaBase + " para " + moedaDestino + ": ");
        double valor = scanner.nextDouble();

        BuscadorDeMoedas buscadorDeMoedas = new BuscadorDeMoedas();
        Moedas moeda = buscadorDeMoedas.buscaMoeda(moedaBase);

        if (moeda != null && moeda.conversion_rates().containsKey(moedaDestino)) {
            double taxa = moeda.conversion_rates().get(moedaDestino);
            double valorConvertido = valor * taxa;
            System.out.printf(  valor + " " + moedaBase +" equivalem a "+valorConvertido +" "+moedaDestino);
        } else {
            System.out.println("Não foi possível encontrar a taxa de câmbio para a moeda destino.");
        }
    }
}
