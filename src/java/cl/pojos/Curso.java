package cl.pojos;
// Generated 30-06-2014 10:39:28 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {


     private Integer cursoId;
     private Tutor tutor;
     private String nombre;
     private String descripcion;
     private String fechaInicio;
     private String fechaFin;
     private int capacidad;
     private Set<Inscripcioncurso> inscripcioncursos = new HashSet<Inscripcioncurso>(0);

    public Curso() {
    }

	
    public Curso(Tutor tutor, String nombre, String descripcion, String fechaInicio, String fechaFin, int capacidad) {
        this.tutor = tutor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.capacidad = capacidad;
    }
    public Curso(Tutor tutor, String nombre, String descripcion, String fechaInicio, String fechaFin, int capacidad, Set<Inscripcioncurso> inscripcioncursos) {
       this.tutor = tutor;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.capacidad = capacidad;
       this.inscripcioncursos = inscripcioncursos;
    }
   
    public Integer getCursoId() {
        return this.cursoId;
    }
    
    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
    public Tutor getTutor() {
        return this.tutor;
    }
    
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public Set<Inscripcioncurso> getInscripcioncursos() {
        return this.inscripcioncursos;
    }
    
    public void setInscripcioncursos(Set<Inscripcioncurso> inscripcioncursos) {
        this.inscripcioncursos = inscripcioncursos;
    }




}


