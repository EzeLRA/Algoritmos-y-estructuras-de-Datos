package tp2.ejercicio7;
import tp2.ejercicio1.BinaryTree;
import tp2.ejercicio9.NodoEspecial;

public class ParcialArboles {
    private BinaryTree<Integer> arbol;
    
    //Metodos
    public BinaryTree<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
    //Ejercicio 7
    
    public boolean isLeftTree (int num){
        boolean cumple = false;
        
        if(!this.getArbol().isEmpty()){
            BinaryTree<Integer> nodo = this.buscarNodo(this.getArbol(), new BinaryTree<Integer>(), num);
            if(!nodo.isEmpty()){
                int hi = -1;
                int hd = -1;
                if(nodo.hasLeftChild()) hi = this.contabilizarNodos(nodo);
                if(nodo.hasRightChild()) hd = this.contabilizarNodos(nodo);
                cumple = (hi>hd);
            }
        }
 
        return cumple;
    }
    
    private BinaryTree<Integer> buscarNodo(BinaryTree<Integer> ab, BinaryTree<Integer> nodo, int num) {
        //Nodo base
        if ((ab.getData()!=null) && (ab.getData()==num)) return ab;
        //Nodos restantes
        if (ab.hasLeftChild()) nodo=buscarNodo(ab.getLeftChild(), nodo, num);
        if ((ab.hasRightChild()) && (nodo.isEmpty())) nodo=buscarNodo(ab.getRightChild(), nodo, num);
        return nodo;
    }
    
    private int contabilizarNodos(BinaryTree<Integer> ab){
        int cant=0;
        if ((ab.hasLeftChild() && !ab.hasRightChild()) || (!ab.hasLeftChild() && ab.hasRightChild())) cant++;
        if (ab.hasLeftChild())  cant+=contabilizarNodos(ab.getLeftChild());
        if (ab.hasRightChild()) cant+=contabilizarNodos(ab.getRightChild());
        return cant;
    }
    
    //Ejercicio 8
    public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2){
        boolean cumple = false;
        if((arbol1.getData() != null)&&(arbol2.getData() != null)){
            cumple = arbol1.getData() == arbol2.getData();
        }
        if(arbol1.hasLeftChild() && arbol2.hasLeftChild() && cumple){
            cumple = this.esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
        }
        if(arbol1.hasRightChild() && arbol2.hasRightChild() && cumple){
            cumple = this.esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
        }
        
        return cumple;
    }
    
    //Ejercicio 9
    public BinaryTree<NodoEspecial> sumAndDif(BinaryTree<Integer> arbol){
        BinaryTree<NodoEspecial> res=new BinaryTree<NodoEspecial>();
        if ((arbol!=null) && (!arbol.isEmpty())) obtenerSumasRestas(arbol, res, 0, 0);
        return res;
    }
    
    private void obtenerSumasRestas(BinaryTree<Integer> arbol, BinaryTree<NodoEspecial> abSaD, int suma, int padre) {
        int num=0;
        if (arbol.getData()!=null) num=arbol.getData();
        abSaD.setData(new NodoEspecial(num+suma, num-padre));
        if (arbol.hasLeftChild()) {
            abSaD.addLeftChild(new BinaryTree<>());
            obtenerSumasRestas(arbol.getLeftChild(), abSaD.getLeftChild(), num+suma, num);
        }
        if (arbol.hasRightChild()) {
            abSaD.addRightChild(new BinaryTree<>());
            obtenerSumasRestas(arbol.getRightChild(), abSaD.getRightChild(), num+suma, num);
        }
    }
    
}
