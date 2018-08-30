package com.ejemplo.tarea4;
// prueba GIT LF 12.52
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{


    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.ejemplo.tarea4");
        sendBroadcast(intent);
    }

}



