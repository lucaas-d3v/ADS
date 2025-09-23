import controller.JogadorController;
import models.Jogador;
import java.util.Scanner;

public class Main {
    Jogador jogador = new Jogador();
    JogadorController jogadorcontroller = new JogadorController();

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
    
            System.out.println("Dados: \n" + "    Patente: \n       " + this.jogador.patente + "\n" + "    Pontos: \n       " + this.jogador.getPontosAtuais() + "\n");

            System.out.print("\nInforme o status da rodada" + this.jogadorcontroller.rodada_atual + ", (V – Vitória, E – Empate, D - Derrota): ");
    
        }

    public void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String status;
        
        while (true) {
            menu();
            
            status = leitor.nextLine();
            this.jogador = jogadorcontroller.decidirPontuacao(jogador, status);
            
            if (status.equals("q")){
                break;
            }

        } 
        
        leitor.close();
    }
}
