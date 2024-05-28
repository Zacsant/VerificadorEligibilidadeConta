import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verifica a elegibilidade com base na idade
        if (idade >= 18) {
            System.out.println("Você está elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
