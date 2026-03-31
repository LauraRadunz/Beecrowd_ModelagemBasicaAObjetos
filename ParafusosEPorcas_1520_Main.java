import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class ParafusosEPorcas_1520_Main {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (teclado.hasNext()) {
            int casos = teclado.nextInt();
            ArrayList<Integer> parafusos = new ArrayList<>();
            
            for (int j = 0; j < casos; j++) {
                int n1 = teclado.nextInt();
                int n2 = teclado.nextInt();
                for (int i = n1; i <= n2; i++) {
                    parafusos.add(i);
                }
            }
            
            Collections.sort(parafusos);
            
            int procurado = teclado.nextInt();
            int p1, p2;
            
            if (parafusos.contains(procurado)) {
                p1 = parafusos.indexOf(procurado);
                p2 = parafusos.lastIndexOf(procurado);
                System.out.println(procurado + " found from " + p1 + " to " + p2);
            } else {
                System.out.println(procurado + " not found");
            }
        }
    }
}