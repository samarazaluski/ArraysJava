package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exemplo3 {

    public int tamanhoVetor() {
        Scanner input = new Scanner(System.in);
        System.out.println("*-* Tamanho do vetor *-*");
        System.out.println("Tamanho:");
        int t = input.nextInt();
        return t;
    }

    public int[] criaVetor(int t) {
        System.out.println("*-*CRIA VETOR*-*");
        int[] vetor = new int[t];
        return vetor;
    }

    public int[] popularVetor(int[] v) {
        System.out.println("*-* Popula do Vetor");
        Scanner input = new Scanner(System.in);
        for(int i=0; i<v.length; i++){
            System.out.printf("Vetor[%d]: /n", i);
            v[i] = input.nextInt();
        }
        return v;
    }
}
