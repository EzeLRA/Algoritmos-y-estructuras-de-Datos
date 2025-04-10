package Practica1.tp1_ej7;
import Practica1.TP1.ej3.Estudiante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class tp1_ej7d {

    public static void main(String[] args) {
        //Lista pri
        List<Estudiante> lista = new LinkedList();
        lista.add(new Estudiante("asdf","thew",1,"sdgwegweg","rgergerh"));
        lista.add(new Estudiante("tyktyjf","jkrtr",2,"serykleryeg","rkyhterh"));
        lista.add(new Estudiante("ojhthf","totmkhyoith",3,"sdrtlkmrreg","rgeerrkth"));
        System.out.println("Lista Pri");
        for(Estudiante estudiante:lista){
            System.out.println(estudiante.tusDatos());
        }
        
        //Lista nueva
        List<Estudiante> listaCopia = new LinkedList<Estudiante>(lista);
        /*
        List<Estudiante> listaCopia = new LinkedList();
        listaCopia.addAll(lista);
        */
        Iterator<Estudiante> estudiantes = listaCopia.iterator();
        System.out.println("Lista nueva");
        while(estudiantes.hasNext()){
            System.out.println(estudiantes.next().tusDatos());
        }
        
        System.out.println("");
        
        //Modificacion de lista pri
        lista.get(0).setNombre("Mari");
        listaCopia.get(0).setApellido("DelCampo");
        
        System.out.println("Lista Pri");
        for(Estudiante estudiante:lista){
            System.out.println(estudiante.tusDatos());
        }
        
        System.out.println("Lista nueva");
        for(Estudiante estudiante:listaCopia){
            System.out.println(estudiante.tusDatos());
        }
        
        System.out.println("");
        
        //Agrego estudiante
        Estudiante nuevoEst = new Estudiante("eze","ramon",3,"ssfdser","gfdgdfg"); 
        
        if(!lista.contains(nuevoEst)){
            lista.add(nuevoEst);
        }
        
    }
    
}
