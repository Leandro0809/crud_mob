package com.example.crud_mob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.crud_mob.dao.ProdutoDAO;

public class adicionar_produtos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_produtos);

        Button button = findViewById(R.id.button);
        EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        EditText editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validação

                ProdutoDAO p = new ProdutoDAO(null
                        editTextTextPersonName.getText().toString(),
                        editTextTextPersonName2.getText().toString(),
                        editTextTextPersonName3.getText().toString(),
                        "",
                        adicionar_produtos.this);

                )
            }
        });
    }
}