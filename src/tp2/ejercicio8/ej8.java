package tp2.ejercicio8;
import tp2.ejercicio1.BinaryTree;
import tp2.ejercicio7.ParcialArboles;

public class ej8 {

    public static void main(String[] args) {
        
        //Arbol 1
        BinaryTree<Integer> ar1 = new BinaryTree<Integer>(10);
        ar1.addLeftChild(new BinaryTree<Integer>(2));
        ar1.addRightChild(new BinaryTree<Integer>(3));
        
        //Arbol 2
        BinaryTree<Integer> ar2 = new BinaryTree<Integer>(10);
        ar2.addLeftChild(new BinaryTree<Integer>(2));
        ar2.addRightChild(new BinaryTree<Integer>(3));
        
        ar2.getLeftChild().addLeftChild(new BinaryTree<Integer>(5));
        ar2.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
           
        //Procesador
        ParcialArboles p = new ParcialArboles();
        System.out.println(p.esPrefijo(ar1, ar2));
        
    }
    
}
