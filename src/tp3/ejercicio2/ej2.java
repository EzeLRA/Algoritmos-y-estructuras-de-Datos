package tp3.ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class ej2 {

    public static void main(String[] args) {
        //Nodo 1
        GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
        
        //Nodo 2
        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(21));
        children2.add(new GeneralTree<Integer>(22));
        children2.add(new GeneralTree<Integer>(23));
        
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
        
        //Nodo 3
        List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(31));
        children3.add(new GeneralTree<Integer>(32));
        
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
        
        //Nodo 0
        List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
        childen.add(a1);childen.add(a2);childen.add(a3);
        
        GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
        
        //Clase que procesa
        RecorridosAG r = new RecorridosAG();
        List<Integer> l = r.numerosImparesMayoresQuePorNiveles(a, 10);
        
        for(int i=0 ; i<l.size() ; i++){
            System.out.println(l.get(i));
        }
        
    }
    
}
