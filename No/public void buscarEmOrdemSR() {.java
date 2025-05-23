public void buscarEmOrdemSR() {
    Stack<NO> pilha = new Stack<>();
    NO atual = raiz;

    while (atual != null || !pilha.isEmpty()) {
    
        while (atual != null) {
            pilha.push(atual);
            atual = atual.esquerda;
        }

        
        atual = pilha.pop();
        System.out.print(atual.valor + " "); 

        
        atual = atual.direita;
    }
}