public class Automivil {

    //Atributos
    private int id;
    private String fabricante;
    private String modelo;
    //private String color = "verde";
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadTanque;

    private static int capacidadTanquestatic = 30;
    //private static String colorPatente = "Naranja"; // le pertenece a la clase y no al objeto (instancia)
    private static Color colorPatente = Color.NARANJA; // le pertenece a la clase y no al objeto (instancia)
    private static int ultimoId;

    //ESTAS VARIABLES DEVEN SER PUBLICAS PARA SER OCUPADAS FUERA DE LA CLASE
    //Y PRIVADAS SI SOLO SE OCUPA EN LA CLASE, NO SE PUEDEN MODIFICAR.
    public static  final  Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static  final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "ROJO";
    public static final String COLOR_AMARILLO = "AMARILLO";
    public static final String COLOR_NARANJA = "NARANJA";
    public static final String COLOR_AZUL = "AZUL";
    public static final String COLOR_BLANCO = "BLANCO";
    public  static final String COLOR_GRIS = "GRIS";
    private TipoAutomovil tipo;

    public Automivil() {
        this.id = ++ultimoId;
    }

    public Automivil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automivil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automivil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automivil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
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
        Automivil.capacidadTanquestatic = capacidadTanquestatic;
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

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automivil.colorPatente = colorPatente;
    }

    public String verDetalle() {
        return "automovil.id= " + this.id +
                "\nautomivil.fabricante = " + this.fabricante +
                "\nautomivil.modelo = " + this.modelo +
                "\nautomovil.modelo = "+ this.getTipo().getNombre()+
                "\nautomivil.color = " + this.color +
                "\nautautomivil.colorPatente " + Automivil.colorPatente +
                "\nautomivil.cilindrada = " + this.cilindrada;
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
        return km / (capacidadTanque * porcentajeDeGasolina);
    }

    //SOBRECARGA DE METODOS
    public float calcularConsumo(int km, int porcentajeDeGasolina) {
        return km / (capacidadTanque * (porcentajeDeGasolina) / 100f);
    }

    public static float calcularConsumoEstatico(int km, int porcentajeDeGasolina) {
        return km / (Automivil.capacidadTanquestatic * (porcentajeDeGasolina) / 100f);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automivil)) {
            return false;
        }

        Automivil a = (Automivil) obj;
        if (this.fabricante == null || this.modelo == null) {
            return false;
        }
        return this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
    }

    @Override
    public String toString() {
        return this.id + " : "+ fabricante + " " + modelo;
    }
}
