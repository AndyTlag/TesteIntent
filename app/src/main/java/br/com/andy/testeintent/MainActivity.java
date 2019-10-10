package br.com.andy.testeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btnGoMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjeto();

    }

    //btnEnviar = (Button) findViewById(R.id.btnEnviar); // Atribuição de Valor

    public void inicializarObjeto(){
        btnGoMain2 = (Button) findViewById(R.id.btnGoMain2);
        abrirActivity();
    }

    public void abrirActivity(){
       btnGoMain2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent();
               intent.setClass(MainActivity.this, Main2Activity.class);
               startActivity(intent);
           }
       });

    }

}