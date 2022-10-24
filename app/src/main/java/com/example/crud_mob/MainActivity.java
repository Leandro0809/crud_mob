package com.example.crud_mob;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.crud_mob.dao.ProdutoDAO;

public class MainActivity extends AppCompatActivity {

    ListView lvProdutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProdutos = findViewById(R.id.listviewProdutos);

        lvProdutos.setEmptyView(findViewById(R.id.tvEmpty));

        Cursor c = new ProdutoDAO(this).listarProd();

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(
                this,
                R.layout.listarprodutos,
                c,
                new String[]{ "_id", "nome"},
                new int[]{R.id.id, R.id.nome}, 0);
        lvProdutos.setAdapter(adapter);

        //lvProdutos.setOnClickListener();

        }
}