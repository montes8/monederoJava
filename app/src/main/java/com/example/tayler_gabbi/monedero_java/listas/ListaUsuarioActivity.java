package com.example.tayler_gabbi.monedero_java.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tayler_gabbi.monedero_java.DaoSession;
import com.example.tayler_gabbi.monedero_java.R;
import com.example.tayler_gabbi.monedero_java.model.Usuario;

import java.util.List;

public class ListaUsuarioActivity extends AppCompatActivity {

    private DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);



    }

    public void listarUsuario(){

        List<Usuario> usuarios = daoSession.getUsuarioDao().loadAll();
    }
}
