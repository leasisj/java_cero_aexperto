package Ejercicio;

public class Principal {
    public static void main(String[] args) {
        Automovil aveo = new Automovil();
        aveo.setFabricante("Chebrolet");
        aveo.setModelo("Aveo");
        aveo.getTanque().setCapacidad(150);
        aveo.getMotor().setTipoMotor(TipoMotor.DICEL);
        aveo.setColor(Color.NARANJA);
        aveo.mostrarInfo();

        System.out.println("-------------------------------------------");
        Rueda[] ruedasChevi = new Rueda[5];
        ruedasChevi[0] = new Rueda("Pirelli", 15, 25);
        ruedasChevi[1] = new Rueda("Pirelli", 15, 25);
        ruedasChevi[2] = new Rueda("Pirelli", 15, 25);
        ruedasChevi[3] = new Rueda("Pirelli", 15, 25);
        ruedasChevi[4] = new Rueda("Pirelli", 15, 25);
        Tanque tanqueChevi = new Tanque(80);
        Motor motorchevi = new Motor(2.5, TipoMotor.MAGNA);
        Persona conductor = new Persona("Lobo", "Solitario");
        Automovil chevi = new Automovil(motorchevi, tanqueChevi,conductor,ruedasChevi);
        chevi.setColor(Color.GRIS);
        chevi.mostrarInfo();

        System.out.println("------------------------------------------");
        Motor motorHiunday = new Motor(2.2,TipoMotor.PREMIUM);
        Tanque tanquehiunday = new Tanque(50);
        Persona persona = new Persona("Coco","Ojo azul");
        Automovil hiunday = new Automovil(motorHiunday, tanquehiunday, persona,Color.BLANCO, "Hiunday","kl",null);
        hiunday.mostrarInfo();
    }
}
