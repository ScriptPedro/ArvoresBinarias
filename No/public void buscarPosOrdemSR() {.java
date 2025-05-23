public void buscarPosOrdemSR() {
    if (raiz == null) return;

    Stack<NO> pilha1 = new Stack<>();
    Stack<NO> pilha2 = new Stack<>();

    pilha1.push(raiz);

    while (!pilha1.isEmpty()) {
        NO atual = pilha1.pop();
        pilha2.push(atual);

        if (atual.esquerda != null) {
            pilha1.push(atual.esquerda);
        }

        if (atual.direita != null) {
            pilha1.push(atual.direita);
        }
    }

    
    while (!pilha2.isEmpty()) {
        System.out.print(pilha2.pop().valor + " ");
    }
}
