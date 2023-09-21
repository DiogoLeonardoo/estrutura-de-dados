package Pilha;
import java.util.Stack;
import java.util.Scanner;

public class Pilha {
 private Stack<Integer> elementos;

    public Pilha() {
        this.elementos = new Stack<Integer>(); // Cria uma pilha vazia
    }

    public void push(int elemento) {
        this.elementos.push(elemento); // Adiciona um elemento no topo da pilha
    }

    public int pop() {
        return this.elementos.pop(); // Retorna o elemento do topo da pilha e o remove
    }

    public boolean isEmpty() {
        return this.elementos.isEmpty(); // Retorna true se a pilha estiver vazia
    }

    public int peek() {
        return this.elementos.peek(); // Retorna o elemento do topo da pilha
    }

    public void imprimir() {
        System.out.println("Pilhas: " + this.elementos.toString() + "\n"); // Imprime a pilha
    }

    
    public boolean compara_pilha(Pilha outraPilha) { // Método que compara duas pilhas
    
        if (this.elementos.size() != outraPilha.elementos.size())  // Se o tamanho das pilhas forem diferentes, retorna false             
        {
            return false;
        }
        for (int i = 0; i < this.elementos.size(); i++) { // Se o tamanho for igual, compara os elementos de cada pilha
            if (this.elementos.get(i) != outraPilha.elementos.get(i)) { // Se algum elemento for diferente, retorna false
                return false;
            }
        }
        return true; // Se todos os elementos forem iguais, retorna true
    }

}

    

