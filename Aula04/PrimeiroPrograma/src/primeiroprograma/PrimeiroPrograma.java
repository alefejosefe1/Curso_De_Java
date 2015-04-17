package primeiroprograma;

public class PrimeiroPrograma {
    
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("    Programa Info    ");
        System.out.println("=====================");
        System.out.println(System.getProperties());
        System.out.print("O seu sistema esta no idioma: ");
        System.out.println(System.getProperty("user.language"));
        System.out.print("O seu sistema operacional e: "); 
        System.out.println(System.getProperty("os.name"));
        System.out.print("A sua arquitetura e de: ");
        System.out.println(System.getProperty("os.arch"));
        System.out.print("O seu nome de Usuario e: ");
        System.out.println(System.getProperty("user.name")); 
    }
    
}