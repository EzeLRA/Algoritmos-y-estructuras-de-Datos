package tp2.ejercicio5;
import tp2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;
    
    public ProfundidadDeArbolBinario(){
        this.arbol = new BinaryTree<Integer>();
    }

    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }   
    
    //Corregir
    
    public int sumaElementosProfundidad(int p){
        return this.contabilizarRecorrido(this.getArbol() , p);
    }
    
    private int contabilizarRecorrido(BinaryTree<Integer> ar , int p){
        int cant = 0;
        
        if(ar.hasLeftChild()) cant += this.contabilizarRecorrido(ar.getLeftChild(), p);
        if(ar.hasRightChild()) cant += this.contabilizarRecorrido(ar.getRightChild(), p);
        if(ar.getData() == p) return cant + ar.getData(); else return cant;
    }
    
}
