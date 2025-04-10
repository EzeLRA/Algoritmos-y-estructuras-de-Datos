package Practica1.TP1.ej1y2;

public class clasePrueba {
   
    public static void imprimirConFor(int a ,int b){
        for(int i = a;i<=b;i++){
            System.out.println("Numero : " + i);
        }
    }
    
    public static void imprimirConWhile(int a ,int b){
        while(a<=b){
           System.out.println("Numero : " + a);
           a++;
        }
    }
    
    public static void imprimirRecursivo(int a ,int b){
        System.out.println("Numero : " + a);
        if(a<b){
            a++;
            imprimirRecursivo(a,b);
        }
    }
    
    public static int[] retornarArreglo(int n){
        int[] arr = new int[n];
        for(int i=1;i<=arr.length;i++){
            arr[i-1] = n * i ;
        }
        return arr;
    }
}
