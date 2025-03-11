import java.util.Random;

public class PixPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        // Cria um número aleatório como código pix
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Processando pagamento via PIX no valor de: " + amount);
        System.out.println("Código PIX: " + pixCode);
    }
}
