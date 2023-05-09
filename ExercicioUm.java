import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args){
   
    Scanner scanner = new Scanner (System.in);

    System.out.print("\nEscreva um número: ");
    double n1 = scanner.nextDouble();

    System.out.print("\nEscreva segundo número: ");
    double n2 = scanner.nextDouble();

    System.out.print("\nEscreva terceiro número: ");
    double n3 = scanner.nextDouble();

    double media = (n1+ n2 + n3)/3;

    System.out.println("------------------------------");
 
    if(n1 > n2 && n1 > n3){
    System.out.println("Maior número = "+ n1);}

    else if(n2 > n1 && n2 > n3){
    System.out.println("Maior número = "+ n2);}

    else if(n3 > n1 && n3 > n2){
    System.out.println("Maior número = "+ n3);}

    if(n1 < n2 && n1 < n3){
        System.out.println("Menor número = "+ n1);}
    
        else if(n2 < n1 && n2 < n3){
        System.out.println("Menor número = "+ n2);}
    
        else if(n3 < n1 && n3 < n2){
        System.out.println("Menor número = "+ n3);}
    
  
    System.out.println("Média = "+media);

    System.out.println("-------------FIM----------------");
    scanner.close();
    }
} 