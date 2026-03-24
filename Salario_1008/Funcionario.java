package Salario_1008;

public class Funcionario {
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
