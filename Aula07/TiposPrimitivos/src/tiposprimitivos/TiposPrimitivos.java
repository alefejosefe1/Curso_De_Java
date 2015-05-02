package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a Nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s e %.2f \n",nome ,nota);
    }
    
}
