import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Processando pagamento com cartão de crédito no valor de: " + amount);
        System.out.println("Cartão: " + cardNumber);
        System.out.println("Pagamento efetuado com sucesso!");
    }
}
