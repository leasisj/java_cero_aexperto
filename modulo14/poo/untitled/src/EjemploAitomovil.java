import java.util.Date;

public class EjemploAitomovil {
    public static void main(String[] args) {

        AutomivilTwo automivil = new AutomivilTwo("chebrolet", "Aveo", Color.NARANJA, new Motor(2.0, TipoMotor.DICEL));
        AutomivilTwo automivil1 = new AutomivilTwo("Hiunday", "i10", Color.ROJO, new Motor(2.0, TipoMotor.DICEL), new Estanque());
        AutomivilTwo miraje = new AutomivilTwo("Miraje", "fg", Color.BLANCO, new Motor(2.0, TipoMotor.DICEL), new Estanque(25));
        AutomivilTwo miraje2 = new AutomivilTwo("Miraje", "fg", Color.GRIS, new Motor(2.0, TipoMotor.DICEL), new Estanque(12));

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
        //automivil.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil.verDetalle());
        System.out.println("----------------------");
        //automivil1.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(automivil1.verDetalle());
        System.out.println(automivil.calcularConsumo(300, 70));
        System.out.println("----------------------");
        miraje.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(miraje.verDetalle());

        System.out.println(automivil.acelerando(3000));
        System.out.println(automivil.frenar());

        System.out.println("..................");
        System.out.println(automivil.acelerarFrenar(200));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro " + automivil1.calcularConsumo(300, .6f));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro " + automivil1.calcularConsumo(300, 60));

        System.out.println("---------------------------------");
        System.out.println("Kilometros por litro " + miraje.calcularConsumo(300, 60));

        System.out.println("-------------------------------");
        System.out.println("miraje.getEstanque().getCapacidad() = " + miraje.getEstanque().getCapacidad());
        System.out.println("-------------------------------------");

        /*System.out.println("Mombre del conductor = " + automivil.getConductor());
        System.out.println("Ruedas de auto uno");
        for (Rueda r: automivil.getRuedas()){
            System.out.println(r.getFabricante()+" , aro: "+ r.getAro()+ ", ancho: "+r.getAncho());
        }*/
    }
}
