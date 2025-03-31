package TP1;

public class Estructura extends Datos {
    private int[] arr;
    
    public Estructura(int max, int min, float prom, int[] arr) {
        super(max, min, prom);
        this.arr = arr;
    }

    public void calcular(){
        int total = 0;
        for(int num : this.arr){
            if(this.getMax()<num) this.setMax(num);
            if(this.getMin()>num) this.setMin(num);
            total += num;
        }
        this.setCant(this.arr.length);
        this.setTotal(total);
        this.setProm(total / this.arr.length);
    }
    
}
