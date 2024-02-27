import java.util.Date;

public class EjemploAitomovil {
    public static void main(String[] args) {

        //Automivil automivil = new Automivil("chebrolet","Aveo","Naranja", 2.2,20 );
        //Automivil automivil1 = new Automivil("Hiunday", "i10", "morado", 1.2, 40);
        //Automivil miraje = new Automivil("Miraje", "fg", "Asul oscuro", 3.5, 20);
        //Automivil miraje2 = new Automivil("Miraje", "fg", "Asul oscuro", 3.5, 20);

        Automivil automivil = new Automivil("chebrolet","Aveo",Color.NARANJA, 2.2,20 );
        Automivil automivil1 = new Automivil("Hiunday", "i10", Color.ROJO, 1.2, 40);
        Automivil miraje = new Automivil("Miraje", "fg", Color.BLANCO, 3.5, 20);
        Automivil miraje2 = new Automivil("Miraje", "fg", Color.GRIS, 3.5, 20);
        Date fecha = new Date();
        Automivil auto = new Automivil();
        auto.setFabricante("HP");
        auto.setModelo("gf");
        System.out.println("Son iguales: "+ (miraje == miraje2));
        System.out.println("Son iguales: "+ (miraje.equals(miraje2)));

        //----------------
        System.out.println("Los carros son iguales? "+auto.equals(miraje2));
        System.out.println("Los objetos son iguales? "+ auto.equals(auto));
        //----------------
        System.out.println(auto);
        System.out.println(auto.toString());
        //----------------
        automivil.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil.verDetalle());
        System.out.println("----------------------");
        automivil1.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil1.verDetalle());
        System.out.println("----------------------");
        miraje.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(miraje.verDetalle());

        System.out.println(automivil.acelerando(3000));
        System.out.println(automivil.frenar());

        System.out.println("..................");
        System.out.println(automivil.acelerarFrenar(200));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro "+ automivil1.calcularConsumo(300, .6f));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro "+ automivil1.calcularConsumo(300,60));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro "+ miraje.calcularConsumo(300,60));

    }
}
