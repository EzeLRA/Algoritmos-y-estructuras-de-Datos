package tp2.ejercicio9;
import tp2.ejercicio1.BinaryTree;
import tp2.ejercicio7.ParcialArboles;

public class ej9 {

    public static void main(String[] args) {
        //Arbol 1
        BinaryTree<Integer> ar = new BinaryTree<Integer>(10);
        ar.addLeftChild(new BinaryTree<Integer>(2));
        ar.addRightChild(new BinaryTree<Integer>(3));
        
        //Procesador
        ParcialArboles p = new ParcialArboles();
        BinaryTree<NodoEspecial> res = p.sumAndDif(ar);
        System.out.println(res.getData().getSuma() + " ; " + res.getData().getResta());
        
    }
    
}
