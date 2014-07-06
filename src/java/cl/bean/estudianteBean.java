/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.bean;

import cl.pojos.Estudiante;
import cl.util.HibernateUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arbol
 */
@ManagedBean(name = "estBean")
@RequestScoped
public class estudianteBean {

    public List<Estudiante> getEstudiante(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ses = sf.openSession();
        List<Estudiante> Lista = ses.createQuery("INSERT INTO Estudiante(Rut,nombre,apellido,email,telefono,biografia,direccion_id,clave) values()").list();
        return null;
        
    }
    public estudianteBean() {
    }
    
}
