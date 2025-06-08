import java.util.Scanner;

public class ContaTerminal {

    private final static String WELCOME_BANK = "Bem vindo ao Sistema de Cadastro do Dio Bank";

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_BANK);
        System.out.println("Por favor digite o numero da sua conta ex: 1021");
        var conta = scanner.nextInt();
        System.out.println("Por favor digite agora o numero da agência ex: 067-8");
        var agencia = scanner.next();
        System.out.println("Por favor, informe o seu nome");
        var nome = scanner.next();
        System.out.println("Por favor, informe o saldo inicial a ser depositado, ex: 250");
        var saldo = scanner.nextInt();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque\n", nome, agencia, conta, saldo);

    }
}
