import java.util.Scanner;
import java.util.TreeSet;

public class TrocaDeCartas_1104_Main {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            int x = teclado.nextInt();
            int y = teclado.nextInt();
            
            if (x == 0 && y == 0) {
                break;
            }
            
            Cartas alice = new Cartas();
            Cartas beatriz = new Cartas();
            
            for (int i = 0; i < x; i++) {
                alice.adicionarCarta(teclado.nextInt());
            }
            
            for (int i = 0; i < y; i++) {
                beatriz.adicionarCarta(teclado.nextInt());
            }

            TreeSet<Integer> geral = new TreeSet<>(alice.getCartas());
            geral.addAll(beatriz.getCartas());

            alice.calcularTrocas(geral.size());
            beatriz.calcularTrocas(geral.size());
            
            int trocas = Math.min(alice.getTrocas(), beatriz.getTrocas());

            System.out.println(trocas);
        }
    }
}

class Cartas {
    private TreeSet<Integer> cartas;
    private int trocas;

    public Cartas() {
        this.cartas = new TreeSet<>();
    }

    public void adicionarCarta(int carta) {
        this.cartas.add(carta);
    }

    public void calcularTrocas(int tamanhoGeral) {
        this.trocas = tamanhoGeral - this.cartas.size();
    }

    public int getTrocas() {
        return this.trocas;
    }

    public TreeSet<Integer> getCartas() {
        return this.cartas;
    }
}