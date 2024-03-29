package cl.pojos;
// Generated 30-06-2014 10:39:28 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private String rut;
     private Direccion direccion;
     private String nombre;
     private String apellido;
     private String email;
     private String telefono;
     private String biografia;
     private String clave;
     private Set<Inscripcioncurso> inscripcioncursos = new HashSet<Inscripcioncurso>(0);

    public Estudiante() {
    }

	
    public Estudiante(String rut, Direccion direccion, String nombre, String apellido, String email, String telefono, String biografia, String clave) {
        this.rut = rut;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.biografia = biografia;
        this.clave = clave;
    }
    public Estudiante(String rut, Direccion direccion, String nombre, String apellido, String email, String telefono, String biografia, String clave, Set<Inscripcioncurso> inscripcioncursos) {
       this.rut = rut;
       this.direccion = direccion;
       this.nombre = nombre;
       this.apellido = apellido;
       this.email = email;
       this.telefono = telefono;
       this.biografia = biografia;
       this.clave = clave;
       this.inscripcioncursos = inscripcioncursos;
    }
   
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getBiografia() {
        return this.biografia;
    }
    
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Set<Inscripcioncurso> getInscripcioncursos() {
        return this.inscripcioncursos;
    }
    
    public void setInscripcioncursos(Set<Inscripcioncurso> inscripcioncursos) {
        this.inscripcioncursos = inscripcioncursos;
    }




}


