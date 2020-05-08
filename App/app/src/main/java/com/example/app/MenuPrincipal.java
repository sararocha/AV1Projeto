package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    private Button btCadastrarImposto;
    private Button btRealizarPedido;
    private Button btCadastrarVenda;
    private Button btConsultarImposto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btCadastrarImposto = findViewById(R.id.btCadastrarImposto);
        btRealizarPedido = findViewById(R.id.btRealizarPedido);
        btCadastrarVenda = findViewById(R.id.btCadastrarVenda);
        btConsultarImposto = findViewById(R.id.btConsultarImposto);

        btCadastrarImposto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, CadastroImposto.class));
            }
        });

        btRealizarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, CadastroPedido.class));
            }
        });

        btCadastrarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, CadastroVenda.class));
            }
        });

        btConsultarImposto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, ConsultarImposto.class));
            }
        });

    }
}
