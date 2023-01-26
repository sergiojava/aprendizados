import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int func = sc.nextInt();
        System.out.println("Digite agora a quantidade de horas trabalhadas deste funcionario: ");
        int horasTrab = sc.nextInt();
        System.out.println("Digite quanto este funcionario recebe por hora: ");
        double recebeporhora = sc.nextDouble();

        double salariofinal = horasTrab * recebeporhora;
        
        System.out.println("Abaixo estao as informacoes de recebimento do funcionario informado:");
        System.out.println("Funcionario: " + func );
        System.out.println("Quantidade de horas trabalhadas : " + horasTrab );
        System.out.println("Quanto o funcionario recebe por hora: " + recebeporhora );
        System.out.printf("Salario final do funcionario: %.2f%n " , salariofinal );







    }
}