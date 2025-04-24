package tp2.ejercicio4;
import tp1.ej8.Queue;
import tp2.ejercicio1.BinaryTree;

public class RedBinariaLlena {
    
    BinaryTree<Integer> arbol;
    int tiempoMax ;
    
    public RedBinariaLlena(){
        this.tiempoMax = -1;
    }
    
    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
    //Corregir
    public int retardoReenvio(){
        BinaryTree<Integer> ab = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(ab);
        cola.enqueue(null);
        while (!cola.isEmpty()){
            ab = cola.dequeue();
            if (ab != null) {
                System.out.print(ab.getData());
                if (ab.hasLeftChild()) {
                    cola.enqueue(ab.getLeftChild());
                }
                if (ab.hasRightChild()) {
                    cola.enqueue(ab.getRightChild());
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
            }
        }
        return 0;
    }
          
    
    
}
