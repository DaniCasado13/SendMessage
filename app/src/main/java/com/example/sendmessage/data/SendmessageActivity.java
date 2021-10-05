package com.example.sendmessage.data;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sendmessage.R;
import com.example.sendmessage.databinding.ActivitySendMessageBinding;
import com.example.sendmessage.iu.AboutUsActivity;
import com.example.sendmessage.iu.ViewMessageActivity;
import com.example.sendmessage.model.Message;

/**
 * <h1>Proyecto:SendMessage</h1>
 * Pide al usuairo el nombre del destinatario y un mensaje a enviar
 *
 * @author: Daniel Casado
 * @Version: 1.0
 * @see android.app.Activity
 */

public class SendmessageActivity extends AppCompatActivity {

    private ActivitySendMessageBinding binding;
    private static final String TAG = "SendMessageProject";

    // region ciclo de vida
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SendMessage();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Metodo onDestroy()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        //TODO Implementar metodo de inicio
        Log.i(TAG, "Metodo onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Metodo onStop()");
        //TODO implementar metodo de fin
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Metodo onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Metodo onPause()");
    }

    // endregion
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //este metodo se ejecuta siempre que se pulsa una accion dentro del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_about) {
            showAboutUs();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

//endregion

// region metodos que interactuan con el boton

    //este metodo es el que usamos en la propiedad android:onclick
    // dentro del componente button
    public void getOnclick(View view) {
        switch (view.getId()) {
            case R.id.btnenviar:
                SendMessage();
                break;
        }
    }

    private void SendMessage() {
        binding = ActivitySendMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.btnenviar.setOnClickListener(view -> {


            //1. Crear objeto de tipo bundle donde añadimos los datos los datos
            //Bundle es un contenedor de informacion cuya informacion almacenada se guarda en
            //objeto de tipo Intent
            Bundle bundle = new Bundle();

            //1.1 ejemplo con dos variables string
            //bundle.putString("user",binding.etUser.getText().toString());
            //bundle.putString("message",binding.etmessage.getText().toString());


            //1.2 ejemplo con la clase model message
            Message msg = new Message();
            msg.setUser(binding.etUser.getText().toString());
            msg.setMessage(binding.etmessage.getText().toString());
            bundle.putSerializable("message", msg);
            //2. se crea el intent explicitamente ya que se conocen la activity origen y destino
            Intent intent = new Intent(this, ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);

        });
    }
    //este metodo inicializa el aboutUS
    private void showAboutUs() {
    Intent intent =new Intent(this, AboutUsActivity.class);
    startActivity(intent);
    }
}
//endregion