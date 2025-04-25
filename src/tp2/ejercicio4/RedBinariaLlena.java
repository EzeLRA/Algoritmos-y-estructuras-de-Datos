package tp2.ejercicio4;
import tp2.ejercicio1.BinaryTree;

public class RedBinariaLlena {
    
    private BinaryTree<Integer> arbol;
    
    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
   
    public int retardoReenvio(){
        return (this.getArbol() == null && !this.getArbol().isEmpty() ? -1 : this.evaluarReenvios(this.getArbol()));
    }
    
    private int evaluarReenvios(BinaryTree<Integer> ab){
        int Hi = 0;
        int Hd = 0;
        
        if(ab.hasLeftChild()){Hi = this.evaluarReenvios(ab.getLeftChild());}
        if(ab.hasRightChild()){Hd = this.evaluarReenvios(ab.getRightChild());}
        
        return (Hi > Hd ? Hi : Hd) + ab.getData(); 
    }
    
    
}
