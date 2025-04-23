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
      
    public List<Integer> numerosPares1(){
        List<Integer> res = new LinkedList();
        
        System.out.println(this.getArbol().getData());
        //..
        
        return res;
    }
}
