import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner terminal = new Scanner((System.in))) {
            System.out.println("Por favor, digite o seu Nome: ");
            String nomeCliente = terminal.nextLine();
            System.out.println("");

            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = terminal.nextLine();
            System.out.println("");
            
            System.out.println("Por favor, digite o número da sua Conta: ");
            int numeroConta = Integer.parseInt(terminal.nextLine());
            System.out.println("");

            System.out.println("Por favor, digite o seu Saldo: ");
            double saldo = Double.parseDouble(terminal.nextLine());
            System.out.println("---------------------------------");

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo: " + saldo + " já está disponível para saque.");
        }
    }
}