package Pilha;
import java.util.Stack;
import java.util.Scanner;

public class Pilha_app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Pilha minhaPilha1 = new Pilha();
        minhaPilha1.push(1);
        minhaPilha1.push(7);
        minhaPilha1.push(8);
        minhaPilha1.push(10);

        Pilha minhaPilha2 = new Pilha();
        minhaPilha2.push(1);
        minhaPilha2.push(7);
        minhaPilha2.push(8);
        minhaPilha2.push(10);

        Pilha minhaPilha3 = new Pilha();
        minhaPilha3.push(1);
        minhaPilha3.push(7);
        minhaPilha3.push(8);
        minhaPilha3.push(0);

        System.out.println(minhaPilha1.compara_pilha(minhaPilha2)); // Imprime "true"
        System.out.println(minhaPilha1.compara_pilha(minhaPilha3)); // Imprime "false"

        


       


        
    }
}
