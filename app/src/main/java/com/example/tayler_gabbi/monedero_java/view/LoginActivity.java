package com.example.tayler_gabbi.monedero_java.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tayler_gabbi.monedero_java.MonederoApplication;
import com.example.tayler_gabbi.monedero_java.R;
import com.example.tayler_gabbi.monedero_java.model.Usuario;
import com.example.tayler_gabbi.monedero_java.model.UsuarioDao;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private UsuarioDao usuarioDao;
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button logearse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = findViewById(R.id.edit_usuario);
        txtPassword = findViewById(R.id.edit_pasword);
        logearse = findViewById(R.id.button_ingresar);
        usuarioDao = ((MonederoApplication)getApplication()).getDaoSession().getUsuarioDao();


       logearse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = txtUsuario.getText().toString();
                List listUsuario = usuarioDao.queryBuilder().where(UsuarioDao.Properties.Usuario.eq(usuario)).list();


                if(usuario.equals(""))
                {
                    Toast.makeText(LoginActivity.this, "Debe indicar el Usuario a comprobar.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(listUsuario!= null) {
                        for(Usuario usuario1 :listUsuario) {
                            Toast.makeText(this, "El usuario indicado existe en la Base de Datos." +
                                    "\nID:" + login.getId() + "\nUsuario:" + login.getUsuario(),3000).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(this, "No hay coincidencias.", 3000).show();
                    }
                }
            }
       }

            }
        });
     }
}
