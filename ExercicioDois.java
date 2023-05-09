import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
   
        Scanner scanner = new Scanner (System.in);
    
        System.out.print("Digite o valor da compra: R$");
        double compra = scanner.nextDouble();
    
        System.out.println("\nDigite o valor pago: R$");
        double pago = scanner.nextDouble();

        double troco = pago - compra;

        if(troco <  0) {
            System.out.println("Valor pago foi insuficiente");
    }else{
            int nota50 = (int) (troco/50);
            troco %= 50;

            int nota20 = (int) (troco/20);
            troco %= 20;

            int nota10 = (int) (troco/10);
            troco %= 10;

            int nota5 = (int) (troco/5);
            troco %= 5;

            int nota2 = (int) (troco/2);
            troco %= 2;

            int nota1 = (int) troco;

            System.out.println(" -> Troco = R$"+(pago - compra));

            System.out.println(" -> Quantidade de notas de 50 = "+nota50);

            System.out.println(" -> Quantidade de notas de 20 = "+nota20);

            System.out.println(" -> Quantidade de notas de 10 = "+nota10);

            System.out.println(" -> Quantidade de notas de 05 = "+nota5);

            System.out.println(" -> Quantidade de notas de 02 = "+nota2);

            System.out.println(" -> Quantidade de moedas de 1 = "+nota1);
        }


    
        System.out.println("-------------FIM----------------");
        scanner.close();
        }
    } 
