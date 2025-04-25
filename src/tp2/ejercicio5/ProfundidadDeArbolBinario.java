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
    
    public int sumaElementosProfundidad(int p){
        return (this.getArbol() != null && !this.getArbol().isEmpty() ? this.contabilizarRecorrido(this.getArbol(),0, p) : 0);
    }
    
    private int contabilizarRecorrido(BinaryTree<Integer> ar,int nivel , int p){
        if(nivel == p){
            return (ar.getData() != null ? ar.getData() : 0);
        }
        
        int cant = 0;
        
        if(ar.hasLeftChild()){
            cant += this.contabilizarRecorrido(ar.getLeftChild(),nivel +1 , p);
        }
        if(ar.hasRightChild()){
            cant += this.contabilizarRecorrido(ar.getRightChild(),nivel+1, p);
        }
        return cant;
    }
    
}
