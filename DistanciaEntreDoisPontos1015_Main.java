import java.util.Scanner; 
public class DistanciaEntreDoisPontos1015_Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Ponto ponto1 = new Ponto(x1, y1);
        Ponto ponto2 = new Ponto(x2, y2);

        System.out.printf("%.4f\n", ponto1.calcularDistancia(ponto2));
    }    
}

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = outroPonto.x - this.x;
        double deltaY = outroPonto.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
