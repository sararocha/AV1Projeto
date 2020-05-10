package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroVenda extends AppCompatActivity {


    private EditText editNome;
    private EditText editCPF;
    private EditText editPeso;
    private EditText editEndereco;
    private EditText editPreco;
    private EditText editImposto;
    private Button btVender;


    private TextView txtNome;
    private TextView txtCPF;
    private TextView txtPeso;
    private TextView txtEndereco;
    private TextView txtPreco;
    private TextView txtImposto;
    private TextView txtCalculo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_venda);


        editNome = findViewById(R.id.editNome);
        editCPF = findViewById(R.id.editCPF);
        editPeso = findViewById(R.id.editPeso);
        editEndereco = findViewById(R.id.editEndereco);
        editPreco = findViewById(R.id.editPreco);
        editImposto = findViewById(R.id.editImposto);
        btVender = findViewById(R.id.btVender);

        //Ocultando TextViews


        txtNome = findViewById(R.id.txtNome);
        txtNome.setVisibility(View.GONE);

        txtCPF = findViewById(R.id.txtCPF);
        txtCPF.setVisibility(View.GONE);

        txtPeso = findViewById(R.id.txtPeso);
        txtPeso.setVisibility(View.GONE);

        txtEndereco = findViewById(R.id.txtEndereco);
        txtEndereco.setVisibility(View.GONE);

        txtPreco = findViewById(R.id.txtPreco);
        txtPreco.setVisibility(View.GONE);

        txtImposto = findViewById(R.id.txtImposto);
        txtImposto.setVisibility(View.GONE);

        txtCalculo = findViewById(R.id.txtCalculo);
        txtCalculo.setVisibility(View.GONE);

        btVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exibindo os TextViews
                txtNome.setVisibility(View.VISIBLE);
                txtCPF.setVisibility(View.VISIBLE);
                txtPeso.setVisibility(View.VISIBLE);
                txtEndereco.setVisibility(View.VISIBLE);
                txtPreco.setVisibility(View.VISIBLE);
                txtImposto.setVisibility(View.VISIBLE);
                txtCalculo.setVisibility(View.VISIBLE);

                //Pegando os dados
                txtNome.setText("Nome: "+editNome.getText());
                txtCPF.setText("CPF/CNPJ: "+editCPF.getText());
                txtPeso.setText("Peso: "+editPeso.getText());
                txtEndereco.setText("Endereço: "+editEndereco.getText());
                txtPreco.setText("Preço: "+editPreco.getText());
                txtImposto.setText("Imposto: "+editImposto.getText());


            }
        });

    }

        //Método para calcular o valor final
        public static int calcularValorFinal(int n1, int n2) {
         return n1 + (n2 * n1);

        }

    }
