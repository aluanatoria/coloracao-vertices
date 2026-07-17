public class ColorirVertices {
    public static int heuristicaGulosa(Grafo G, int[] cores) {
    int numVertices = G.getNumVertices();
    int k = 0;
    for (int i = 0; i < numVertices; i++) cores[i] = -1;

    for (int v = 0; v < numVertices; v++) {
        boolean[] disponivel = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++) disponivel[i] = true;

        for (int vizinho : G.getVizinhos(v)) {
            if (cores[vizinho] != -1) {
                disponivel[cores[vizinho]] = false;
            }
        }

        int c = 0;
        while (c < numVertices && !disponivel[c]) c++;
        
        cores[v] = c;
        if (c >= k) k = c + 1;
    }
    return k;
}
}
