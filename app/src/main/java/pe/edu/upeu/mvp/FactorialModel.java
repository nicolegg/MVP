package pe.edu.upeu.mvp;

import android.app.Notification;
import android.nfc.Tag;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.widget.Toast;

import java.io.Console;

public class FactorialModel implements  Main.Model{
    private Main.Presentador presentador;

    public FactorialModel (Main.Presentador presentador){
        this.presentador = presentador;
    }
    @Override
    public void caluclarFactorial(String n) {
        int fac = 1;
        if(!n.equals((""))){
            //calculo del factorial
            //int x = Integer.parseInt(n);
            int x = Integer.valueOf(n);
            for(int i=1;i<=x;i++){
                fac = fac*i;
            }
            presentador.mostrarResultado(String.valueOf(n));
        }
        else{
            //mostrar mensaje
        }
    }

    @Override
    public void caluclarSuma(String n1, String n2) {
        int suma = 0;
        try {
            if(!n1.equals((""))&&!n2.equals((""))){
                //   int x = Integer.valueOf(n1;)
                int x = Integer.valueOf(n1);
                int y = Integer.valueOf(n2);
                suma = x+y;
                presentador.mostrarResultado(String.valueOf(suma));
            }
            else{
                //dfhj
            }
        }catch (Exception e){

            System.out.print("Error" + e);
        }


    }

    @Override
    public void caluclarResta(String n1, String n2) {
        int resta = 0;
        try {
            if(!n1.equals((""))&&!n2.equals((""))){
                //   int x = Integer.valueOf(n1;)
                int x = Integer.valueOf(n1);
                int y = Integer.valueOf(n2);
                resta = x-y;
                presentador.mostrarResultado(String.valueOf(resta));
            }
            else{
                //dfhj
            }
        }catch (Exception e){

            System.out.print("Error" + e);
        }
    }

    @Override
    public void caluclarDivision(String n1, String n2) {
        int divi = 0;
        try {
            if(!n1.equals((""))&&!n2.equals((""))){
                //   int x = Integer.valueOf(n1;)
                int x = Integer.valueOf(n1);
                int y = Integer.valueOf(n2);
                divi = x/y;
                presentador.mostrarResultado(String.valueOf(divi));
            }
            else{
                //dfhj
            }
        }catch (Exception e){

            System.out.print("Error" + e);
        }
    }

    @Override
    public void caluclarMultiplicacion(String n1, String n2) {
        int multi = 0;
        try {
            if(!n1.equals((""))&&!n2.equals((""))){
                //   int x = Integer.valueOf(n1;)
                int x = Integer.valueOf(n1);
                int y = Integer.valueOf(n2);
                multi = (x * y);
                presentador.mostrarResultado(String.valueOf(multi));
            }
            else{
                //dfhj
            }
        }catch (Exception e){

            System.out.print("Error" + e);
        }
    }
}
