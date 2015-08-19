package br.ufop.rafael.xptoduino;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafael on 12/04/15.
 */
public class ConfigItem extends ActionBarActivity {

    String selecionado = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText etComando;
        Button btConfirma;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_item);

        Intent it = getIntent();
        selecionado = it.getStringExtra("opcao");

        etComando = (EditText) findViewById(R.id.etComando);
        btConfirma = (Button) findViewById(R.id.btComando);

        btConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedResources.getInstance().getComandos().put(selecionado,"xpto"+etComando.getText().toString().toLowerCase().replaceAll("\\s",""));
                Toast.makeText(ConfigItem.this, "Comando configurado!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
