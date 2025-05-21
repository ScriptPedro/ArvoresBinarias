public int contarNos(NO node) {
    if (node = null) return 0;
    return 1 + contarNos(node.esquerda) + (node.direita);
}