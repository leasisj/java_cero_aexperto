package org.ijimenez.pooclasesabstractas.form.elementos.select;

public class Opcion {
    private String valor;
    private String nombe;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombe) {
        this.valor = valor;
        this.nombe = nombe;
    }
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Opcion setSelected(){
        this.selected = true;
        return this;
    }
}
