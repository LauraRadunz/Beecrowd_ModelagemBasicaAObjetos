import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALendaDeFlaviousJosephus_1030_Main {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int casos = teclado.nextInt();
        
        for (int i = 1; i <= casos; i++) {
            int pessoas = teclado.nextInt();
            int salto = teclado.nextInt(); 
            
            Roda roda = new Roda(0); 
            
            for (int j = 1; j <= pessoas; j++) {
                roda.adicionar(Integer.toString(j));
            }

            while (roda.getRoda().size() > 1) {
                roda.remover(salto);
            }

            System.out.println("Case " + i + ": " + roda.calcularVencedor());
        }
    }
}

class Roda {
    private List<String> roda;
    private int indiceAtual;

    public Roda(int indiceAtual) {
        this.indiceAtual = indiceAtual;
        this.roda = new ArrayList<>(); 
    }

    public void adicionar(String num) {
        this.roda.add(num);
    }

    public String remover(int saltos) {
        this.indiceAtual = (this.indiceAtual + saltos - 1) % this.roda.size();
        return this.roda.remove(this.indiceAtual);
    }

    public List<String> getRoda() {
        return this.roda;
    }

    public String calcularVencedor() {
        return this.roda.get(0);
    }
}