package org.ijimenez.app.jardin;

import org.ijimenez.app.hogar.ColorPelo;
import org.ijimenez.app.hogar.Persona;
import static org.ijimenez.app.hogar.ColorPelo.*;
import static org.ijimenez.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Isael");
        p.setApellido("apellido");
        p.setColorPelo(CAFE);
        p.setColorPelo(NEGRO);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: "+p.getApellido());
        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Labrador";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;
    }
}
