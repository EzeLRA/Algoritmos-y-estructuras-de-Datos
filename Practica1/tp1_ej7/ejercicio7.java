package tp1_ej7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ejercicio7 {
    
    public static boolean esCapicua(ArrayList<Integer> lista){
        int num = 0;
        int res = 0;
        for(int i=0;i<lista.size();i++){
            num *= 10;
            num += (int) lista.get(i);
        }
        for(int i=lista.size()-1;i>=0;i--){
            res *= 10;
            res += (int) lista.get(i);
        }
        return res==num;
    }
    
    public static void imprimirRecursivo(List<Integer> lista,int indice){
        if(indice<lista.size()){
            System.out.println(lista.get(indice));
            imprimirRecursivo(lista,indice + 1);
        }
    }
    
    public static void imprimir1(List<Integer> lista){
        if(!lista.isEmpty()){
            imprimirRecursivo(lista,0);
        }
    }
    
    public static void main(String[] args) {
        //Implementacion con arrayList
        
        ArrayList<Integer> testArrayList = new ArrayList();
        testArrayList.add(40);
        testArrayList.add(20);
        testArrayList.add(20);
        testArrayList.add(40);
        
        for(int i=0;i<testArrayList.size();i++){
            System.out.println(testArrayList.get(i));
        }
        
        //imprimir1(testArrayList);
        
        
        //Implemetacion con linkedList
        List<Integer> testLinkedList = new LinkedList();
        testLinkedList.add(2);
        testLinkedList.add(4);
        testLinkedList.add(6);
        testLinkedList.add(8);
        
        Integer numero;
        while(!testLinkedList.isEmpty()){
            numero = testLinkedList.get(0);
            System.out.println(numero);
            testLinkedList.remove(0);
        }
        
        System.out.println(esCapicua(testArrayList));
    }
    
}
