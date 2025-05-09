package tp3.ejercicio5;
import tp3.ejercicio1.GeneralTree;
import java.util.*;

public class ej5 {
    
    public static boolean esAncestro(GeneralTree<Integer> ar,int a,int b){
        boolean encontroNodo = false;
        boolean cumple = false;
        
        if(ar != null && !ar.isEmpty()){
            List<GeneralTree<Integer>> hijos = ar.getChildren();
            Iterator<GeneralTree<Integer>> it = hijos.iterator();
            while(it.hasNext() && !cumple){
                GeneralTree<Integer> hijo = it.next();
                if(hijo.getData() == a && !encontroNodo){
                    return true;
                }
                if(hijo.hasChildren()){
                    encontroNodo = esAncestro(hijo,a,b);
                }
                if(encontroNodo && hijo.getData()== b){
                    cumple = true;
                }
            }
            
        }
        
        return cumple;
    }
    
    public static void main(String[] args) {
        
    }
    
}
