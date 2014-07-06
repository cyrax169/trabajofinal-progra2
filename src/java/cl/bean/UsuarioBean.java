/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import cl.pojos.*;

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
    private Tutor Tutor;

    public UsuarioBean() {
    }

}
