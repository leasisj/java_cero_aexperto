package org.ijimenez.pooclasesabstractas.form.elementos;

import org.ijimenez.pooclasesabstractas.form.validador.LargoValidador;
import org.ijimenez.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;
import org.ijimenez.pooclasesabstractas.form.validador.validador;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;

abstract public class ElementosForm {
    protected String valor;
    protected String nombre;

    private List<validador> validadores;
    private List<String> errores;

    public ElementosForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    public ElementosForm addValidador(validador validator){
        this.validadores.add(validator);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getErrores() {
        return errores;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for (validador v: validadores){
            if (!v.esValidado(this.valor)){
                if (v instanceof IMensajeFormateable){
                    this.errores.add(((IMensajeFormateable) v).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }
    abstract public String dibujarHtml();
}
