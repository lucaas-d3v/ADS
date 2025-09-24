package Atividade_1.models;

import java.util.ArrayList;

public class Jogador {

    public Patente patente = Patente.FERRO;
    private int pontos_atuais = 0;
    private ArrayList<Integer> ultimos_pontos = new ArrayList<>();

    public ArrayList<Integer> getUltimosPontos(){ return this.ultimos_pontos; }
    public int getPontosAtuais(){ return this.pontos_atuais; }    

    private void setPontosAtuais(int pontos){ this.pontos_atuais += pontos; }

    public void vitoria(){
        int ponto = 10;
        
        this.ultimos_pontos.add(ponto);
        setPontosAtuais(ponto);
    }
    
    public void empate(){
        int ponto = 5;

        this.ultimos_pontos.add(ponto);
        setPontosAtuais(ponto);

    }
    
    public void derrota(){
        int ponto = -2;
        
        this.ultimos_pontos.add(ponto);
        setPontosAtuais(ponto);
    }
 
    public void limpar(){
        this.ultimos_pontos.clear();

    }

    public Jogador(){}
}
