package Atividade_3;

import java.util.Scanner;

import Atividade_3.model.Produto;
import Atividade_3.utils.Verificador;

public class Main {    
    public static void main(String[] args){
        Produto produto = new Produto();
        Verificador verificador = new Verificador();
        
        Scanner leitor = new Scanner(System.in);
        String resposta;

           String logo = """
 ██╗      ██████╗      ██╗ █████╗ 
 ██║     ██╔═══██╗     ██║██╔══██╗
 ██║     ██║   ██║     ██║███████║
 ██║     ██║   ██║██   ██║██╔══██║
 ███████╗╚██████╔╝╚█████╔╝██║  ██║
 ╚══════╝ ╚═════╝  ╚════╝ ╚═╝  ╚═╝
 """;
        System.out.println(logo);

        while (true) {
            System.out.print("Digite o nome do produto (tudo em maiúsculo): ");
            resposta = leitor.nextLine();

            if (!verificador.isValidName(resposta)){
                System.out.println("Nome inválido, digite tudo em maiúsculo!");
                continue;
            } else {
                produto.setNome(resposta);
            }

            System.out.print("Digite o preço do produto (o preço precisa ser maior que 0): ");
            resposta = leitor.nextLine();

            if (!verificador.isPriceValid(Double.parseDouble(resposta))){
               
                System.out.println("Preço inválido, precisa ser maior que 0!");
                continue;
                
            } else {
                produto.setPreco(Double.parseDouble(resposta));

            }


            System.out.print("Digite a quantidade de produtos (o quantidade precisa ser maior que 0): ");
            resposta = leitor.nextLine();

            if (!verificador.isQuatityValid(Integer.parseInt(resposta))){
               
                System.out.println("Quantidade inválida, precisa ser maior que 0!");
                continue;
                
            } else {
                produto.setQuantidade(Integer.parseInt(resposta));

            }


            System.out.println("Digite o código de barras do produto (o código precisa ser ter 13 dígitos numéricos: ");
            resposta = leitor.nextLine();

            if (!verificador.isBarCode(resposta)){
               
                System.out.println("Código inválido, precisa ter 13 dígitos numéricos!");
                continue;
                
            } else {
                produto.setCodigoBarras(resposta);
            }

            break;

        }
        
        System.out.println(logo);

        produto.view();

        leitor.close();
    }
}