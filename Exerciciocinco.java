import java.util.Scanner;

public class Exerciciocinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        String operacao = sc.next();
        
        double resultado;
        
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, resultado);
                }
                break;
            case "^":
                resultado = Math.pow(num1, num2);
                System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, resultado);
                break;
            default:
                System.out.println("Símbolo de operação inválido.");
                break;
        }
        
        sc.close();
    }
}