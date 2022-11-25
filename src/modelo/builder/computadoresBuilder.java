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
public abstract class computadoresBuilder {
    protected computador computador;
    public computador getcomputador(){
        return computador;
    }
    public void crearComputador(){
        computador=new computador();
        
    }
    public abstract void builMarca();
    public abstract void builProcesador();
    public abstract void builRan();
    
}
