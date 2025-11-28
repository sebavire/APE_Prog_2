package com.mycompany.ape_prog_2;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Articulo> listaArticulos = new ArrayList();
    
    public void agregarArticulo(Articulo a){
        listaArticulos.add(a);
    }
    
    public ArrayList<Articulo> getArticulos(){
        return listaArticulos;
    }
    
    public void eliminarArticulo(int posicion){
        listaArticulos.remove(posicion);
    }
    
    public void modificarArticulo(int posicion, Articulo a){
        listaArticulos.set(posicion, a);
    }
    
}
