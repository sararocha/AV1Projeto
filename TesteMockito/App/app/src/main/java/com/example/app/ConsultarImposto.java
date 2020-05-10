package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ConsultarImposto extends AppCompatActivity {

    private AlertDialog.Builder dialog;
    private ListView lista;
    private String[] listaEstados = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
            "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
            "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco",
            "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
            "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
    private double[] percentual = {0.12, 0.12, 0.12, 0.12, 0.12, 0.18, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12,
            0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12, 0.12};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_imposto);

        lista = findViewById(R.id.listaEstados);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaEstados
        );

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog = new AlertDialog.Builder(ConsultarImposto.this);

                String mensagem = "";
                mensagem += "A alíquota do ICMS em relação ao Ceará é, em decimal: "+percentual[position];

                dialog.setTitle("Alíquota do ICMS referente ao estado "+listaEstados[position]);
                dialog.setMessage(mensagem);

                dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                //Ícone
                dialog.setIcon(android.R.drawable.ic_dialog_info);
                dialog.setCancelable(false);

                dialog.create();
                dialog.show();

            }
        });


    }
}
