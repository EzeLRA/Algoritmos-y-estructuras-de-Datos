package TP1;

public class ejercicio5 {
        
    public static Datos calcular(int[] numeros){
        Datos d = new Datos();
        int max = -1; int min = 999999; float prom = 0; int total = 0;
        
        for (int i=0;i<numeros.length;i++){
            if(max < numeros[i]) max = numeros[i];
            if(min > numeros[i]) min = numeros[i];
            total += numeros[i];
        }
        
        prom = total / numeros.length;
        d.setMax(max);
        d.setMin(min);
        d.setProm(prom);
        
        return d;
    };
    
    public static void calcular2(Datos d,int numero){
        if(d.getMax()<numero) d.setMax(numero);
        if(d.getMin()>numero) d.setMin(numero);
        d.setCant(d.getCant() + 1);
        d.setTotal(d.getTotal() + numero);
        d.setProm(d.getTotal() / d.getCant());
    };
    
    public static void main(String[] args) {
        int [] arr = {5,-7,0,23,87,12,4,1};
        //Datos d = calcular(arr);
        /*
        Datos d = new Datos(-1,9999999,0);
        for(int num : arr){
            calcular2(d,num);
        }
        System.out.println(d.getMax());
        System.out.println(d.getMin());
        System.out.println(d.getProm());
        */
        Estructura e = new Estructura(-1,999999,0,arr);
        e.calcular();
        System.out.println(e.getMax());
        System.out.println(e.getMin());
        System.out.println(e.getProm());
    };
    
}
