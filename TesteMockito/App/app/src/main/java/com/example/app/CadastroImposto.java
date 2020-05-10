package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CadastroImposto extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerEstados;
    private EditText txtAliquota;
    private TextView txtEstadoSelecionado;
    private TextView txtImpostoCadastrado;
    private Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_imposto);


        spinnerEstados = findViewById(R.id.spinnerEstados);
        txtAliquota = findViewById(R.id.txtAliquota);

        //TextView + Ocultando
        txtEstadoSelecionado = findViewById(R.id.txtEstadoSelecionado);
        txtEstadoSelecionado.setVisibility(View.GONE);

        txtImpostoCadastrado = findViewById(R.id.txtImpostoCadastrado);
        txtImpostoCadastrado.setVisibility(View.GONE);

        btSalvar = findViewById(R.id.btSalvar);

        //Método para popular o Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estados,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstados.setAdapter(adapter);
        spinnerEstados.setOnItemSelectedListener(this);


        //Ação do botão Salvar ao clicar
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exibir o textview
                txtEstadoSelecionado.setVisibility(View.VISIBLE);
                txtImpostoCadastrado.setVisibility(View.VISIBLE);

                //Pegar o item selecionado no spinner e o valor da alíquota digitado
                txtEstadoSelecionado.setText("Estado cadastrado: " + spinnerEstados.getSelectedItem());
                txtImpostoCadastrado.setText("Imposto referente: " + txtAliquota.getText());
            }
        });

    }

    //Métodos do Spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //Método para calcular o Imposto
    public static int calcularImposto(int estadoOrigem, int estadoDestino) {
        return estadoOrigem * estadoDestino;
    }





}

