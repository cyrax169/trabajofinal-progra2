package cl.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import cl.pojos.*;
import cl.util.*;
import javax.faces.context.FacesContext;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Yeison
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {

    private String Rut;
    private String Clave;
    private Estudiante estudiante;
    private Tutor tutor;

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor Tutor) {
        this.tutor = Tutor;
    }

    public UsuarioBean() {
    }

   /** public String Validar() {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        //crear sesionfactory y session
        estudiante = (Estudiante) se.createQuery("from Estudiante e where e.rut='" + Rut + "'").uniqueResult();
        tutor = (Tutor) se.createQuery("from Tutor e where e.rut='" + Rut + "'").uniqueResult();
        if ((estudiante) != null) {
            if (estudiante.getClave().equals(Clave)) {
               //crear una sesion 
                //redireccionar al menu del estudiante

            } else {
                //mostrar un mensaje que la clave es incorrecta
            }

        } else if (tutor != null) {
            if (tutor.getClave().equals(Clave)) {
               //crear una sesion 
                //redireccionar al menu del estudiante

            } else {
                //mostrar un mensaje que la clave es incorrecta
            }

        } else if (Rut.equals("admin") && Clave.equals("admin")) {
           //redireccionar al menu del admin

        } else {
            //mostrar un mensaje de que el rut no existe
        }

    }
**/
    public String cerrarSesion() {
        estudiante = null;
        return "index";
    }
}
