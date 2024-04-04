
import java.util.Date;

public class EjemploAitomovilRelacionesObjetos {
    public static void main(String[] args) {
        Persona conductorAutomovil = new Persona("Susan", "Mundo");
        AutomivilTwo automivil = new AutomivilTwo("chebrolet","Aveo",Color.NARANJA, new Motor(2.0, TipoMotor.DICEL));

        automivil.setConductor(conductorAutomovil);
        //automivil.setRuedas(ruedaSub);
        Rueda[] ruedaSub = new Rueda[5];
        for (int i =0; i<= ruedaSub.length-1; i++){
            //ruedaSub[i] = new Rueda("Yokohama", 16,7.5);
            automivil.addReda(new Rueda("Yokohama", 16,7.5));
        }
        Rueda[] ruedaMaz = {
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
        };

        Persona conductorAutomovil1 = new Persona("Isael", "Jimenez");
        AutomivilTwo automivil1 = new AutomivilTwo("Hiunday", "i10", Color.ROJO, new Motor(2.0, TipoMotor.DICEL),new Estanque());
        automivil1.setConductor(conductorAutomovil1);
        automivil1.setRuedas(ruedaMaz);

        Rueda[] ruedaMaz2 = {
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
        };

        Persona conductorAutomovil2 = new Persona("El k", " lobo");
        AutomivilTwo miraje = new AutomivilTwo("Miraje", "fg", Color.BLANCO, new Motor(2.0, TipoMotor.DICEL),new Estanque(25));
        miraje.setConductor(conductorAutomovil2);
        miraje.setRuedas(ruedaMaz2);
        miraje.setTipo(TipoAutomovil.CONVERTIBLE);

        /*Rueda[] ruedaMaz3 = {
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
                new Rueda("Michelin", 18,10.5),
        };*/

        Rueda[] ruedaMaz3 = new Rueda[5];

        for (int i =0; i<= ruedaMaz3.length; i++){
            new Rueda("Michelin", 18,10.5);
        }

        Persona conductorAutomovil3 = new Persona("Ale", "S");
        AutomivilTwo miraje2 = new AutomivilTwo("Miraje", "fg", Color.GRIS, new Motor(2.0, TipoMotor.DICEL),new Estanque(12));
        miraje2.setConductor(conductorAutomovil3);
        //miraje2.setRuedas(ruedaMaz3);

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
        //automivil.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil.verDetalle());
        System.out.println("----------------------");
        //automivil1.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil1.verDetalle());
        System.out.println("Consumo "+automivil.calcularConsumo(300,70));
        System.out.println("----------------------");
        System.out.println(miraje.verDetalle());
        System.out.println("--------------------------------------");

        /*System.out.println("Conductor");
        System.out.println("Mombre del conductor = " + automivil.getConductor());
        System.out.println("Ruedas de auto uno");
        for (Rueda r: automivil.getRuedas()){
            System.out.println(r.getFabricante()+" , aro: "+ r.getAro()+ ", ancho: "+r.getAncho());
        }
        System.out.println("--------------------------------------");
         */

        System.out.println("*********************************************************************");
        Persona conductorSubaru = new Persona("Alfa", "Omega");
        Rueda[] ruedas = new Rueda[5];
        for (int i = 0; i< ruedas.length; i++){
            ruedas[i] = new Rueda("Michelin", 15, 25.5);
        }
        AutomivilTwo auto1 = new AutomivilTwo("Nisan", "2018", Color.NARANJA, new Motor(2.2, TipoMotor.DICEL ), new Estanque(), conductorSubaru , ruedas);
        System.out.println("fabricante ="+ auto1.getFabricante());
        System.out.println(auto1.verDetalle());

    }
}
