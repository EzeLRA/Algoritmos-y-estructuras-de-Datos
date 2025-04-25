package tp2.ejercicio5;
import tp2.ejercicio1.BinaryTree;

public class ejercicio5 {

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
        
        //Clase medidor de profundidad
        ProfundidadDeArbolBinario b = new ProfundidadDeArbolBinario();
        b.setArbol(ar);
        
        System.out.println(b.sumaElementosProfundidad(1));
        
    }
    
}
