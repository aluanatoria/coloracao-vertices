import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {

            String caminhoDiretorio = "instancias";
            File diretorio = new File(caminhoDiretorio);

            File[] arquivos = diretorio.listFiles(File::isFile);

            if (arquivos == null || arquivos.length == 0) {
            System.out.println("Nenhum arquivo encontrado na pasta '" + caminhoDiretorio + "'.");
            System.out.println("Certifique-se de que a pasta existe e contém os arquivos .txt.");
            return;
            }

            System.out.println("\nSELEÇÃO DE INSTÂNCIAS DE TESTE");
            System.out.println("------------------------------------------------------");

            for (int i = 0; i < arquivos.length; i++) {
            System.out.println((i + 1) + " - " + arquivos[i].getName());
            }
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nDigite o número do arquivo que deseja carregar: ");

            
            String caminhoArquivo = "";

            while (true) {
                int opcao = scanner.nextInt();

                if (opcao >=1 && opcao <= arquivos.length){

                caminhoArquivo = arquivos[opcao-1].getPath();
                System.out.println("\nArquivo selecionado com sucesso: " + caminhoArquivo);
                break;
                
                } else {

                    System.out.println("\n Opção inválida! Digite um número de arquivo válido.");

                }
            }

            scanner.close();


            Grafo grafo = LerGrafo.carregarGrafo(caminhoArquivo);

            int[] cores = new int[grafo.getNumVertices()];
            //tempo
            long inicio = System.nanoTime();
            
            int numCores = ColorirVertices.heuristicaGulosa(grafo, cores);
            
            long fim = System.nanoTime();

            double tempoSegundos = (fim - inicio) / 1_000_000_000.0;

            System.out.println("\nDADOS COLETADOS NA EXECUÇÃO DA INSTÂNCIA DE TESTE ");
            System.out.println("------------------------------------------------------");

            System.out.println("Arquivo: " + caminhoArquivo);
            System.out.println("Vértices: " + grafo.getNumVertices());
            System.out.println("Cores usadas: " + numCores);
            System.out.println("Tempo de execução: " + tempoSegundos + "s");

        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado.");
        }
    }
}