package tp2.ejercicio6;
import tp2.ejercicio1.BinaryTree;

public class ej6 {

    public static void main(String[] args) {
        //Nivel 0
        BinaryTree<Integer> ar = new BinaryTree<Integer>(2);
        //Nivel 1
        ar.addNivelado(10);
        ar.addNivelado(23);
        //Nivel 2
        ar.addNivelado(9);
        ar.addNivelado(1);
        ar.addNivelado(12);
        ar.addNivelado(4);
        
        Transformacion tr = new Transformacion();
        tr.setArbol(ar);
        
        BinaryTree<Integer> ar2 = tr.suma();
        
        ar2.printLevelTraversal();
        
    }
    
}
