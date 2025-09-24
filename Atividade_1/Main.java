package Atividade_1;

import java.util.Scanner;

import Atividade_1.controller.JogadorController;
import Atividade_1.utils.Confimador;

public class Main {
    JogadorController jogador = new JogadorController();
    Confimador confirmador = new Confimador();

    public void menu() {
            String logo = """
            ███╗   ██╗ █████╗ ███████╗███████╗ █████╗ ██╗   ██╗
            ████╗  ██║██╔══██╗██╔════╝██╔════╝██╔══██╗██║   ██║
            ██╔██╗ ██║███████║███████╗███████╗███████║██║   ██║
            ██║╚██╗██║██╔══██║╚════██║╚════██║██╔══██║██║   ██║
            ██║ ╚████║██║  ██║███████║███████║██║  ██║╚██████╔╝
            ╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝ ╚═════╝ 
                                                                  
            ███████╗████████╗██████╗ ██╗██╗  ██╗███████╗
            ██╔════╝╚══██╔══╝██╔══██╗██║██║ ██╔╝██╔════╝
            ███████╗   ██║   ██████╔╝██║█████╔╝ █████╗  
            ╚════██║   ██║   ██╔══██╗██║██╔═██╗ ██╔══╝  
            ███████║   ██║   ██║  ██║██║██║  ██╗███████╗
            ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚══════╝
            """;
    
            System.out.println(logo);
            System.out.println("Patente: " + this.jogador.getPatente());
            System.out.println("Pontos: " + this.jogador.getPontosAtuais());
        
        }

    public void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String status;
        
        menu();

        while (true) {
            
            if (this.jogador.getRodadaAtual() == 10){    
                this.jogador.decidirCaminhoPatente();
                menu();
                
                System.out.print("Deseja continuar? (s/n):");
                String continuar = leitor.nextLine();

                if (!confirmador.foiConfirmado(continuar)){
                    break;
                }

            }
            
            try{
                System.out.print("Informe o status da rodada " + this.jogador.getRodadaAtual() + ", (V – Vitória, E – Empate, D - Derrota, Q - Sair ): ");
                status = leitor.nextLine();
                this.jogador.decidirPontuacao(status);

                if (status.equals("q")){
                    break;
                }

            } catch (Exception e) {
                System.out.println("Opção inválida!");
            
                continue;
            }

        } 
        
        leitor.close();
    }
}
