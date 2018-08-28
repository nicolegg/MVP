package pe.edu.upeu.mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
    }

    public interface Presentador{
        public void mostrarResultado(String r);
        public void caluclarFactorial(String n);
        public void caluclarSuma(String n1, String n2);
        public void caluclarResta(String n1, String n2);
        public void caluclarDivision(String n1, String n2);
        public void caluclarMultiplicacion(String n1, String n2);
    }

    public interface Model{
        public void caluclarFactorial(String n);
        public void caluclarSuma(String n1, String n2);
        public void caluclarResta(String n1, String n2);
        public void caluclarDivision(String n1, String n2);
        public void caluclarMultiplicacion(String n1, String n2);
    }
}
