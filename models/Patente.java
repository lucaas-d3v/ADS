package models;

public enum Patente {
    FERRO(0),
    PRATA(1),
    OURO(2),
    DIAMANTE(3);

    private final int nivel;

    Patente(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
    public Patente getProxima() {
        Patente[] patentes = Patente.values();
        if (this.ordinal() < patentes.length - 1) {
        return patentes[this.ordinal() + 1];
        }
        return this;
    }

    public Patente getAnterior() {
        Patente[] patentes = Patente.values();
        if (this.ordinal() > 0) {
            return patentes[this.ordinal() - 1];
        }
        return this;
    }


    public boolean podeSubir() {
        return this.ordinal() < Patente.values().length - 1;
    }

    public boolean podeDescer() {
        return this.ordinal() != 0;
    }
}