
package javaapplication1;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println(
                "Escolha uma opcao:\n" + 
                "1. Calcular desconto\n" +
                "2. Ver historico\n" +
                "3. Ver estatisticas\n" +
                "4. Sair\n");
        Scanner scanner = new Scanner(System.in);
        int opcaoinicial = scanner.nextInt();
        switch(opcaoinicial) {
            case 1: System.out.println("Insira o valor da compra: ");
                    double valordacompra = scanner.nextDouble();
                    int tipocliente = 0;
                    double desconto = 0;
                    while (tipocliente != 1 && tipocliente != 2) {
                        System.out.println("Digite 1 para cliente Regular (5% de desconto) "
                                + "ou 2 para cliente VIP (10% de desconto: ");
                        tipocliente = scanner.nextInt();
                        
                        if (tipocliente == 1) {
                            desconto = 0.95;
                            System.out.println(desconto);
                        }
                        else if (tipocliente == 2) {
                            desconto = 0.90;
                        } 
                        else { 
                            System.out.println("Entrada Invalida");
                        }
                    }
                    double precofinal = ( desconto) * valordacompra;
                    System.out.println("O valor final da compra é: " + precofinal);
                       
                            
                        
        }

    }
    
}
