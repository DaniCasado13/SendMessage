package com.example.sendmessage.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.sendmessage.R;
import com.example.sendmessage.databinding.ActivitySendMessageBinding;
import com.example.sendmessage.databinding.ActivityViewMessageBinding;
import com.example.sendmessage.model.Message;

import java.io.Serializable;

public class ViewMessageActivity extends AppCompatActivity {
    private ActivityViewMessageBinding binding;
    private static final String TAG ="SendMessageProject";
    private Serializable bundle;

    // region ciclo de vida
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1. recoger el intent que nos envia la activity sendmessage
        Intent intent =getIntent();
        //2. recoger el contenido del intent con getExtras();
        //3. asignar los valores de los componente
        //ejemplo con string
        //Bundle bundle = intent.getExtras();
       //binding.etcontenUser.setText(bundle.getString("user"));
       //binding.etcontentmessage.setText(bundle.getString("message"));


        //ejemplo con objetos de clase
        Message msg = (Message) intent.getSerializableExtra("message");
       binding.etcontenUser.setText(msg.getUser());
       binding.etcontentmessage.setText(msg.getMessage());
        Log.i(TAG,"Metodo onCreate()");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Metodo onDestroy()");
    }



    @Override
    protected void onStart() {
        super.onStart();
        //TODO Implementar metodo de inicio
        Log.i(TAG,"Metodo onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Metodo onStop()");
        //TODO implementar metodo de fin
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Metodo onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Metodo onPause()");
    }
    // endregion
}