// 1. Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, caso contrário, imprima FALSO.
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Incira um número");
        num = scanner.nextInt();

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("VERDADEIRO - é multiplo de 3 ou 5");
        } else{
            System.out.println("FALSO - não é multiplo de 3 ou 5");
        }
    }
}
