package tp1_ej7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class tp1_ej7Sucesion {
    public static List<Integer> calcularSucesion (int n) {  
        
        List<Integer> list ;
        
		if (n % 2 == 0) {
			list = calcularSucesion(n/2);
		} else if (n!=1) {
			list = calcularSucesion(n*3+1);			
		}else{
                    list = new ArrayList();
                }
		list.add(0, n);
        
        return list;
    }
    
    public static void invertirArrayList2(ArrayList<Integer> lista){
        List<Integer> aux = new ArrayList();
        while(!lista.isEmpty()){
            aux.add(lista.remove(lista.size()-1));
        }
        lista.addAll(aux);
    }

    private static void revertir(ArrayList<Integer> list, int start, int end) {
        if (start < end) {
            // Intercambiar los elementos en las posiciones start y end
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            // Llamada recursiva con los índices internos
            revertir(list, start + 1, end - 1);
        }
    }
    
    public static void invertirArrayList(ArrayList<Integer> list) {
        revertir(list, 0, list.size() - 1);
    }
    
    public static int sumarLinkedList(LinkedList<Integer> lista){
        if(lista.isEmpty()){
            return 0;
        }else{
            int valor = lista.remove(0);
            return valor + sumarLinkedList(lista);
        }
    }
    
    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
        ArrayList<Integer> listaNueva = new ArrayList();
        /*
            Rediseñar el algoritmo de modo que ingrese los elementos de forma ordenada
        */
        listaNueva.addAll(lista1);
        listaNueva.addAll(lista2);
        Collections.sort(listaNueva);
        return listaNueva;
    }
    
    public static void main(String args[]){
        //Generacion de lista con sucesion
        List<Integer> lista = calcularSucesion(10);
        for (Integer num : lista){
            System.out.println(num);
        }
        
        //Inversion de orden
        System.out.println("");
        
        ArrayList<Integer> lista2 = new ArrayList();
        lista2.addAll(lista);
        
        invertirArrayList(lista2);
        
        for (Integer num : lista2){
            System.out.println(num);
        }
        
        //Calculo de total
        
        System.out.println("");
        
        LinkedList<Integer> lista3 = new LinkedList();
        lista3.addAll(lista);
        
        System.out.println(sumarLinkedList(lista3));
        System.out.println("");
        
        //Fusion de listas ordenadas
        
        ArrayList<Integer> listaA = (ArrayList<Integer>) calcularSucesion(30);
        Collections.sort(listaA);
        ArrayList<Integer> listaB = (ArrayList<Integer>) calcularSucesion(10);
        Collections.sort(listaB);
        
        ArrayList<Integer> lista4 = combinarOrdenado(listaA,listaB);
        
        for(Integer num:lista4){
            System.out.println(num);
        }
        
    }
}
