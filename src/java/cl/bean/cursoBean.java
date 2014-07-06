/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.bean;

import cl.pojos.Curso;
import cl.util.HibernateUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arbol
 */
@ManagedBean(name = "curBean")
@RequestScoped
public class cursoBean {

    public List<Curso> getCurso(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Curso> Lista = ses.createQuery("SELECT Rut , CURSO from INSCRIPCIONCURSO,ESTUDIANTE,CURSO where ESUTIDANTE.RUT = INSCRIPCIONCURSO.RUT AND INSCRIPCIONCURSO.curso_id=CURSO.curso_id ").list();
        return null;
    }
    public cursoBean() {
    }
    
}
