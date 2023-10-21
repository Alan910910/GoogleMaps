package proyecto.vero.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Crear Objeto sub proceso
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(
                        //Se movera al activity principal
                        getApplicationContext(),
                        BuscarDireccion.class
                );
                //se cargara
                startActivity(intent);
                finish();
            }
        },3000);
    }

}
