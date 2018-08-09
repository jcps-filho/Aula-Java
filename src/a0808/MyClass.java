package a0808;

import java.util.Scanner;

public class MyClass {
    public static void  main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("A string lida foi -> "+ nome);

        System.out.print("Escreva seu ano de nascimento: ");
        int anoNascimento = leitor.nextInt();
        System.out.println("A inteiro lido foi -> "+ anoNascimento);

        System.out.print("Escreva a sua idade: ");
        double idade = leitor.nextDouble();
        System.out.println("A inteiro lido foi -> "+ idade);
    }
}
