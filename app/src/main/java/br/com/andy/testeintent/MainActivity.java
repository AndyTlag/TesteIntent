package br.com.andy.testeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button btnGoMain2;
 EditText edtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjeto();
        evBotao();

    }

    private void evBotao() {
        btnGoMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somar();
                Log.e("Valor: ", edtValor.getText().toString());

            }
        });
    }

    public void somar() {
        Integer[] valor = {10,20,30};
        for (Integer v : valor){
            String t = v.toString();
            Log.i("Valor: - ", t);
            Log.e("Valor: - ", v.toString());
        }
    }

    //btnEnviar = (Button) findViewById(R.id.btnEnviar); // Atribuição de Valor

    public void inicializarObjeto(){
        btnGoMain2 = findViewById(R.id.btnGoMain2);
        edtValor = findViewById(R.id.edtValor);
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