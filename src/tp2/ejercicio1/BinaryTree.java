package tp2.ejercicio1;
import tp1.ej8.Queue;


public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
        
        public void printPreorden() {
            System.out.println(this.getData());
            if (this.hasLeftChild()) {
                this.getLeftChild().printPreorden();
            }
            if (this.hasRightChild()) {
                this.getRightChild().printPreorden();
            }
        }
        
	public int contarHojas() {
		
	    if (this.isLeaf()) {
		   return 1;
	   }
	   int countLeft = 0;
	   int countRight = 0;
	   if (this.hasLeftChild()) {
		   countLeft = this.getLeftChild().contarHojas();
	   }
	   if (this.hasRightChild()) {
		   countRight = this.getRightChild().contarHojas();
	   }
	   
	   return countLeft + countRight;
        }
        
        //Inserta elementos por niveles
        public void addNivelado(T data) {
            if (this.getData()==null) {
                this.setData(data);
		return;
            }
            Queue<BinaryTree<T>> queue = new Queue<BinaryTree<T>>();
            queue.enqueue(this);
            while (!queue.isEmpty()) {
                BinaryTree<T> e = queue.dequeue();
		if (e.hasLeftChild()) {
                    queue.enqueue(e.getLeftChild());
		} else {
                    e.addLeftChild(new BinaryTree<T>(data));
                    break;
		}
		if (e.hasRightChild()) {
                    queue.enqueue(e.getRightChild());
                } else {
                    e.addRightChild(new BinaryTree<T>(data));
                    break;
                }
            }
	}
        
        //Inserta arboles por niveles
        public void addNivelado(BinaryTree<T> tree) {
            if (this.getData()==null) {
                this.setData(tree.getData());
		this.addLeftChild(tree.getLeftChild());
		this.addRightChild(tree.getRightChild());
		return;
            }
            Queue<BinaryTree<T>> queue = new Queue<BinaryTree<T>>();
            queue.enqueue(this);
            while (!queue.isEmpty()) {
                BinaryTree<T> e = queue.dequeue();
		if (e.hasLeftChild()) {
                    queue.enqueue(e.getLeftChild());
		} else {
                    e.addLeftChild(tree);
                    break;
		}
		if (e.hasRightChild()) {
                    queue.enqueue(e.getRightChild());
		} else {
                    e.addRightChild(tree);
                    break;
                }
            }
        }
    
    //Recorre el arbol y agrega en el arbol auxiliar los elementos de forma inversa
    public BinaryTree<T> espejo(){
        BinaryTree<T> tree = new BinaryTree<T>(this.getData());
        if (!this.isLeaf()) {
            if (this.hasLeftChild()) {
                tree.addRightChild(this.getLeftChild().espejo());
            }    
            if (this.hasRightChild()) {
                tree.addLeftChild(this.getRightChild().espejo());
            } 	    		
        }
 	return tree;
    }

	// 0<=n<=m  Se imprime entre los niveles determinadors por n y m
	public void entreNiveles(int n, int m){
            int nivel = 0;
            BinaryTree<T> ab = null;
            Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
            cola.enqueue(this);
            cola.enqueue(null);
            while ((!cola.isEmpty())&&(nivel >= n)&&(nivel <= m)){
                ab = cola.dequeue();
                if (ab != null) {
                    System.out.print(ab.getData());
                    if ((ab.hasLeftChild())&&(nivel <= m)) {
                        cola.enqueue(ab.getLeftChild());
                    }
                    if ((ab.hasRightChild())&&(nivel <= m)) {
                        cola.enqueue(ab.getRightChild());
                    }
                } else if (!cola.isEmpty()) {
                    nivel ++;
                    System.out.println();
                    cola.enqueue(null);
                }
            }
            //System.out.println();
            //System.out.println(nivel);
        }
        
        public void printLevelTraversal() {
            BinaryTree<T> ab = null;
            Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
            cola.enqueue(this);
            cola.enqueue(null);
            while (!cola.isEmpty()) {
                ab = cola.dequeue();
                if (ab != null) {
                    System.out.print(ab.getData());
                    if (ab.hasLeftChild()) {
                        cola.enqueue(ab.getLeftChild());
                    }
                    if (ab.hasRightChild()) {
                        cola.enqueue(ab.getRightChild());
                    }
                } else if (!cola.isEmpty()) {
                    System.out.println();
                    cola.enqueue(null);
                }
            }           
        }
		
}

