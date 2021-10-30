
package pojos;

import javax.swing.JOptionPane;

public class Perro extends Animal{//inicia clase hija
    //atributos
    String raza;
    int edad;
    //constructor vacio
    public Perro() {
    }
    //Constructor que pasa parametros
    public Perro(String raza, int edad, int id, String nombre) {
        super(id, nombre);
        this.raza = raza;
        this.edad = edad;
    }
    //METODOS GET Y SET
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void impDatosPerro(){//inicia
        JOptionPane.showMessageDialog(null,"Datos de +Kotas Caninos\n\n"
                                           +"\nID "+getId()
                                           +"\nNombre "+getNombre()
                                           +"\nRaza "+getRaza()
                                           +"\nEdad "+getEdad());
    }//termina
    
    
}//termina clase
