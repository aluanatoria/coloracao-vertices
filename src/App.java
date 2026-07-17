import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        try {

            String caminho = "instancias/instancia_1000_200000.txt";
            
            Grafo grafo = LerGrafo.carregarGrafo(caminho);

            int[] cores = new int[grafo.getNumVertices()];
            //tempo
            long inicio = System.nanoTime();
            
            int numCores = ColorirVertices.heuristicaGulosa(grafo, cores);
            
            long fim = System.nanoTime();

            double tempoSegundos = (fim - inicio) / 1_000_000_000.0;

            System.out.println("Arquivo: " + caminho);
            System.out.println("Vértices: " + grafo.getNumVertices());
            System.out.println("Cores usadas: " + numCores);
            System.out.println("Tempo de execução: " + tempoSegundos + "s");

        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado.");
        }
    }
}