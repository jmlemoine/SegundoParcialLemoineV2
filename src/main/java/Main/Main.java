package Main;

import Objeto.Persona;
import Servicios.BootStrapServicio;
import Servicios.PersonaServicio;

public class Main {

    public static void crearEstudiante(){
        Persona persona1 = new Persona("Jean Lemoine", "Urb. Real", "Universitario", "19.493588", "-70.696308");
        PersonaServicio.getInstancia().crear(persona1);
    }

    public static void main(String[] args){
        try {
            BootStrapServicio.iniciarBaseDatos();
            crearEstudiante();
            Enrutamiento.crearRutas();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
