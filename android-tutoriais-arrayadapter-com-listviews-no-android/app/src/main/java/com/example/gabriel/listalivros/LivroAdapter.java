package com.example.gabriel.listalivros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import model.Livro;

/**
 * Created by gabriel on 07/10/15.
 */
public class LivroAdapter extends ArrayAdapter<Livro> {
    public LivroAdapter(Context context, ArrayList<Livro> livros) {
        super(context, R.layout.item_lista_livros, livros);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Livro livro = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_livros, parent, false);
        }

        ImageView capaLivro = (ImageView) convertView.findViewById(R.id.capaLivro);
        TextView nomeLivro = (TextView) convertView.findViewById(R.id.nomeLivro);
        TextView nomeAutor = (TextView) convertView.findViewById(R.id.nomeAutor);
        TextView preco = (TextView) convertView.findViewById(R.id.preco);

        // Preenchemos a View com os valores obtidos no objeto livro.
        capaLivro.setImageResource(livro.getImagem());
        nomeLivro.setText(livro.getNome());
        nomeAutor.setText(livro.getAutor());
        preco.setText("R$ " + String.valueOf(livro.getPreco()));

        return convertView;
    }
}
