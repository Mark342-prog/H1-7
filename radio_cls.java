/**
 * radio_cls
 * Objetivo: Modulos del radio
 * 
 * @author Lourdes Saavedra
 * @author Paulo Sánchez
 * @author Andres Chivalan
 * @version 1.0 finalizado 20/01/2022
 */
import java.util.ArrayList;
/**import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * radio_cls
 */
public class radio_cls implements Radio{
ArrayList<Double> fm = new ArrayList<Double>(12);
ArrayList<Double> am = new ArrayList<Double>(12);
boolean on = false;
boolean frequency = false; //falso es fm y am es true
Integer st_am = 530; 
double st_fm = 87.9;
Integer pos;

    @Override
    public boolean isOn() {
       return on;
        
    }

    @Override
    public void turnOnOff() {
       if (on == false) {
           on = true;
       } else {
           on = false;
       }
    }

    @Override
    public void nextStation(boolean frequency) {
        if (frequency == false) {
            st_fm =+ 0.2;
            if (st_am > 107.9) {
                st_fm = 87.9;
            }
        } else {
            st_fm =+ 10;
            if (st_am > 1610) {
                st_fm = 530;
            }
        }
        
    }

    @Override
    public void prevStation(boolean frequency) {
        if (frequency == false) {
            st_fm =- 0.2;
            if (st_am < 87.9) {
                st_fm = 107.9;
            }
        } else {
            st_fm =- 10;
            if (st_am < 530) {
                st_fm = 1610;
            }
        }
        
    }

    @Override
    public double getStation() {
        if (frequency = false) {
            System.out.println("Usted esta escuchando actualmente: FM " + st_fm);
            return st_fm;
        } else {
            System.out.println("Usted esta escuchando actualmente: AM " + st_am);
            return st_am;
        }
    }

    @Override
    public void saveStation(int position, double station) {
        try{
     if (frequency = false) {
         fm.set(position, station);
         System.out.println("Se ha agregado la estación " + station + " a su lista en FM  en el puesto" + position);
        }
      else {
         am.set(position, station);
         System.out.println("Se ha agregado la estación " + st_am + " a su lista en AM en el puesto" + position);
         }
     }
        catch (Exception e) {
            System.out.println("Ya hay una estación en ese posición, no se pueden aguardar más");
     }
        
    }
    

    @Override
    public double getSavedStation(int position) {
        try {
            
     if(frequency = false){
         fm.get(position);
         System.out.println("La estación guardada en el botón "+ position + " es "+ fm.get(position));
         return fm.get(position);
     }else{
        am.get(position);
        System.out.println("La estación guardada en el botón "+ position + " es " + am.get(position));
        return am.get(position);
     }   
    } catch (Exception e) {
        System.out.println("Nunguna estación ha sido aguardada en este botón ");
        return position;
    }
    }

    @Override
    public boolean getFrequency() {
        return frequency;
    }

    @Override
    public void switchAMFM() {
        if (frequency == false) {
           frequency = true;
         } else {
            frequency = false;
         }
     }

}