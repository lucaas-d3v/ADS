import controller.JogadorController;

import java.util.Scanner;
import models.Patente;

public class Main {
    JogadorController jogador = new JogadorController();

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
            System.out.print("Informe o status da rodada " + this.jogador.getRodadaAtual() + ", (V – Vitória, E – Empate, D - Derrota): ");

            if (this.jogador.getRodadaAtual() == 10){    
                menu();
                this.jogador.decidirCaminhoPatente();

            }

            try{
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
