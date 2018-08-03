package a0208;
import java.util.Scanner;

public class AtribuirValorVariavel {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome;
        int  anoNascimento;
        double idade;

        System.out.print("Informe o seu nome: ");
        nome = sc.next();
        System.out.print("Informe o seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.print("Informe a sua idade: ");
        idade = sc.nextDouble();

        System.out.println("Nome: "+ nome);
        System.out.println("Ano de Nascimento: "+ anoNascimento);
        System.out.println("Idade: "+ idade);



    }
}
