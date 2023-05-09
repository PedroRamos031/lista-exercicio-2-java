import java.util.Scanner;

public class Exercicioseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        
        int menor, maior;
        
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }
        
        int sorteado = (int) (Math.random() * (maior - menor + 1) + menor);
        
        System.out.printf("O número sorteado entre %d e %d foi: %d\n", menor, maior, sorteado);
        
        if (sorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        sc.close();
    }
}