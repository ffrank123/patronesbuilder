/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.builder;

import modelo.computador;

/**
 *
 * @author FRANS
 */
public class TiendaComputador {
    private computadoresBuilder builder;
    public void setBuilder(computadoresBuilder builder){
        this.builder=builder;
    }
    public computador getComputador(){
        return builder.getcomputador();
    }
    public void construirComputador(){
        builder.crearComputador();
        builder.builMarca();
        builder.builProcesador();
        builder.builRan();
    }
}
