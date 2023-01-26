import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        double pi =  3.14159;

        System.out.println("Digite o raio: ");
        int raio = sc.nextInt();

        System.out.println("O raio digitado foi: " + raio);

        System.out.println("Agora vamos calcular a area deste circulo abaixo: ");

        double area = pi * Math.pow(raio,2);

        System.out.printf("A area e: %.4f%n" , area);






    }
}