package tp2.ejercicio2;
import tp2.ejercicio1.BinaryTree;

public class ej2 {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree();
		arbol.addNivelado(2);
                arbol.addNivelado(3);
                arbol.addNivelado(4);
                arbol.addNivelado(10);
                arbol.addNivelado(30);
                arbol.entreNiveles(0, 2);
                //System.out.println(arbol.contarHojas());
                //BinaryTree<Integer> arbol2 = arbol.espejo();
                //arbol2.printPreorden();
                
	}

}
