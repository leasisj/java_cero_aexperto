package org.ijimenez.app.jardin;

import org.ijimenez.app.hogar.Persona;

public class Perro {

   protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
