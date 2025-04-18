package tp1.ej5;

public class Datos {
    private int max,min,cant,total;
    private float prom;
    
    public Datos(){
        this.cant = 0; this.prom = 0;
    }
    
    public Datos(int max, int min, float prom) {
        this.max = max;
        this.min = min;
        this.prom = prom;
        this.cant = 0; this.total = 0;
    }
    
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
