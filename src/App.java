import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        //1- EJERCICIO CONDICIONALES JAVA
        System.out.println("¿Cuántos años tienes?");
        int edad = Integer.parseInt(teclado.nextLine());
        if ((edad>0)&&(edad<6)){
            System.out.println("Estás todavía en la guardería.");
        } else if((edad>=6)&&(edad<12)){
            System.out.println("Estás en primaria.");
        } else if((edad>=12)&&(edad<16)){
            System.out.println("Estás en la ESO.");
        } else if((edad>=16)&&(edad<18)){
            System.out.println("Estás en Bachillerato.");
        } else if((edad>=18)&&(edad<25)){
            System.out.println("Estás en la universidad.");
        } else if((edad>=25)&&(edad<69)){
            System.out.println("Estás trabajando.");
        } else if((edad>=69)&&(edad<=120)){
            System.out.println("Deberías estar jubilado.");
        } else{
            System.out.println("Edad no válida.");
        }

        //2- BUCLE EN JAVA:
        for(int i = 20; i>=10; i--){
            System.out.println("Cuadrado de " + i + ": " + (i*i));
        }

        //3- MEDIA EDADES DE TUS PADRES

        System.out.println("¿Cómo se llama tu madre?");
        String nombreMadre = teclado.nextLine();
        System.out.println("¿Y cuántos años tiene tu madre?");
        int edadMadre = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cómo se llama tu padre?");
        String nombrePadre = teclado.nextLine();
        System.out.println("¿Y cuántos años tiene tu padre?");
        int edadPadre = Integer.parseInt(teclado.nextLine());
        float media = (edadMadre + edadPadre)/2;

        System.out.println("Tu madre se llama " + nombreMadre + " y tiene " + edadMadre + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre + " años, y la media de sus edades es " + media);
        teclado.close();

    }


}
