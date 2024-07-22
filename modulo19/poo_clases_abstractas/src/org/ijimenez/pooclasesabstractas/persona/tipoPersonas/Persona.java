package org.ijimenez.pooclasesabstractas.persona.tipoPersonas;

import org.ijimenez.pooclasesabstractas.persona.Validador.validador;

import java.util.ArrayList;
import java.util.List;

abstract public class Persona {
    protected String id;
    protected int codigoPostal;
    protected String nombrePersona;

    protected String valor;

    private List<validador> validadors;
    private List<String> errores;
    public Persona() {
        this.validadors = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public Persona(String id) {
        this.id = id;
    }

    public Persona(String id, int codigoPostal, String nombrePersona) {
        this();
        this.id = id;
        this.codigoPostal = codigoPostal;
        this.nombrePersona = nombrePersona;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setErrores(List<String> errores) {
        this.errores = errores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Persona addValidador(validador validador){
        this.validadors.add(validador);
        return this;
    }

    public boolean esValidoId(){
        for (validador v : validadors){
            if (!v.esValido(this.id)){
                this.errores.add(String.format(v.getMensaje()));
            }
        }
        return this.errores.isEmpty();
    }

    public boolean esValidoNombrePersona(){
        for (validador v : validadors){
            if (!v.esValido(this.nombrePersona)){
                this.errores.add(String.format(v.getMensaje()));
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String digujarConsola();

}
