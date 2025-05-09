package tp1.ej3;

public class Profesor {
    //Atributos
    private String nombre;
    private String apellido;
    private String email;
    private String catedra;
    private String facultad;
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String tusDatos() {
        return "Profesor{" + 
                "nombre=" + this.getNombre() + 
                ", apellido=" + this.getApellido() + 
                ", email=" + this.getEmail() + 
                ", catedra=" + this.getCatedra() + 
                ", facultad=" + this.getFacultad() + '}';
    }
    
    
}
