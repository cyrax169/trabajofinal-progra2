package cl.pojos;
// Generated 30-06-2014 10:39:28 AM by Hibernate Tools 3.6.0



/**
 * Inscripcioncurso generated by hbm2java
 */
public class Inscripcioncurso  implements java.io.Serializable {


     private Integer inscripcionId;
     private Curso curso;
     private Estudiante estudiante;

    public Inscripcioncurso() {
    }

    public Inscripcioncurso(Curso curso, Estudiante estudiante) {
       this.curso = curso;
       this.estudiante = estudiante;
    }
   
    public Integer getInscripcionId() {
        return this.inscripcionId;
    }
    
    public void setInscripcionId(Integer inscripcionId) {
        this.inscripcionId = inscripcionId;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }




}


