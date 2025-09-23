package controller;

import models.Jogador;
import java.util.ArrayList;

public class JogadorController {
    public byte rodada_atual = 1;

    public static int sum(ArrayList<Integer> lista) {
        int resultado = 0;
        
        for (int n : lista){
            resultado += n;
        }

        return resultado;
    }

    public void decidirCaminhoPatente(Jogador jogador){
        ArrayList<Integer> ultimos_pontos = jogador.getUltimosPontos();
        
        if (jogador.patente.podeSubir() & sum(ultimos_pontos) >= 60){
            
            jogador.patente.getProxima();
        } else if (jogador.patente.podeDescer() & sum(ultimos_pontos) < 21){
            
            jogador.patente.getAnterior();
        }

        if (this.rodada_atual == 10){
            jogador.limpar();
            
            this.rodada_atual = 1;
            return;
        }
        
        this.rodada_atual += 1;
        
    }

    public Jogador decidirPontuacao(Jogador jogador, String status) {
        switch (status) {
            case "V":
                jogador.vitoria();
                break;
        
            case "E":
                jogador.empate();    
                break;
                
            case "D":
                jogador.derrota();
                break;

            default:
                break;
        }
        
        return jogador;
    }

    public JogadorController(){}
}
