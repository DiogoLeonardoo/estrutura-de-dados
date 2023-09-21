package Pilha;

public boolean compara_pilha(Pilha outraPilha) {
    if (this.elementos.size() != outraPilha.elementos.size()) {
        return false;
    }
    for (int i = 0; i < this.elementos.size(); i++) {
        if (this.elementos.get(i) != outraPilha.elementos.get(i)) {
            return false;
        }
    }
    return true;
}

    if (this.elementos.size() != outraPilha.elementos.size()) {
        return false;
    }
    for (int i = 0; i < this.elementos.size(); i++) {
        if (this.elementos.get(i) != outraPilha.elementos.get(i)) {
            return false;
        }
    }
    return true;

    
