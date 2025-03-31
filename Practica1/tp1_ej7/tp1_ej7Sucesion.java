package tp1_ej7;

import java.util.ArrayList;
import java.util.List;

public class tp1_ej7Sucesion {
    public static List<Integer> calcularSucesion (int n) {  
        
        List<Integer> lista = new ArrayList();
        while(n!=1){
            if((n % 2) == 0){
                n /= 2;
            }else{
                n = (3*n) + 1;
            }
            lista.add(n);
        }
        
        return lista;
    }
    
    /*
    public static List<Integer> calcular(int n){
        if(n>0){
            return calcular(n-1);
        }
    }*/
    
    public static void main(String args[]){
        //List<Integer> lista = calcularSucesion(10);
        
    }
}
