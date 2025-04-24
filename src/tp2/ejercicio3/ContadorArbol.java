package tp2.ejercicio3;
import java.util.LinkedList;
import java.util.List;
import tp2.ejercicio1.BinaryTree;

public class ContadorArbol{
    BinaryTree<Integer> arbol ;
    
    public ContadorArbol(BinaryTree<Integer> arb){
        this.arbol = arb;
    }

    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
      
    public List<Integer> numerosPares(){
        List<Integer> res ;
        
        res = this.retornarParesInOrden(this.getArbol());
        
        return res;
    }
    
    public List<Integer> retornarParesInOrden(BinaryTree<Integer> ab){
        List<Integer> res = new LinkedList();
        
        if(ab.hasLeftChild()){
            this.retornarParesInOrden(ab.getLeftChild());
        }
        if(ab.getData() % 2 == 0){
            res.add(ab.getData());
            return res;
        }
        if(ab.hasRightChild()){
            this.retornarParesInOrden(ab.getRightChild());
        }
        
        return res;
    }
    
    public List<Integer> retornarParesPosOrden(BinaryTree<Integer> ab){
        List<Integer> res = new LinkedList();
        
        if(ab.hasLeftChild()){
            this.retornarParesInOrden(ab.getLeftChild());
        }
        if(ab.hasRightChild()){
            this.retornarParesInOrden(ab.getRightChild());
        }
        if(ab.getData() % 2 == 0){
            res.add(ab.getData());
            return res;
        }
        
        return res;
    }
    
}
