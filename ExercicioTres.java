import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args){
   
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o valor a: ");
    int a = scanner.nextInt();

    System.out.println("Digite o valor b: ");
    int b = scanner.nextInt();

    System.out.println("Digite o valor c: ");
    int c = scanner.nextInt();

    


    //double funcao = a*Math.pow(x, 2) + b * x + c;
    double delta = (Math.pow(b, 2)) - (4*a*c);

    double resposta = ((-1*b)+(Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
    double resposta2 = ((-1*b)-(Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);

    if (a == 0 && b == 0 && c != 0){
        System.out.println("Coeficientes informados incorretamente");
    }else if(a == 0 && b != 0){
        System.out.println("Essa é uma equação de primeiro grau: "+"X' = "+ resposta +" | X'' = "+ resposta2);
    }else if(delta < 0){
        System.out.println("Essa equação não possui raizes reais");
    }else if(delta == 0 ){
        System.out.println("Essa equação possui duas raizes reais iguais: "+"X' = "+ resposta +" | X'' = "+ resposta2);
    }else if(delta > 0){
        System.out.println("Essa equação possui duas raizes diferentes: "+"X' = "+ resposta +" | X'' = "+ resposta2);
    }


    System.out.println("-------------FIM----------------");
    scanner.close();
    }
} 
