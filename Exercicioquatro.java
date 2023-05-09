import java.util.Scanner;;

public class Exercicioquatro    
{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código da operação (1 = perímetro do círculo, 2 = área do círculo, 3 = volume da esfera): ");
        int codigo = sc.nextInt();
        
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        
        if (codigo == 1) {
            double perimetro = 2 * Math.PI * raio;
            System.out.printf("O perímetro do círculo é %.2f\n", perimetro);
        } else if (codigo == 2) {
            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área do círculo é %.2f\n", area);
        } else if (codigo == 3) {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
            System.out.printf("O volume da esfera é %.2f\n", volume);
        } else {
            System.out.println("Código de operação inválido.");
        }
        
        sc.close();
    }







}