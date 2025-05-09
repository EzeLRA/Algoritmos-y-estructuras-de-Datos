package repasoParcial;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tp1.ej8.*;
import tp3.ejercicio1.GeneralTree;

public class ej2 {
    
    //Imprime los primeros hijos del arbol(Lado muy izquierdo)
    public static void imprimeArbol(GeneralTree<Integer> ar){
        if(ar.getData() != null){
            System.out.println(ar.getData());
        }
        if(ar.hasChildren()){
            List<GeneralTree<Integer>> hijos = ar.getChildren();
            imprimeArbol(hijos.get(0));
        }    
    }
    
    public static void imprimeArbol2(GeneralTree<Integer> ar,boolean fin){
        if(ar.hasChildren()){
            List<GeneralTree<Integer>> hijos = ar.getChildren();
           
            Iterator<GeneralTree<Integer>> it = hijos.iterator();
            while(it.hasNext() && !fin){
                imprimeArbol2(it.next(),fin);
                if(hijos.getFirst().isLeaf() && hijos.size() > 2){
                    fin = true;
                }
            }
            
        }
        if(ar.getData() != null){
            System.out.println(ar.getData());
        }
    }
    
    public static void main(String[] args) {
        //Nodo 1
        //GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
        
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
        //childen.add(a1);
        childen.add(a2);
        childen.add(a3);
        
        GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
        
        /*
                    0
             1      2       3 
                 21-22-23   31-32
        */
        
        imprimeArbol2(a,false);
    }
    
}
