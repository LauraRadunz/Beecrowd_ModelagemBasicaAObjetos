

import java.util.Scanner;

public class SalarioComBonus_1009_Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioFixo, totalVendas);
        System.out.printf("TOTAL = R$ %.2f\n", funcionario.calcularSalario());
    }
}

class Funcionario {
    // private String nome;
    private double salarioFixo;
    private double totalVendas;

    public Funcionario(String nome, double salarioFixo, double totalVendas) {
        // this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public double calcularSalario() {
        return salarioFixo + (totalVendas * 0.15);
    }
}
