package Entidades;

import java.util.ArrayList;

public class Usuario {

    private String nombre, id, numCelular, costeAnual;
    public ArrayList<Cobertura> lCoberturasCliente;

    public Usuario(String nombre, String id, String numCelular, String costeAnual) {
        this.nombre = nombre;
        this.id = id;
        this.numCelular = numCelular;
        this.lCoberturasCliente = new ArrayList<>();
        this.costeAnual = costeAnual;
    }

    //Metodos
    public void agregarCoberturaLista(Cobertura cobertura) {
        this.lCoberturasCliente.add(cobertura);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public ArrayList<Cobertura> getlCoberturasCliente() {
        return lCoberturasCliente;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public void setlCoberturasCliente(ArrayList<Cobertura> lCoberturasCliente) {
        this.lCoberturasCliente = lCoberturasCliente;
    }

}
