/**
 * radio_main
 * Objetivo: Hacer funcionar el radio
 * 
 * @author Lourdes Saavedra
 * @author Paulo Sánchez
 * @author Andres Chivalan
 * @version 1.0 finalizado 20/01/2022
 */
import java.util.Scanner;
public class radio_main{
    public static void main(String[] args) {
        /**
         * Generacion de scanner y de objeto
         */
        Scanner sc = new Scanner(System.in);
        radio_cls Radio=new radio_cls();
        
            /**
            * Variable para opciones de menu
            */
        int op=0;
            /**
             * Ciclo while para ejectutar las opciones
            */
        while (op !=9)
        {
            System.out.println("\n Bienvenido al simulador del radio");
            System.out.println("\n Elija las opciones que considere que necesite");
            System.out.println("1.Encender el radio ");
            System.out.println("2.Cambiar de AM a FM a AM");
            System.out.println("3.Avanzar en el dial de las emisoras.");
            System.out.println("4. Guardarr una emisora en uno de los 12 botones");
            System.out.println("5. Seleccionar la emisora opuesta de un botón");
            System.out.println("6. Apagar el radio");
            System.out.println("7. Salir");
            /**
             *  Lectura de opcion ingresada 
           */
            op=sc.nextInt();
        }
        switch (op)
        {
            case 1:
            Radio.isOn();
            System.out.println("Acaba de encender el radio");
            break;
            case 2:

            break;
            case 3:

            break;
            case 4:

            break;
            case 5:

            break;
            case 6:
            Radio.turnOnOff();
            System.out.println("Se ha apagado el radio");
            break;
            case 7:
            System.out.println("Gracias por utilizarnos el Radio Algoritmos");
            break;

        }
        
        sc.close(); 

    }
   
}
