import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o umero da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o numero da agencia: ");
        String agencia = entrada.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Digite o saldo do cliente: ");
        double saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
