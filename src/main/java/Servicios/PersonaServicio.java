package Servicios;

import Objeto.Persona;

public class PersonaServicio extends BaseDatosServicio<Persona> {
    private static PersonaServicio instancia;

    private PersonaServicio() {
        super(Persona.class);
    }

    public static PersonaServicio getInstancia() {
        if (instancia == null) {
            instancia = new PersonaServicio();
        }
        return instancia;
    }
}