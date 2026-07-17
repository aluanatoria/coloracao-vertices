import java.util.ArrayList;
import java.util.List;


public class Grafo {
    private final int numVertices;
    private final ArrayList<ArrayList<Integer>> adj;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.adj = new ArrayList<>(numVertices);
        
        for (int i = 0; i < numVertices; i++) {
            this.adj.add(new ArrayList<>());
        }
    }

    public void adicionaAresta(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    public List<Integer> getVizinhos(int v) {
        return adj.get(v);
    }

    public int getNumVertices() {
        return numVertices;
    }
}