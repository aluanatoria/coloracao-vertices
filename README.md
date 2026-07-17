# Algoritmo para coloracao de vertices

Trabalho realizado pelos alunos Breno Meira, João Guimarães e Luana Ferreira para a disciplina de Projeto e Análise de Algoritmos.

Utiliza uma heuristica gulosa para solucionar o problema de coloração de vértices. 

## Arquivos de Instâncias

A primeira linha indica a quantidade de vertices e arestas, respectivamente, e as demais indicam as arestas(u,v).

## Estrutura do Grafo

Criei a estrutura do grafo utilizando lista de adjacencia, visto que a operacao mais realizada é a de verificacao dos vertices adjacentes, e a estrutura de lista faz isso de forma mais rapida. Foi implementado um menu onde é possível realizar a seleção da instância de teste.

## Execuçao do Programa

### Pré-requisitos
Antes de iniciar, o avaliador precisará garantir que a máquina possui:

* Java Development Kit (JDK): Instalado e configurado (versão 8 ou superior).
* Sistema Operacional: Linux, macOS ou ambiente WSL no Windows (para garantir o funcionamento do makefile).

### Passo a Passo para Execução

**Passo 1: Preparar os arquivos**
* Faça a extração do arquivo compactado (coloracaodeverteces.zip) em um diretório local. Em seguida, abra o terminal nativo do sistema operacional.
* Navegue até a pasta raiz do projeto (onde estão localizados a pasta src/ e o arquivo makefile).

**Passo 2: Compilar e Iniciar**
Para compilar e rodar o programa de forma automatizada, o projeto conta com um Makefile.

* Opção Principal: No terminal, digite o seguinte comando e pressione Enter.
> make run


* Opção Secundária (Execução Manual): Caso a máquina não possua suporte ao make, é possível compilar e rodar utilizando os comandos nativos do Java:
>javac -d bin src/*.java
>java -cp bin App
