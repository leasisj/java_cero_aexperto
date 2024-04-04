package Ejercicio;

public class Automovil {

    private int id;
    private static int ultimoId;
    private Motor motor = new Motor();
    Tanque tanque = new Tanque();
    private Persona conductor = new Persona();
    private Rueda[] ruedas;
    private Color color;
    private String fabricante;
    private String modelo;

    private Llantas llantas;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this.motor = motor;
        this.tanque = tanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
        this.id = ++ultimoId;
    }

    public Automovil(Motor motor, Tanque tanque, Persona conductor, Color color, String fabricante, String modelo, Llantas llantas) {
        this.motor = motor;
        this.tanque = tanque;
        this.conductor = conductor;
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
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

    public Llantas getLlantas() {
        return llantas;
    }

    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    private String verDetalleDelCarro() {
        String detalle = "ID: " + this.getId();
        if (this.getFabricante() != null) {
            detalle += "\nFabricante: " + getFabricante();
        } else {
            detalle += "\nFabricante: No tenemos detalle este atributo";
        }
        if (this.getModelo() != null) {
            detalle += "\nModelo: " + getModelo();
        } else {
            detalle += "\nFabricante: No tenemos detalle este atributo";
        }
        detalle += "\nColor del coche: " + this.color +
                "\nCapacidad de tanque: " + getTanque().getCapacidad() +
                "\nTipo de motor:  " + getMotor().getTipoMotor();

        if (this.getRuedas() != null) {
            detalle += "\n-----------------------------------------" +
                    "\nRuedas del automovil";
            /*for (Rueda r : this.getRuedas()) {
                detalle += "\n---------------------" +
                        "\nNumero de llanta: "+
                        "\nFabricante: " + r.getFabricante() + "\nRin: " + r.getRin() + "\nAncho: " + r.getAncho();
            }*/

            if (getRuedas() != null) {
                for (int i = 0; i <= ruedas.length - 1; i++) {
                    Rueda r = ruedas[i];
                    detalle += "\n---------------------" +
                            "\nNumero de llanta: " + i +
                            "\nFabricante: " + r.getFabricante() + "\nRin: " + r.getRin() + "\nAncho: " + r.getAncho();
                }
            }
        } else {
            if (this.getLlantas()!=null) {
                detalle += "\n------------------" +
                        "\nFabricante: " + this.getLlantas().getFabricante() +
                        "\nRin " + this.getLlantas().getRin() +
                        "\nAncho: " + this.getLlantas().getAncho();
            }else {
                detalle+="\nInformacion de llantas no disponible";
            }
        }
        return detalle;
    }

    public void mostrarInfo() {
        System.out.println(verDetalleDelCarro());
    }
}
