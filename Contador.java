import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Receber os dois parâmetros via terminal
            System.out.print("Digite o primeiro número inteiro: ");
            int primeiroNumero = scanner.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int segundoNumero = scanner.nextInt();

            // Verificar se o segundo número é maior que o primeiro
            if (primeiroNumero >= segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Realizar a contagem
            for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            // Capturar e exibir a mensagem da exceção customizada
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Capturar e exibir outras exceções
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
