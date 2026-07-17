import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerGrafo {
    public static Grafo carregarGrafo(String caminhoArquivo) throws FileNotFoundException {
        File arquivo = new File(caminhoArquivo);
        Scanner scanner = new Scanner(arquivo);

        int numV = scanner.nextInt();
        int numE = scanner.nextInt();

        Grafo grafo = new Grafo(numV);

        for (int i = 0; i < numE; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            grafo.adicionaAresta(u, v);
        }

        scanner.close();
        return grafo;
    }
}
