/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.bean;
import cl.pojos.*;
import cl.util.*;
import cl.util.HibernateUtil;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arbol
 */
@ManagedBean(name = "estBean")
@RequestScoped
public class estudianteBean {

   private Estudiante estudiante;
    
    
    //atributos para los comobobox
    private List<Region> regiones;
    private List<Provincia> provincias;
    private List<Comuna> comunas;

    public estudianteBean() {
        //inicilizando el objeto estudiante
        Direccion direccion = new Direccion();
        direccion.setRegion(new Region());
        direccion.setProvincia(new Provincia());
        direccion.setComuna(new Comuna());
        estudiante = new Estudiante();
        estudiante.setDireccion(direccion);
        //inicializar las listas
        regiones = new ArrayList<>();
        provincias = new ArrayList<>();
        comunas = new ArrayList<>();
        cargarRegiones();
    }

    //cargar todas las regiones
    private void cargarRegiones() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        regiones = se.createCriteria(Region.class).list();
    }

    public void eventoComboRegion() {
        int id = estudiante.getDireccion().getRegion().getRegionId();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        Region r = (Region) se.get(Region.class, id);
        //cargar las provincias de la region encontrada en la lista de provincias
        provincias.clear();
        for(Provincia p : r.getProvincias()){
            provincias.add(p);
        }
        
       
    }
    
    public void eventoComboComuna(){
    int idProvincia = estudiante.getDireccion().getProvincia().getProvinciaId();
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session se = sf.openSession();
    Provincia p = (Provincia) se.get(Provincia.class, idProvincia);
    
    comunas.clear();
        for (Comuna c : p.getComunas()) {
            comunas.add(c);
        }
    }

   public String guardar() {
        SessionFactory  sf  = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
       
        
        Region r = (Region) se.get(Region.class, estudiante.getDireccion().getRegion().getRegionId());
        Provincia p = (Provincia) se.get(Provincia.class, estudiante.getDireccion().getProvincia().getProvinciaId());
        Comuna c = (Comuna) se.get(Comuna.class, estudiante.getDireccion().getComuna().getComunaId());
        
        Direccion dir = new Direccion(r, p, c, estudiante.getDireccion().getCalle());
        estudiante.setDireccion(dir);
        
        
        se.persist(dir);
        se.beginTransaction().commit();
        se.persist(estudiante);
        se.beginTransaction().commit();
                
        
        
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "aviso", "Estudiante registrado correctamente");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        //
        
        return "index";
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Region> getRegiones() {
        return regiones;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public List<Comuna> getComunas() {
        return comunas;
    }

}
    

