package tp2.ejercicio6;
import tp2.ejercicio1.BinaryTree;

public class Transformacion {
    private BinaryTree<Integer> arbol;

    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
    public BinaryTree<Integer> suma(){
        if(this.getArbol() == null){
            return new BinaryTree<Integer>(0); 
        }
        BinaryTree<Integer> ar = this.getArbol();
        this.transformar(ar);
        return ar;
    }
    
    private int transformar(BinaryTree<Integer> ab){
        int actual=0;
        if (ab.getData()!=null) actual=ab.getData();
        if (ab.isLeaf()) {
            ab.setData(0);
            return actual;
        }
        int suma=0;
        if (ab.hasLeftChild())  suma+= this.transformar(ab.getLeftChild());
        if (ab.hasRightChild()) suma+= this.transformar(ab.getRightChild());
        ab.setData(suma);
        return actual+suma;
    }
    
}
