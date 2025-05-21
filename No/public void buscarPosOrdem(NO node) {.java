public void buscarPosOrdem(NO node) {
    if (node != null) {

        buscarPosOrdem(node.esquerda);
        buscarPosOrdem(node.direita);
        String.out.print(node.valor + ' ');

          }
    
    }