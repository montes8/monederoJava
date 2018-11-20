package com.example.tayler_gabbi.monedero_java.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.tayler_gabbi.monedero_java.Adapter.AdapterListaUsuario;
import com.example.tayler_gabbi.monedero_java.MonederoApplication;
import com.example.tayler_gabbi.monedero_java.R;
import com.example.tayler_gabbi.monedero_java.model.DaoSession;
import com.example.tayler_gabbi.monedero_java.model.Usuario;
import com.example.tayler_gabbi.monedero_java.model.UsuarioDao;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarioActivity extends AppCompatActivity {

    private UsuarioDao daoSession;
    private AdapterListaUsuario adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);

        daoSession = ((MonederoApplication)getApplication()).getDaoSession().getUsuarioDao();

        recyclerView = findViewById(R.id.lista_usuario);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListaUsuario();

        List<Usuario> usuarios = daoSession.loadAll();
        Log.d("lista",""+usuarios);
        adapter.addList((ArrayList<Usuario>) usuarios);

        recyclerView.setAdapter(adapter);

    }

    public void listarUsuario(){


    }
}
