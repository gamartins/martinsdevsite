package com.example.gabriel.listalivros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import model.Livro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criamos os objetos Livro
        Livro livro_01 = new Livro("Gabriel Angelo", "Gabriel Angelo", 69.90, R.drawable.livro_01);
        Livro livro_02 = new Livro("A vida de João", "João", 39.90, R.drawable.livro_02);
        Livro livro_03 = new Livro("Google Android", "Lecheta, Ricardo R", 139.00, R.drawable.livro_03);

        // Inserimos esses livros dentro de um ArrayList
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro_01);
        livros.add(livro_02);
        livros.add(livro_03);

        // Criamos um LivroAdapter para exibição customizada das Views
        LivroAdapter livroAdapter = new LivroAdapter(this,livros);

        // Inserimos a ListView e configuramos o seu adapter para realizar o preenchimento dos elementos.
        ListView listView = (ListView) findViewById(R.id.listaLivros);
        listView.setAdapter(livroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
