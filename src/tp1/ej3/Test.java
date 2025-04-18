package tp1.ej3;

//Ejercicio 3

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    
    //Crear una clase libreria con esta seccion
    
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
    // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    public static String cadenaAleatoria(int longitud) {
    // El banco de caracteres
    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    // La cadena en donde iremos agregando un carácter aleatorio
    String cadena = "";
    for (int x = 0; x < longitud; x++) {
        int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
        char caracterAleatorio = banco.charAt(indiceAleatorio);
        cadena += caracterAleatorio;
    }
    return cadena;
}

    
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];
        
        for(int i=0;i<estudiantes.length;i++){
            estudiantes[i] = new Estudiante();
        }
        
        for(int i=0;i<profesores.length;i++){
            profesores[i] = new Profesor();
        }
        
        for(Estudiante e:estudiantes){
            e.setNombre(cadenaAleatoria(10));
            e.setApellido(cadenaAleatoria(10));
            e.setComision(0);
            e.setDireccion(cadenaAleatoria(10));
            e.setEmail(cadenaAleatoria(10));
        }
        
        for(Profesor p:profesores){
            p.setApellido(cadenaAleatoria(10));
            p.setCatedra(cadenaAleatoria(10));
            p.setEmail(cadenaAleatoria(10));
            p.setFacultad(cadenaAleatoria(10));
            p.setNombre(cadenaAleatoria(10));
        }
        
        for(Estudiante e:estudiantes){
            System.out.println(e.tusDatos());
        }
        
        for(Profesor p:profesores){
            System.out.println(p.tusDatos());
        }
    }
    
}
