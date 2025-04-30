package tp2.ejercicio9;

public class NodoEspecial {
    private int suma;
    private int resta;
    
    public NodoEspecial(){
        
    }
    
    public NodoEspecial(int a,int b){
        this.suma = a;
        this.resta = b;
    }
    
    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }
    
    
    
}
