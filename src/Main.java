import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertor convertor = new Convertor();

        System.out.println("Conversor de Moedas");
        System.out.println("1 - BRL para USD");
        System.out.println("2 - USD para BRL");
        System.out.println("3 - BRL para EUR");
        System.out.println("4 - EUR para BRL");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                convertor.convertendoMoeda("BRL", "USD");
                break;
            case 2:
                convertor.convertendoMoeda("USD", "BRL");
                break;
            case 3:
                convertor.convertendoMoeda("BRL", "EUR");
                break;
            case 4:
                convertor.convertendoMoeda("EUR", "BRL");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
