public class App {
    public static void main(String[] args) throws Exception {
       Persona personaNombre = new Persona();
       personaNombre.setNombre("severo");
       String nombre = personaNombre.getNombre();
       System.out.println(nombre);

       Persona personaEdad = new Persona();
       personaEdad.setEdad(20);
       int edad = personaEdad.getEdad();
       System.out.println(edad);

       Persona personaTelefono = new Persona();
       personaTelefono.setTelefono(1313131313);
       int telefono = personaTelefono.getEdad();
       System.out.println(telefono);
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

}

//Para practicar la encapsulación:
//- Crear clase Persona.
//- Crear variables las privadas edad, nombre y telefono de la clase Persona.
//- Crear gets y sets de cada propiedad.
//- Crear un objeto persona en el main.
//- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y 
//telefono, por último muéstralas por consola.