package Practica1.TP1.ej8;

public class CircularQueue<T> extends Queue{
    public T shift(){
        T retorno = (T) this.dequeue();
        this.enqueue(retorno);
        return retorno;
    }
}
