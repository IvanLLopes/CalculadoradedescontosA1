
package javaapplication1;


import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        double[] historicoCompras = new double[10];
        int contadorPosicao = 0;
        while (true) {
        System.out.println("""
                           Escolha uma opcao:
                           1. Calcular desconto
                           2. Ver historico
                           3. Ver estatisticas
                           4. Sair
                           """);
        Scanner scanner = new Scanner(System.in);
        int opcaoinicial = scanner.nextInt();
            if (opcaoinicial == 4){
                break;   
                        }
                switch(opcaoinicial) {
                    case 1: System.out.println("Insira o valor da compra: ");
                            double valordacompra = scanner.nextDouble();
                            int tipocliente = 0;
                            double desconto = 0;
                            while (tipocliente != 1 && tipocliente != 2) {
                                System.out.println("Digite 1 para cliente Regular (5% de desconto) "
                                        + "ou 2 para cliente VIP (10% de desconto: ");
                                tipocliente = scanner.nextInt();

            switch (tipocliente) {
                case 1 -> {
                    desconto = 0.95;
                    System.out.println(desconto);
                }
                case 2 -> desconto = 0.90;
                default -> System.out.println("Entrada Invalida");
            }
                            }
                            double precofinal = ( desconto) * valordacompra;
                            historicoCompras[contadorPosicao] = precofinal;
                            contadorPosicao ++;
                            System.out.println("O valor final da compra é: " + precofinal);

                    case 2: System.out.println(Arrays.toString(historicoCompras));        
                  
                       
                            
                        
        }
        }

    }
    
}

