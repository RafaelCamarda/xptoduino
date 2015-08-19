package br.ufop.rafael.xptoduino;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by rafael on 12/04/15.
 */
public class ConfigListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        Intent it = getIntent();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.comandos));
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int pos, long id){
        super.onListItemClick(l,v,pos,id);

        String selecionado = "";

        switch(pos){
            case 0:
                selecionado = "lall";
                trataConfig(selecionado);
                break;
            case 1:
                selecionado = "dall";
                trataConfig(selecionado);
                break;
            case 2:
                selecionado = "l13";
                trataConfig(selecionado);
                break;
            case 3:
                selecionado = "d13";
                trataConfig(selecionado);
                break;
            case 4:
                selecionado = "l12";
                trataConfig(selecionado);
                break;
            case 5:
                selecionado = "d12";
                trataConfig(selecionado);
                break;
            case 6:
                selecionado = "l11";
                trataConfig(selecionado);
                break;
            case 7:
                selecionado = "d11";
                trataConfig(selecionado);
                break;
            case 8:
                selecionado = "l10";
                trataConfig(selecionado);
                break;
            case 9:
                selecionado = "d10";
                trataConfig(selecionado);
                break;
            case 10:
                selecionado = "mab";
                trataConfig(selecionado);
                break;
            case 11:
                selecionado = "meb";
                trataConfig(selecionado);
                break;
            case 12:
                selecionado = "pall";
                trataConfig(selecionado);
                break;
            case 13:
                selecionado = "mus";
                trataConfig(selecionado);
                break;


        }
    }

    private void trataConfig(String selecionado) {
        Intent it = new Intent(ConfigListActivity.this, ConfigItem.class);
        it.putExtra("opcao", selecionado);
        startActivity(it);
    }
}
