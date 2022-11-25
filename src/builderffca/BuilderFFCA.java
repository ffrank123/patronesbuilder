/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderffca;



import javax.swing.JOptionPane;
import modelo.builder.TiendaComputador;
import modelo.builder.computadorAMDbuilder;
import modelo.builder.computadorIntelBuilder;

/**
 *
 * @author FRANS
 */
public class BuilderFFCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiendaComputador t=new TiendaComputador();
        t.setBuilder(new computadorAMDbuilder());
        t.construirComputador();
       
        JOptionPane.showMessageDialog(null, t.getComputador());
    t.setBuilder(new computadorIntelBuilder());
    t.construirComputador();
     JOptionPane.showMessageDialog(null, t.getComputador());
    }
    
}
