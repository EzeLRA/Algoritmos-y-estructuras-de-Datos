package tp2.ejercicio1;
import Practica1.TP1.ej8.Queue;


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

	public  int contarHojas() {
		
	    if(this.isLeaf()){
	    	return 1;
	    }else{
	    	int hojasD = 0;
	    	int hojasI = 0;
	    	if(this.hasLeftChild()){
	    		hojasD = this.getLeftChild().contarHojas();
	    	}
	    	if(this.hasRightChild()){
	    		hojasI = this.getRightChild().contarHojas();
	    	}
	    	return hojasD + hojasI;
	    }
	}
	
        //Inserta elementos por niveles
        public void add(T data) {
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
        public void add(BinaryTree<T> tree) {
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
    	 
    public BinaryTree<T> espejo(){
		       		  
 	   return null;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
		
}

