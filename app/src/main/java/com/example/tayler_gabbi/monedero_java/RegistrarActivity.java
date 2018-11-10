package com.example.tayler_gabbi.monedero_java;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

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
        Long a=daoSession.getUsuarioDao().insert(usuario);

    }

    public void deleteUsuario(){

        daoSession.delete(1L);
    }

    public void listarUsuario(){

        List<Usuario> usuarios = daoSession.getUsuarioDao().loadAll();
    }

    public void actulizarUsuario(){

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setId(1L);
        nuevoUsuario.setNombre("mariana");
        nuevoUsuario.setUsuario("brenda");
        nuevoUsuario.setContrasenia("mariana");
        daoSession.getUsuarioDao().update(nuevoUsuario);
    }
}
