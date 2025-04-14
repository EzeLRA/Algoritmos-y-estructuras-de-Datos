package tp2.ejercicio2;
import tp2.ejercicio1.BinaryTree;

public class ej2 {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree();
		arbol.add(2);
                arbol.add(3);
                arbol.add(4);
                System.out.println(arbol.contarHojas());
	}

}
