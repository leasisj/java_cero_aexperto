import java.util.Date;

public class EjemploAitomovilStatic {
    public static void main(String[] args) {

        //Automivil automivil = new Automivil("chebrolet", "Aveo", Automivil.COLOR_NARANJA, 2.2, 20);
        //Automivil automivil1 = new Automivil("Hiunday", "i10", Automivil.COLOR_AMARILLO, 1.2, 40);
        //Automivil miraje = new Automivil("Miraje", "fg", Automivil.COLOR_AZUL, 3.5, 20);
        //Automivil miraje2 = new Automivil("Miraje", "fg", Automivil.COLOR_GRIS, 3.5, 20);

        Automivil automivil = new Automivil("chebrolet", "Aveo", Color.AMARILLO, 2.2, 20);
        Automivil automivil1 = new Automivil("Hiunday", "i10", Color.NARANJA, 1.2, 40);
        Automivil miraje = new Automivil("Miraje", "fg", Color.AZUL, 3.5, 20);
        Automivil miraje2 = new Automivil("Miraje", "fg", Color.GRIS, 3.5, 20);

        //Automivil.colorPatente = "verde";
        Automivil.setColorPatente(Color.AZUL);
        //miraje.setColor(Automivil.COLOR_AMARILLO);
        miraje.setColor(Color.AMARILLO);
        //miraje2.colorPatente = "azul";
        //Automivil.setColorPatente(Automivil.COLOR_AZUL);
        //-------------------------------------
        Automivil.setColorPatente(Color.AZUL);
        //--------------------------------------

        automivil1.setTipo(TipoAutomovil.COUPE);
        automivil.setTipo(TipoAutomovil.HATCHBACK);
        miraje.setTipo(TipoAutomovil.SEDAN);
        miraje2.setTipo(TipoAutomovil.STATION_WAGO);
        //-------------------------------------
        Date fecha = new Date();
        Automivil auto = new Automivil();
        auto.setFabricante("HP");
        auto.setModelo("gf");
        System.out.println("Son iguales: " + (miraje == miraje2));
        System.out.println("Son iguales: " + (miraje.equals(miraje2)));

        //----------------
        System.out.println("Los carros son iguales? " + auto.equals(miraje2));
        System.out.println("Los objetos son iguales? " + auto.equals(auto));
        //----------------
        System.out.println(auto);
        System.out.println(auto.toString());
        //----------------
        System.out.println(automivil.verDetalle());
        System.out.println("----------------------");
        System.out.println(automivil1.verDetalle());
        System.out.println("----------------------");
        System.out.println(miraje.verDetalle());
        System.out.println("-----------------------");
        System.out.println(miraje2.verDetalle());
        System.out.println("-----------------------");
        System.out.println("Automivil.getColorPatente() = " + Automivil.getColorPatente());
        System.out.println("-----------------------");
        //para poder llamar a un metodo estatico se tiene que hacer atraves de la clase y no del objeto
        Automivil.setCapacidadTanquestatic(45);//se tuvieron que agregar lo get y set de este atributo
        System.out.println("Automivil.calcularConsumoEstatico(300) = " + Automivil.calcularConsumoEstatico(300,60));
        //-------------------------------------
        //Automivil.VELOCIDAD_MAX_CARRETERA = 200;// NO SE PUEDE MODIFICAR UNA CLAE FINAL
        System.out.println("-------------------------------");
        System.out.println("Automivil.VELOCIDAD_MAX_CARRETERA = " + Automivil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automivil.VELOCIDAD_MAX_CIUDAD = " + Automivil.VELOCIDAD_MAX_CIUDAD);
        System.out.println("--------------------------------------");
        TipoAutomovil tipoAutomovil = automivil.getTipo();
        System.out.println("tipoAutomovil.getNombre() = " + tipoAutomovil.getNombre());
        System.out.println("tipo desc. subaru: "+ tipoAutomovil.getDescripcion());
    }
}
