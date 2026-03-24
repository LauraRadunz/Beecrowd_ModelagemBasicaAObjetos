
import java.util.Scanner;

public class Salario_1008_Main {
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

class Funcionario {
    private int numeroFuncionario;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(int numeroFuncionario, int horasTrabalhadas, double valorHora) {
        this.numeroFuncionario = numeroFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
