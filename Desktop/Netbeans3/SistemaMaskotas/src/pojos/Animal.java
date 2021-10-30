package pojos;

public class Animal {//inicia clase padre
    //atributos
   int id;
   String nombre;
   //constructor vacio
    public Animal() {
    }
   //constructor que pasa parametros
    public Animal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }//termina constructor
    
    //metodos get y set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}//termina clase
