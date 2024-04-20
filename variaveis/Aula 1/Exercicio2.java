// 1. Compare o seu nome com o nome do colega ao lado e veja se são iguais
// 2. Faça uma comparação para descobrir se você é mais novo que o professor;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        // variaveis⬇️
        Scanner scanner = new Scanner(System.in);
        
        string nomeEu = "Gabriel";
        string nomeColega = "Gustavo";

        int minhaIdd, iddProf; 

        // exercicio 1
        if (nomeEu.equals(nomeColega)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

        // exercicio 2
        System.out.println("Incira sua idade: ");
        minhaIdd = scanner.nextInt();

        System.out.println("Incira a idade do seu professor");
        iddProf = scanner.nextInt();

        boolean comparcao = minhaIdd < iddProf;

        System.out.println("professor é mais velho : " + comparacao);
    }
}
