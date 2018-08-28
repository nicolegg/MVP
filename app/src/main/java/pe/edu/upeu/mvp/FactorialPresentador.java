package pe.edu.upeu.mvp;

import android.view.View;

public class FactorialPresentador implements Main.Presentador{
    private Main.Model model;
    private  Main.Vista vista;
    public FactorialPresentador(Main.Vista vista){
        this.vista = vista;
        model = new FactorialModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(vista!= null){
            vista.mostrarResultado(r);
        }
    }

    @Override
    public void caluclarFactorial(String n) {
        if(vista!= null){
            model.caluclarFactorial(n);
        }
    }

    @Override
    public void caluclarSuma(String n1, String n2) {
        if (vista!=null){
            model.caluclarSuma(n1, n2);
        }
    }

    @Override
    public void caluclarResta(String n1, String n2) {
        if (vista!=null){
            model.caluclarResta(n1, n2);
        }
    }

    @Override
    public void caluclarDivision(String n1, String n2) {
        if (vista!=null){
            model.caluclarDivision(n1, n2);
        }
    }

    @Override
    public void caluclarMultiplicacion(String n1, String n2) {
        if (vista!=null){
            model.caluclarMultiplicacion(n1, n2);
        }
    }
}
