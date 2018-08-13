package a0908;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro();
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um nome para o cachorro: ");
        c1.nome = leitor.nextLine();

        c1.late();

    }
}
