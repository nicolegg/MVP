package pe.edu.upeu.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  Main.Vista{
    private Main.Presentador presentador;
    private Button suma,restar,multi,divi;
    private EditText txtnumero, txtresultado, txtxnumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presentador = new FactorialPresentador(this);
        txtnumero = (EditText) findViewById(R.id.txtnumero);
        txtresultado = (EditText) findViewById(R.id.txtresultado);
        txtxnumero2 = (EditText) findViewById(R.id.txtnumero2);
        suma = (Button) findViewById(R.id.btnsuma);
        restar = (Button) findViewById(R.id.btnrestar);
        multi = (Button) findViewById(R.id.btnmulti);
        divi = (Button) findViewById(R.id.btndivi);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.caluclarSuma(txtnumero.getText().toString(),txtxnumero2.getText().toString());
               txtnumero.setText("");
                txtxnumero2.setText("");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.caluclarResta(txtnumero.getText().toString(),txtxnumero2.getText().toString());
                txtnumero.setText("");
                txtxnumero2.setText("");
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.caluclarDivision(txtnumero.getText().toString(),txtxnumero2.getText().toString());
                txtnumero.setText("");
                txtxnumero2.setText("");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.caluclarMultiplicacion(txtnumero.getText().toString(),txtxnumero2.getText().toString());
                txtnumero.setText("");
                txtxnumero2.setText("");

            }
        });

    }
    @Override
    public void mostrarResultado(String r) {
        txtresultado.setText(r);
        //Toast.makeText(getApplicationContext(),"Factorial :"+r,Toast.LENGTH_LONG).show();
    }
}
