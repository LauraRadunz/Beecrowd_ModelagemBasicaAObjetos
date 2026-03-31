import java.util.Scanner;
import java.util.Arrays;

public class ListaTelefonicaEconomica_1211_Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        while (teclado.hasNext()) {
            int numeroListas = teclado.nextInt();
            teclado.nextLine();
            ListaTelefonica lista = new ListaTelefonica(numeroListas);
            for (int i = 0; i < numeroListas; i++) {
                lista.adicionarTelefone(teclado.nextLine());
            }
            System.out.println(lista.calcularEconomiaMaxima());
        }
        
        teclado.close();
    }
}

class ListaTelefonica {
    private String[] telefones;
    private int quantidadeAtual;

    public ListaTelefonica(int capacidade) {
        this.telefones = new String[capacidade];
        this.quantidadeAtual = 0;
    }

    public void adicionarTelefone(String telefone) {
        if (this.quantidadeAtual < this.telefones.length) {
            this.telefones[this.quantidadeAtual] = telefone;
            this.quantidadeAtual++;
        }
    }

    public int calcularEconomiaMaxima() {
        Arrays.sort(this.telefones);
        
        int economiaDeCaracteres = 0;

        for (int i = 1; i < this.telefones.length; i++) {
            String atual = this.telefones[i];
            String anterior = this.telefones[i - 1];
            
            for (int j = 0; j < atual.length(); j++) {
                if (atual.charAt(j) == anterior.charAt(j)) {
                    economiaDeCaracteres++;
                } else {
                    break; 
                }
            }
        }
        return economiaDeCaracteres;
    }
}