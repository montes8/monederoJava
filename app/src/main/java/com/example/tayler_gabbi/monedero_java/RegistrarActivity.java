package com.example.tayler_gabbi.monedero_java;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrarActivity extends AppCompatActivity {
    private DaoSession daoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        daoSession = ((MonederoApplication)getApplication()).getDaoSession();

    }
    private void insertarUsuario (){
        Usuario usuario = new Usuario();
        usuario.setNombre("mariana");
        usuario.setUsuario("brenda");
        usuario.setContrasenia("mariana");
        daoSession.getUsuarioDao().insert(usuario);

    }
}
