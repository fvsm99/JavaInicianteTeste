import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLES ===");
        System.out.println("Operações disponíveis:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Escolha uma operação (1-4): ");

        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("\nOperação: Soma (+)");
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("\nOperação: Subtração (-)");
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("\nOperação: Multiplicação (*)");
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("\nOperação: Divisão (/)");
                } else {
                    System.out.println("\nErro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("\nOperação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println(num1 + " " + getOperador(operacao) + " " + num2 + " = " + resultado);
        }

        scanner.close();
    }

    // Método auxiliar para retornar o símbolo da operação
    public static String getOperador(int op) {
        switch (op) {
            case 1: return "+";
            case 2: return "-";
            case 3: return "*";
            case 4: return "/";
            default: return "?";
        }
    }
}