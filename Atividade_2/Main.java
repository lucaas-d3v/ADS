package Atividade_2;

import java.util.ArrayList;

import Atividade_1.utils.Confimador;
import java.util.Scanner;

public class Main {
    private Confimador confimador = new Confimador();

    String logo = """
███████╗██╗  ██╗███████╗██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
██╔════╝██║  ██║██╔════╝██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
███████╗███████║█████╗  ██████╔╝██║     ██║   ██║██║     █████╔╝ 
╚════██║██╔══██║██╔══╝  ██╔══██╗██║     ██║   ██║██║     ██╔═██╗ 
███████║██║  ██║███████╗██║  ██║███████╗╚██████╔╝╚██████╗██║  ██╗
╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝
    """;

    private ArrayList<Integer> perguntar(Scanner leitor){
        String[] perguntas = {"telefonou para a vítima? ", "esteve no local do crime? ", "mora perto da vítima?", "tinha dívidas com a vítima?", "ja trabalhou com a vítima?"};
        ArrayList<Integer> respostas = new ArrayList<>();
        String resposta;
        

        System.out.println(this.logo);
        for (String pergunta : perguntas){
            while (true){
                System.out.print(pergunta + " (s/n): ");
                
                resposta = leitor.nextLine();

                if (resposta == null){
                    System.out.println("A resposta não pode ser nula");
                    continue;
                }

                break;
            }

            if (confimador.foiConfirmado(resposta)){
                respostas.add(1);
            }
        }

        return respostas;
    } 

    private String juizVeredito(ArrayList<Integer> repostas){
        int qtd_respostas = repostas.size();
        
        switch (qtd_respostas) {
            case 2:
                return "Suspeita";
        
            case 5:
                return "Assassino";    

            default:
                return "Cúmplice";

        }
    }

    public void main(String[] args){
        Scanner leitor = new Scanner(System.in); 

        ArrayList<Integer> respostas = perguntar(leitor);
        String veredito = juizVeredito(respostas);
        

        System.out.println(this.logo);
        System.out.println("Você é: " + veredito);

        leitor.close();
    }

}
