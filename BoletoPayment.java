public class BoletoPayment implements PaymentStrategy {

  @Override
  public void processPayment(double amount) {
      // Gera um código de boleto
      String boletoCode = "BOLETO-" + System.currentTimeMillis();
      System.out.println("Processando pagamento via Boleto no valor de: " + amount);
      System.out.println("Código do boleto: " + boletoCode);
      System.out.println("Pagamento via boleto processado com sucesso!");
  }
}
