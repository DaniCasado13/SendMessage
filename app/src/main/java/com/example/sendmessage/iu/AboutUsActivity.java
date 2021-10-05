package com.example.sendmessage.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.sendmessage.R;
import com.example.sendmessage.databinding.ActivitySendMessageBinding;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutUsActivity extends AppCompatActivity {
    private static final String TAG ="SendMessageProject";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.mipmap.profile_picture)
                .setCover(R.mipmap.profile_cover)
                .setName("Daniel Casado Carvajal")
                .setSubTitle("Android Developer")
                .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .addGooglePlayStoreLink("8002078663318221363")
                .addGitHubLink("https://github.com/DaniCasado13")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        setContentView(view);
    }
    // region ciclo de vida

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG","Metodo onDestroy()");
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