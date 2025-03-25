package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] historicoDescontos = new double[10];
        int contadorPosicao = 0;
        while (true) {
            System.out.println("=== CALCULADORA DE DESCONTOS ===");
            System.out.println("1. Calcular desconto");
            System.out.println("2. Ver histórico");
            System.out.println("3. Ver estatísticas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");                       
            int opcaoinicial = scanner.nextInt();
            System.out.println("");
            if (opcaoinicial == 4) {
                break;
            }
            switch (opcaoinicial) {
                case 1:
                    System.out.println("[NOVA COMPRA]");
                    System.out.print("Valor da compra: R$");
                    double valordacompra = scanner.nextDouble();                   
                    int tipocliente = 0;
                    double desconto = 0;
                    while (tipocliente != 1 && tipocliente != 2) {
                        System.out.print("Cliente Regular(1) Ou Cliente Vip(2)? ");                        
                        tipocliente = scanner.nextInt();
                        System.out.println("\n[RESULTADO]");
                        System.out.println("Valor original: " + String.format("%.2f", valordacompra));

                        switch (tipocliente) {
                            case 1:
                                desconto = valordacompra * 0.05;
                                System.out.println("Desconto(5%): R$" + String.format("%.2f", desconto));
                                break;
                            case 2:
                                desconto = valordacompra * 0.10;
                                System.out.println("Desconto(10%): R$" + String.format("%.2f", desconto));
                                break;
                            default:
                                System.out.println("Entrada Invalida");
                        }
                    }
                    double precofinal = valordacompra - desconto;
                    historicoDescontos[contadorPosicao] = desconto;
                    contadorPosicao++;
                    System.out.println("Valor final: R$" + String.format("%.2f", precofinal));
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("[HISTORICO]");
                    for (int i = 0; i < contadorPosicao; i++) {

                        System.out.println((i+1) + ". R$" + String.format("%.2f", historicoDescontos[i]));
                        
                    }
                    System.out.println("");
                    break;                    
                case 3:
                    double totalDesconto = 0;
                    double maiorDesconto = historicoDescontos[0];
                    double menorDesconto = historicoDescontos[0];
                    double media;
                    for (int i = 0; i < contadorPosicao; i++) {
                        totalDesconto += historicoDescontos[i];
                        if (maiorDesconto < historicoDescontos[i]) {
                            maiorDesconto = historicoDescontos[i];
                        }
                        if (menorDesconto > historicoDescontos[i]) {
                            menorDesconto = historicoDescontos[i];
                        }

                    }
                    media = totalDesconto / contadorPosicao;
                    System.out.println("[ESTATÍSTICAS]");
                    System.out.println("Total de descontos: R$" + String.format("%.2f", totalDesconto));
                    System.out.println("Maior desconto: R$" + String.format("%.2f", maiorDesconto));
                    System.out.println("Menor desconto: R$" + String.format("%.2f", menorDesconto));
                    System.out.println("Media: " + String.format("%.2f", media));
                    System.out.println("");
                    break;
                
                default: 
                    System.out.println("Entrada Invalida");  

            }
        }

    }

}
