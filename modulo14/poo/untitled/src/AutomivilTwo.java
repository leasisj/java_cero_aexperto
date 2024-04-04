public class AutomivilTwo {

    //Atributos
    private int id;
    private String fabricante;
    private String modelo;
    //private String color = "verde";
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private static int capacidadTanquestatic = 30;
    //private static String colorPatente = "Naranja"; // le pertenece a la clase y no al objeto (instancia)
    private static Color colorPatente = Color.NARANJA; // le pertenece a la clase y no al objeto (instancia)
    private static int ultimoId;

    //ESTAS VARIABLES DEVEN SER PUBLICAS PARA SER OCUPADAS FUERA DE LA CLASE
    //Y PRIVADAS SI SOLO SE OCUPA EN LA CLASE, NO SE PUEDEN MODIFICAR.
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "ROJO";
    public static final String COLOR_AMARILLO = "AMARILLO";
    public static final String COLOR_NARANJA = "NARANJA";
    public static final String COLOR_AZUL = "AZUL";
    public static final String COLOR_BLANCO = "BLANCO";
    public static final String COLOR_GRIS = "GRIS";
    private TipoAutomovil tipo;

    public AutomivilTwo() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public AutomivilTwo(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public AutomivilTwo(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public AutomivilTwo(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public AutomivilTwo(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public AutomivilTwo(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCapacidadTanquestatic() {
        return capacidadTanquestatic;
    }

    public static void setCapacidadTanquestatic(int capacidadTanquestatic) {
        AutomivilTwo.capacidadTanquestatic = capacidadTanquestatic;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        AutomivilTwo.colorPatente = colorPatente;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addReda(Rueda rueda){
        this.ruedas[indiceRuedas++] = rueda;
    }

    public String verDetalle() {
        String detalle = "automovil.id= " + this.id +
                "\nautomivil.fabricante = " + this.fabricante +
                "\nautomivil.modelo = " + this.modelo;
        if (this.getTipo() != null) {//para evitar el NullPointerException
            detalle += "\nautomovil.tipo = " + this.getTipo().getNombre();
        }
        detalle += "\nautomivil.color = " + this.color +
                "\nautautomivil.colorPatente " + AutomivilTwo.colorPatente;

        if (this.motor != null) {
            detalle += "\nautomivil.cilindrada = " + this.motor.getCilindrada();
        }
        if (conductor != null) {
            detalle += "\nMombre del conductor = " + this.getConductor();
        }

        if (getRuedas() != null) {
            detalle += "\nRuedas del automovil:";
            /*for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + " , aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }*/

            for (int i = 0; i< ruedas.length; i++){
                detalle += "\n" +ruedas[i].getFabricante()+ ", Aro:" + ruedas[i].getAro()+ ", Ancho: "+ ruedas[i].getAncho();
            }
        }

        return detalle;
    }

    public String acelerando(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerando(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }


    public float calcularConsumo(int km, float porcentajeDeGasolina) {
        return km / (this.getEstanque().getCapacidad() * porcentajeDeGasolina);
    }

    //SOBRECARGA DE METODOS
    public float calcularConsumo(int km, int porcentajeDeGasolina) {
        return km / (this.getEstanque().getCapacidad() * (porcentajeDeGasolina) / 100f);
    }

    public static float calcularConsumoEstatico(int km, int porcentajeDeGasolina) {
        return km / (AutomivilTwo.capacidadTanquestatic * (porcentajeDeGasolina) / 100f);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AutomivilTwo)) {
            return false;
        }

        AutomivilTwo a = (AutomivilTwo) obj;
        if (this.fabricante == null || this.modelo == null) {
            return false;
        }
        return this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }
}
