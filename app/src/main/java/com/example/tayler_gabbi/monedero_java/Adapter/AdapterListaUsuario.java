package com.example.tayler_gabbi.monedero_java.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tayler_gabbi.monedero_java.R;
import com.example.tayler_gabbi.monedero_java.model.Usuario;

import java.util.ArrayList;


public class AdapterListaUsuario extends RecyclerView.Adapter<AdapterListaUsuario.UsuarioViewholder> {


    private ArrayList<Usuario> listaUsuarios;

    public void addList(ArrayList<Usuario> listaUsuarios){
        this.listaUsuarios = listaUsuarios;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public UsuarioViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.molde_list_user,parent,false);

        return new UsuarioViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewholder holder, int position) {

        Usuario usuario = listaUsuarios.get(position);

        holder.nombre.setText(usuario.getNombre());
        holder.usuario.setText(usuario.getUsuario());
        holder.contrasenia.setText(usuario.getContrasenia());


    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewholder extends RecyclerView.ViewHolder{


        private TextView nombre,usuario,contrasenia;

        public UsuarioViewholder(View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.text_view_nombre1);
            usuario = itemView.findViewById(R.id.text_view_usuario1);
            contrasenia = itemView.findViewById(R.id.text_view_password1);


        }
    }
}
