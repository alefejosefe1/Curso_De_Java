package idiomasistema;

public class IdiomaSistema {

    public static void main(String[] args) {
        System.getProperties(); 
        System.out.print("O seu sistema está em ");
        System.out.println(System.getProperty("user.language")); 
    }
    
}
