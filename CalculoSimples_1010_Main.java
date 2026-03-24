import java.util.Scanner;

public class CalculoSimples_1010_Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int codigoPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double precoPeca1 = sc.nextDouble();
        Peca peca1 = new Peca(codigoPeca1, quantidadePeca1, precoPeca1);

        int codigoPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double precoPeca2 = sc.nextDouble();
        Peca peca2 = new Peca(codigoPeca2, quantidadePeca2, precoPeca2);

        double total = peca1.calcularValor() + peca2.calcularValor();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}

class Peca {
    private int codigo;
    private int quantidade;
    private double preco;

    public Peca(int codigo, int quantidade, double preco) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularValor() {
        return quantidade * preco;
    }
}