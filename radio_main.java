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
        radio_cls Rdcl=new radio_cls();
        
            /**
            * Variable para opciones de menu
            */
        int op=0;
            /**
             * Ciclo while para ejectutar las opciones
            */
        while (op !=7)
        {
            System.out.println("\n Bienvenido al simulador del radio");
            System.out.println("\n Elija las opciones que considere que necesite");
            System.out.println("1.Encender el radio ");
            System.out.println("2.Cambiar de AM a FM a AM");
            System.out.println("3.Avanzar o regresar en el dial de las emisoras.");
            System.out.println("4. Guardar una emisora en uno de los 12 botones");
            System.out.println("5. Seleccionar la emisora opuesta de un botón");
            System.out.println("6. Apagar el radio");
            System.out.println("7. Salir");
           
            /**
             *  Lectura de opcion ingresada 
           */
            op=sc.nextInt();
        
        switch (op)
        {
            case 1:
            Rdcl.isOn();
            System.out.println("Acaba de encender el radio");
            break;
            case 2:
            Rdcl.switchAMFM();
            System.out.println("Ha cambiado de AM a FM");
            break;
            case 3:
            System.out.println("1. Ver emisora actual");
            System.out.println("2. Avanzar la emisora");
            System.out.println("3. Regresar a la emisora");
            int op1=0;
            op1=sc.nextInt();
                if(op1==1)
                {
                    Rdcl.getStation();
                }
                else if(op1==2)
                {
                    Rdcl.nextStation(Rdcl.getFrequency());
                }
                else if (op1==3)
                {
                    Rdcl.prevStation(Rdcl.getFrequency());
                }

            break;
            case 4:
            double st = Rdcl.getStation();
            System.out.println("Seleccione el botón (1 -12) en donde aguardara la emisora");
            Integer pj = sc.nextInt();
            Integer pjr = pj - 1;
            Rdcl.saveStation(pjr, st);
            break;
            case 5:
            //Seleccionar de AM a FM
            System.out.println("Seleccione el botón (1 -12) de la emisora guardada");
            int respuesta = sc.nextInt();
            int boton = respuesta -1;
            Rdcl.getSavedStation(boton);
            break;
            case 6:
            Rdcl.turnOnOff();
            System.out.println("Se ha apagado el radio");
            break;
            case 7:
            System.out.println("Gracias por utilizarnos el Radio Algoritmos");
            break;

        }
    }
    sc.close(); 
}
}