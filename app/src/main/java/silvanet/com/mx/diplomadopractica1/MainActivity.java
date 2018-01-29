package silvanet.com.mx.diplomadopractica1;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity  {
    private EditText editNombre=null;
    private EditText editApellidos=null;
    private EditText editEdad=null;
    private RadioGroup generoRadioGroup=null;
    private EditText editDireccion=null;
    private EditText editEstado=null;
    private EditText editMunicipio=null;
    private EditText editCorreo_e=null;
    private EditText editTelefono=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre=(EditText)findViewById(R.id.editNombre);
        editApellidos=(EditText)findViewById(R.id.editApellidos);
        editEdad=(EditText)findViewById(R.id.editEdad);
        generoRadioGroup = (RadioGroup) findViewById(R.id.generoRadioGroup);
        editDireccion=(EditText)findViewById(R.id.editDireccion);
        editEstado=(EditText)findViewById(R.id.editEstado);
        editMunicipio=(EditText) findViewById(R.id.editMunicipio);
        editCorreo_e=(EditText)findViewById(R.id.editCorreo_e);
        editTelefono=(EditText)findViewById(R.id.editTelefono);
    }

    private String getNombre() {
        String nombre = editNombre.getText().toString();
        if (nombre == null || nombre.isEmpty() || nombre.equals("")) {

        } else {

        }
        return nombre;
    }



    private String getDireccion() {
        String direccion = editDireccion.getText().toString();
        return direccion;
    }
}
