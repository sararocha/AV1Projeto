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

public class CadastroPedido extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText inputNome;
    private EditText inputCPF;
    private EditText inputPeso;
    private Spinner spinnerEstados;
    private EditText inputEndereco;
    private EditText inputContato;
    private Button btGerarPedido;

    private TextView resultNome;
    private TextView resultCPF;
    private TextView resultPeso;
    private TextView resultEstado;
    private TextView resultEndereco;
    private TextView resultContato;
    private TextView resultMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        inputNome = findViewById(R.id.inputNome);
        inputCPF = findViewById(R.id.inputCPF);
        inputPeso = findViewById(R.id.inputPeso);
        spinnerEstados = findViewById(R.id.spinnerEstados);
        inputEndereco = findViewById(R.id.inputEndereco);
        inputContato = findViewById(R.id.inputContato);
        btGerarPedido = findViewById(R.id.btGerarPedido);

        //Ocultando TextViews
        resultNome = findViewById(R.id.resultNome);
        resultNome.setVisibility(View.GONE);

        resultCPF = findViewById(R.id.resultCPF);
        resultCPF.setVisibility(View.GONE);

        resultPeso = findViewById(R.id.resultPeso);
        resultPeso.setVisibility(View.GONE);

        resultEstado = findViewById(R.id.resultEstado);
        resultEstado.setVisibility(View.GONE);

        resultEndereco = findViewById(R.id.resultEndereco);
        resultEndereco.setVisibility(View.GONE);

        resultContato = findViewById(R.id.resultContato);
        resultContato.setVisibility(View.GONE);

        resultMsg = findViewById(R.id.resultMsg);
        resultMsg.setVisibility(View.GONE);


        //Método para popular o Spinner Estados
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.estados,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstados.setAdapter(adapter);
        spinnerEstados.setOnItemSelectedListener(this);


        //Ação do botão Gerar Pedido
        btGerarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exibindo os TextViews ocultos anteriormente
                resultNome.setVisibility(View.VISIBLE);
                resultCPF.setVisibility(View.VISIBLE);
                resultPeso.setVisibility(View.VISIBLE);
                resultEstado.setVisibility(View.VISIBLE);
                resultEndereco.setVisibility(View.VISIBLE);
                resultContato.setVisibility(View.VISIBLE);
                resultMsg.setVisibility(View.VISIBLE);

                //Pegando os dados inseridos
                resultNome.setText("Nome: "+inputNome.getText());
                resultCPF.setText("CPF/CNPJ: "+inputCPF.getText());
                resultPeso.setText("Peso: "+inputPeso.getText());
                resultEstado.setText("Estado: "+spinnerEstados.getSelectedItem());
                resultEndereco.setText("Endereço: "+inputEndereco.getText());
                resultContato.setText("Contato: "+inputContato.getText());
                resultMsg.setText("Seu pedido foi encaminhado.");


            }
        });
    }


    //Método para calcular o preço do pedido
    public static int calcularPedido(int valor, int peso) {
        return valor * peso;
    }

    //Métodos do Spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
