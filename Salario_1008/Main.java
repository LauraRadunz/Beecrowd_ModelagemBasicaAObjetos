package Salario_1008;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        Funcionario funcionario = new Funcionario(numeroFuncionario, horasTrabalhadas, valorHora);

        System.out.println("NUMBER = " + funcionario.getNumeroFuncionario());
        System.out.printf("SALARY = U$ %.2f\n", funcionario.calcularSalario());
    }
}