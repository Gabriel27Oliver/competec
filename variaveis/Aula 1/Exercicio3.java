// 1. Se estiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código
// 2. Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! Tente fazer essa comparação lógica no código.
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        //exercio 1
        boolean chovendo, relampejando;
        chovendo = true;
        relampejando = true;

        boolean comparcao = chovendo && relampejando;

        System.out.println("Esta tendo uma tempesdade: " + comparcao);

        //exercicio 2
        boolean macarrao, strogonoff;
        macarrao = false;
        strogonoff = true;

        boolean comparacao2 = macarrao || strogonoff;

        System.out.println("Hoje vou ficar feliz: " + comparacao2);
        
    }
}
