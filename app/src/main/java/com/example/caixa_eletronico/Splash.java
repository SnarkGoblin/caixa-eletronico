package com.example.caixa_eletronico;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //Esconder a barra de ação
        getSupportActionBar().hide();

        //método definir um delay de 3 segundos para mudar para a tela senha, ir para outra activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                irParaActivitySenha();

            }
        } ,3000); //3 segundos

    }

    //método intent que permite ir para a activity de senha
    private void irParaActivitySenha(){

        Intent intent = new Intent(Splash.this,senha.class);
        startActivity(intent);
        finish();
    }
}