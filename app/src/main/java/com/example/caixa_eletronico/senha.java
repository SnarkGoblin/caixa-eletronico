package com.example.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class senha extends AppCompatActivity {

    private EditText senha;
    private Button botaoConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        //Esconder a barra de ação
        getSupportActionBar().hide();

        senha = findViewById(R.id.edit_senha);
        botaoConfirmar = findViewById(R.id.bt_confirmar);

        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int senhaCadastrada = 192036;
                int senhaAtual = 0;

                //Senha atual convertida para números inteiros
                senhaAtual = Integer.parseInt(senha.getText().toString());


                if(senhaAtual == senhaCadastrada){

                    irParaActivityPrincipal();

                }else {

                    //Exibir mensagem "Senha Incorreta" para o usuário por um tempo curto
                    Toast.makeText(senha.this, "Senha Incorreta", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    //método intent que permite ir para activity principal de saque(MainActivity)
    private void irParaActivityPrincipal(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}