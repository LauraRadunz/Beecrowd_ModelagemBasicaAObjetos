import java.util.Scanner;

public class Consumo_1014_Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int distancia = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        Consumo consumo = new Consumo(distancia, combustivelGasto);
        System.out.printf("%.3f km/l\n", consumo.calcularConsumo());
    }
}

class Consumo {
    private int distancia;
    private double combustivelGasto;

    public Consumo(int distancia, double combustivelGasto) {
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumo() {
        return distancia / combustivelGasto;
    }
}