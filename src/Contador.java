import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o parametro 1:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o paramtro 2: ");
            int parametroDois = terminal.nextInt();

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            }

            for (int i = 0; parametroUm < parametroDois; i++) {
                parametroUm++;
                System.out.println("Imprimindo o numero " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Ambos os parâmetros devem ser números inteiros.");

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
