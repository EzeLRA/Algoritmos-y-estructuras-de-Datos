package tp3.ejercicio2;
import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;
import tp1.ej8.Queue;

public class RecorridosAG {
    
    //Metodos primarios
    public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
        List<Integer> res = new LinkedList<Integer>();
        
        if((a != null)&&(!a.isEmpty())){
           this.procesarPreOrden(a, n, res);
        }
        
        return res;
    }
    
    public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
        List<Integer> res = new LinkedList<Integer>();
        
        if((a != null)&&(!a.isEmpty())){
           this.procesarInOrden(a, n, res);
        }
        
        return res;
    }
    
    public List<Integer> numerosImparesMayoresQuePosOrden (GeneralTree <Integer> a,Integer n){
        List<Integer> res = new LinkedList<Integer>();
        
        if((a != null)&&(!a.isEmpty())){
           this.procesarPosOrden(a, n, res);
        }
        
        return res;
    }
    
    public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> tree , int n) {
        List<Integer> result = new LinkedList<Integer>();
        if((tree != null)&&(!tree.isEmpty())){
            GeneralTree<Integer> tree_aux;
            Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
            queue.enqueue(tree);
                while (!queue.isEmpty()) {
                tree_aux = queue.dequeue();

                if(tree_aux != null){
                    if((tree_aux.getData() % 2 == 1)&&(tree_aux.getData() > n) )result.add(tree_aux.getData());
                }
                List<GeneralTree<Integer>> children = tree_aux.getChildren();
                for (GeneralTree<Integer> child: children) {
                    queue.enqueue(child);
                }
            }
        }
        return result;
    }
    
    
    //Metodos secundarios
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
    
    private void procesarInOrden(GeneralTree<Integer> ar,int n,List<Integer> l){
        if(ar.hasChildren()){
            GeneralTree<Integer> primerHijo = ar.getChildren().get(0);
            
            if(primerHijo.getData() != null){
                if((primerHijo.getData() % 2 == 1)&&(primerHijo.getData() > n)){
                    l.add(primerHijo.getData());
                }
            }
        }
        if(ar.getData() != null){
            if((ar.getData() % 2 == 1)&&(ar.getData() > n)){
                l.add(ar.getData());
            }
        }
        if(ar.getChildren().size() > 0){
            List<GeneralTree<Integer>> hijos = ar.getChildren();
            for (int i=1; i <hijos.size() ; i++) {
                this.procesarInOrden(hijos.get(i), n,l);
            }
        }
        
    }
    
    private void procesarPosOrden(GeneralTree<Integer> ar,int n,List<Integer> l){
        
        if(ar.hasChildren()){
            List<GeneralTree<Integer>> children = ar.getChildren();
            for (GeneralTree<Integer> child: children) {
                this.procesarPosOrden(child, n,l);
            }
        }
        if(ar.getData() != null){
            if((ar.getData() % 2 == 1)&&(ar.getData() > n)){
                l.add(ar.getData());
            }
        }
        
    }
    
}
