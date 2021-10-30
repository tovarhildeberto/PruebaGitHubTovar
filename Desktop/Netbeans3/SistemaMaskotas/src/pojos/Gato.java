
package pojos;

import javax.swing.JOptionPane;

public class Gato extends Animal{
    String comida;

    public Gato() {
    }
    public Gato(String comida, int id, String nombre) {
        super(id, nombre);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public void impDatosGato(){//inicia
        JOptionPane.showMessageDialog(null,"Datos de +Kotas Gatos\n\n"
                                           +"\nID "+getId()
                                           +"\nNombre "+getNombre()
                                           +"\nComida "+getComida()
                                           );
    }//termina
    
    
    
    
}
