package controller;
import models.Jogador;
import models.Patente;
import java.util.ArrayList;

public class JogadorController {
    private int rodada_atual = 0;
    private Jogador jogador = new Jogador();
    
    public Patente getPatente(){ 
        return this.jogador.patente; 
    }
    
    public int getRodadaAtual() { 
        return this.rodada_atual; 
    }
    
    public int getPontosAtuais() { 
        return this.jogador.getPontosAtuais(); 
    }
    
    public static int sum(ArrayList<Integer> lista) {
        int resultado = 0;
        for (int n : lista){
            resultado += n;
        }
        return resultado;
    }
   
    public void decidirCaminhoPatente(){
     ArrayList<Integer> ultimos_pontos = this.jogador.getUltimosPontos();
    
        if (this.jogador.patente.podeSubir() && sum(ultimos_pontos) >= 60){
            this.jogador.patente = this.jogador.patente.subirPatente();

        } else if (this.jogador.patente.podeDescer() && sum(ultimos_pontos) < 21){
            
            this.jogador.patente = this.jogador.patente.descerPatente();
        }

        this.jogador.limpar();
        
        this.rodada_atual = 1;
    }
    
    
    public void decidirPontuacao(String status) {
        this.rodada_atual += 1;

        switch (String.valueOf(status.toCharArray()[0]).toUpperCase()) {
            
            // Pega independentemente a primeira letra que o usuario digitar.
            case "V" -> {
                this.jogador.vitoria();
                break;

            }

            case "E" -> {
                this.jogador.empate();
                break;

            }

            case "D" -> {
                this.jogador.derrota();
                break;

            }

            default -> {
                break;

            }
        }
    }

    public JogadorController(){}
}