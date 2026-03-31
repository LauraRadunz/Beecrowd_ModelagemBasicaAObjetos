import java.util.Scanner;
public class PontosDeFeno_1261_Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numAdjetivos = teclado.nextInt();
        int numfrases = teclado.nextInt();

        String[] adjetivos = new String[numAdjetivos];
        int[] pontosAdjetivos = new int[numAdjetivos];

        for (int i = 0; i < numAdjetivos; i++) {
            adjetivos[i] = teclado.next();
            pontosAdjetivos[i] = teclado.nextInt();
        }

        for (int i = 0; i < numfrases; i++) {
            int pontos = 0;
            while (true) {
                String palavra = teclado.next();
                if (palavra.equals(".")) {
                    break;
                }
                for (int j = 0; j < numAdjetivos; j++) {
                    if (palavra.equals(adjetivos[j])) {
                        pontos += pontosAdjetivos[j];
                    }
                }
            }
            System.out.println(pontos);
        }
    }
}


