package com.example.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView saldoEmConta;
    private EditText sacar;
    private Button botaoSacar;

    double saldoEmContaDinheiro = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Esconder a barra de ação
        getSupportActionBar().hide();

        saldoEmConta = findViewById(R.id.saldoEmConta);
        sacar = findViewById(R.id.dinheiroSacar);
        botaoSacar = findViewById(R.id.botaoSacar);

        iniciarComponentes(); // Iniciando o método tratado

        //Definir a mensagem do campo Saldo em conta para aparecer o valor da variável saldoEmContaDinheiro(3000.00);
        saldoEmConta.setText("Saldo em conta: " + "R$ " + saldoEmContaDinheiro);


        //Evento de clique no botão Sacar
        botaoSacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //valor a ser sacado convertido para números decimais
                Double dinheiro;
                dinheiro = Double.parseDouble(sacar.getText().toString());

                //If para determinar o valor que foi sacado e definir um novo valor para saldoEmContaDinheiro a cada saque
                if(dinheiro < 20){

                    Toast.makeText(MainActivity.this, "Saque mínimo de R$20.00.", Toast.LENGTH_SHORT).show();
                } else{

                    saldoEmContaDinheiro = saldoEmContaDinheiro - dinheiro;
                    saldoEmConta.setText("Saldo em conta: R$" + saldoEmContaDinheiro);
                    Toast.makeText(MainActivity.this, "R$" + dinheiro + "0 sacados.", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private void iniciarComponentes(){

        saldoEmConta = findViewById(R.id.saldoEmConta);
        sacar = findViewById(R.id.dinheiroSacar);
        botaoSacar = findViewById(R.id.botaoSacar);
    }
}