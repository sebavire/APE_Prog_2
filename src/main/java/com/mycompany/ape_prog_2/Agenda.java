package com.mycompany.ape_prog_2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> listaContactos = new ArrayList();
    
    public void agregarContacto(Contacto c){
        listaContactos.add(c);
    }
    
    public ArrayList<Contacto> getContactos(){
        return listaContactos;
    }
    
}
