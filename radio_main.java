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
        Scanner sc1= new Scanner(System.in);
        radio_cls Radio=new radio_cls();
        
            /**
            * Variable para opciones de menu
            */
        int op=0;
        boolean on = false;
        boolean frequency = false; //falso es fm y am es true
        Integer st_am = 530; 
        double st_fm = 87.9;
        Integer pos;
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
            Radio.isOn();
            System.out.println("Acaba de encender el radio");
            break;
            case 2:
            Radio.switchAMFM();
            System.out.println("Ha cambiado de AM a FM");
            break;
            case 3:
            System.out.println("1. Ver emisora actual");
            System.out.println("2. Avanzar la emisora");
            System.out.println("3. Regresar a la emisora");
            int op1=0;
            op1=sc1.nextInt();
                if(op1==1)
                {
                    Radio.getStation();
                }
                else if(op1==2)
                {
                    Radio.nextStation(frequency);
                }
                else if (op1==3)
                {
                    Radio.prevStation(frequency);
                }

            break;
            case 4:
            
            break;
            case 5:
            //Seleccionar de AM a FM
            break;
            case 6:
            Radio.turnOnOff();
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
