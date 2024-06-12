import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Informe seu nome: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Infome o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe o numero da sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Informe o valor do saldo na sua conta: ");
        Double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        

        scanner.close();
    }
}