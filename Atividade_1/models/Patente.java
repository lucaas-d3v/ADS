package Atividade_1.models;

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
        System.out.print("Você subiu de " + this);
        
        if (this.ordinal() < patentes.length - 1) {
            Patente proxima = patentes[this.ordinal() + 1];

            System.out.println(" para " + proxima);
            return proxima;
        }
        return this; // Se já está no máximo, retorna a mesma
    }
    
    // Retorna a patente anterior (se possível)
    public Patente descerPatente() {
        Patente[] patentes = Patente.values();
        System.out.print("Você subiu de " + this);

        if (this.ordinal() > 0) {
            Patente anterior = patentes[this.ordinal() - 1];
            System.out.println(" para " + anterior);

            return anterior;
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