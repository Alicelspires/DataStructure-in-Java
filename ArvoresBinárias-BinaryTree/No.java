class No {
    int elemento;
    int ocorrencias;
    No esquerda, direita;
    
    No(int e) {
        elemento = e;
        ocorrencias = 1;
        esquerda = null;
        direita = null;
    }
}