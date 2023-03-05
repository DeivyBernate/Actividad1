package actividad1;
import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {
        int Juan, Ana, Alberto, M;
        System.out.println("Inserte la edad de Juan: ");
        Scanner edad = new Scanner(System.in);
        
        Juan=edad.nextInt();
        Alberto= (Juan/3)*2;
        Ana= (Juan*4)/3;
        M=Juan+Alberto+Ana;
        
        System.out.println("La edad de Juan es: "+Juan);
        System.out.println("La edad de Alberto es: "+Alberto);
        System.out.println("La edad de Ana es: "+Ana);
        System.out.println("La edad de la Madre es: "+M);
    }
}