package tp2.ejercicio2;
import tp2.ejercicio1.BinaryTree;

public class ej2 {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree();
		arbol.addNivelado(2);
                arbol.addNivelado(3);
                arbol.addNivelado(4);
                System.out.println(arbol.contarHojas());
	}

}
