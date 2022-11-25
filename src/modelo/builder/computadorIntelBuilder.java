/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.builder;

/**
 *
 * @author FRANS
 */
public class computadorIntelBuilder extends computadoresBuilder{

    @Override
    public void builMarca() {
        computador.setMarca("intel");
    }

    @Override
    public void builProcesador() {
        computador.setProcesador("ID-0011P");
    }

    @Override
    public void builRan() {
        computador.setRan(32);
    }
    
}
