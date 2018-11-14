package com.example.tayler_gabbi.monedero_java.view;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.tayler_gabbi.monedero_java.MonederoApplication;
import com.example.tayler_gabbi.monedero_java.R;
import com.example.tayler_gabbi.monedero_java.model.DaoSession;
import com.example.tayler_gabbi.monedero_java.model.Usuario;
import com.example.tayler_gabbi.monedero_java.listas.ListaUsuarioActivity;

import java.util.List;

public class RegistrarActivity extends AppCompatActivity {
    private DaoSession daoSession;
    private EditText nombre,usuarios,contrasenia;
    private Button regitrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        daoSession = ((MonederoApplication)getApplication()).getDaoSession();
        nombre = findViewById(R.id.edit_text_name);
        usuarios = findViewById(R.id.edit_text_usuario);
        contrasenia = findViewById(R.id.edit_text_password);
        regitrarse = findViewById(R.id.button_register_ingresar);

        regitrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarUsuario();

            }
        });


    }
    private void insertarUsuario (){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre.getText().toString());
        usuario.setUsuario(usuarios.getText().toString());
        usuario.setContrasenia(contrasenia.getText().toString());
        Long a=daoSession.getUsuarioDao().insert(usuario);

        Intent intent = new Intent(RegistrarActivity.this,ListaUsuarioActivity.class);
        startActivity(intent);
        finish();

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
