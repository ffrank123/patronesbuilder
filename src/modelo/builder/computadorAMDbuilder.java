/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.builder;

/**
 *
 * @author FRANS
 */
public class computadorAMDbuilder extends computadoresBuilder{

    @Override
    public void builMarca() {
        computador.setMarca("AMD");
    }

    @Override
    public void builProcesador() {
        computador.setProcesador("B12-700c");
    }

    @Override
    public void builRan() {
        computador.setRan(16);
    }
    
}
