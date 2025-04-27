package tp3.ejercicio2;
import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

public class RecorridosAG {
    public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
        List<Integer> res = new LinkedList<Integer>();
        
        if((a != null)&&(!a.isEmpty())){
           this.procesarPreOrden(a, n, res);
        }
        
        return res;
    }
    private void procesarPreOrden(GeneralTree<Integer> ar,int n,List<Integer> l){
        
        if(ar.getData() != null){
            if((ar.getData() % 2 == 1)&&(ar.getData() > n)){
                l.add(ar.getData());
            }
        }
        if(ar.hasChildren()){
            List<GeneralTree<Integer>> children = ar.getChildren();
            for (GeneralTree<Integer> child: children) {
                this.procesarPreOrden(child, n,l);
            }
        }
        
    }
    
}
