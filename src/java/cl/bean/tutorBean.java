/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.bean;

import cl.pojos.Curso;
import cl.pojos.Tutor;
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
@ManagedBean(name = "tutBean")
@RequestScoped
public class tutorBean {

    /**
     * Creates a new instance of tutorBean
     */
    public tutorBean() {
    }
     public List<Tutor> getTutor(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Curso> Lista = ses.createQuery("SELECT Rut  from Tutor where rut=rut").list();
            return null;
     }
}
