import java.util.Date;

public class EjemploAitomovilEnum {
    public static void main(String[] args) {

        Automivil.setCapacidadTanquestatic(45);
        Automivil subaru = new Automivil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automivil automivil = new Automivil("chebrolet", "Aveo", Color.AMARILLO, 2.2, 20);
        automivil.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println("subaru.getFabricante() = " + subaru.getFabricante());

        TipoAutomovil tipoAutomovil = automivil.getTipo();
        System.out.println("tipoAutomovil.getNombre() = " + tipoAutomovil.getNombre());
        System.out.println("tipo desc. subaru: "+ tipoAutomovil.getDescripcion());


        /*switch (tipoAutomovil){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puesrtas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de sod puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de tranporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un atomovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGO:
                System.out.println("Es un atomovil mas grande con maleta grande");
                break;

        }*/

        switch (tipoAutomovil){
            case CONVERTIBLE->
                System.out.println("El automovil es deportivo y descapotable de dos puesrtas");
            case COUPE->
                System.out.println("Es un automovil pequeño de sod puertas y tipicamente deportivo");
            case FURGON->
                System.out.println("Es un automovil utilitario de tranporte, de empresas");
            case HATCHBACK->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP->
                System.out.println("Es un atomovil de doble cabina o camioneta");
            case SEDAN->
                System.out.println("Es un automovil mediano");
            case STATION_WAGO->
                System.out.println("Es un atomovil mas grande con maleta grande");
        }
        System.out.println("-------------------------------------");
        TipoAutomovil[] tipoAutomovils = TipoAutomovil.values();
        for (TipoAutomovil tipo: tipoAutomovils){
            System.out.print(tipo+ "=>" +tipo.name()+ ","+
                    tipo.getNombre()+","+
                    tipo.getDescripcion()+","+
                    tipo.getNumeroPuerta()
                    );
            System.out.println();
        }
    }
}
