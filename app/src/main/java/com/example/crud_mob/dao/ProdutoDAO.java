package com.example.crud_mob.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.crud_mob.helper.DbHelper;

public class ProdutoDAO {
    private Integer id;
    private String nome;
    private  String valor;
    private String foto;
    private String descricao;
    private DbHelper SQLiteOpenHelper;
    private SQLiteDatabase database;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public ProdutoDAO(Context ctx){
        SQLiteOpenHelper = new DbHelper(ctx);
         database = SQLiteOpenHelper.getWritableDatabase();

    }

    public ProdutoDAO(Integer id, String nome, String valor, String foto, String descricao) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.foto = foto;
        this.descricao = descricao;
    }

    public boolean insert(){
        return false;
    }
    public boolean update(){
        return false;
    }
    public boolean delete(){
        return false;
    }

    public Cursor listarProd(){
        String sql="select id as _id, nome from PRODUTO;";
        Cursor c = database.rawQuery(sql,null);
        if (c!= null){
            c.moveToFirst();
        }
        return c;
    }


}
