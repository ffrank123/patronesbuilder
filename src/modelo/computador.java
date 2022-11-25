/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author FRANS
 */
public class computador {
    private String marca;
    private String procesador;
    private int ran;

    public computador() {
    }

    public computador(String marca, String procesador, int ran) {
        this.marca = marca;
        this.procesador = procesador;
        this.ran = ran;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRan() {
        return ran;
    }

    public void setRan(int ran) {
        this.ran = ran;
    }

    @Override
    public String toString() {
        return "computador{" + "marca=" + marca + ",\n procesador=" + procesador + ",\n ran=" + ran + '}'+"\n\n";
    }
    
    
    
}
