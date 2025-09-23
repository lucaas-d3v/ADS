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
    
    // Retorna a próxima patente (se possível)
    public Patente subirPatente() {
        Patente[] patentes = Patente.values();
        if (this.ordinal() < patentes.length - 1) {
            return patentes[this.ordinal() + 1];
        }
        return this; // Se já está no máximo, retorna a mesma
    }
    
    // Retorna a patente anterior (se possível)
    public Patente descerPatente() {
        Patente[] patentes = Patente.values();
        if (this.ordinal() > 0) {
            return patentes[this.ordinal() - 1];
        }
        return this; // Se já está no mínimo, retorna a mesma
    }
    
    public boolean podeSubir() {
        return this.ordinal() < Patente.values().length - 1;
    }
    
    public boolean podeDescer() {
        return this.ordinal() != 0;
    }
    
}