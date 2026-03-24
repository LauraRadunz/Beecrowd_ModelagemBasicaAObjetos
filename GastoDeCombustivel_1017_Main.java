import java.util.Scanner;
public class GastoDeCombustivel_1017_Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        GastoCombustivel gasto = new GastoCombustivel(tempo, velocidade);
        System.out.printf("%.3f\n", gasto.calcularGasto());
    }
}

class GastoCombustivel {
    private int tempo;
    private int velocidade;

    public GastoCombustivel(int tempo, int velocidade) {
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public double calcularGasto() {
        double distancia = tempo * velocidade;
        return distancia / 12.0;
    }
}
