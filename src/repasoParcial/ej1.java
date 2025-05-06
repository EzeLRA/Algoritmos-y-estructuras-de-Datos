package repasoParcial;
import java.util.LinkedList;
import java.util.List;
import tp3.ejercicio1.GeneralTree;

/*
    Defina una clase que tenga una unica variable de instancia
de tipo GeneralTree<Integer> y un metodo publico con la firma
"public List<Integer> camino (int n)". El metodo debe devolver un camino 
desde la raiz hasta una hoja donde cada nodo(no hoja) tenga al menos la 
cantidad num de hijos. Debe retornar el primer camino que cumpla la condicion
caso contrario debera devolver la lista vacia.
*/

public class ej1 {
    private GeneralTree<Integer> arbol;

    public GeneralTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(GeneralTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
    public List<Integer> camino (int n){
        List<Integer> res = new LinkedList<Integer>();
        boolean cumple = false;
        if(this.getArbol() != null){
            this.procesar(this.getArbol(),res,n,cumple);
        }
        return res;
    }
    
    private void procesar(GeneralTree<Integer> ar,List<Integer> l,int num,boolean fin){
        if(ar.hasChildren()){
            List<GeneralTree<Integer>> hijos = ar.getChildren();
        }
    }
    
}
