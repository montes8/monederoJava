package com.example.tayler_gabbi.monedero_java.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.tayler_gabbi.monedero_java.model.Usuario;

import java.util.ArrayList;


public class AdapterListaUsuario extends RecyclerView.Adapter<AdapterListaUsuario.UsuarioViewholder> {


    private ArrayList<Usuario> listaProductos;

    public void addList(ArrayList<Usuario> listaProductos){
        this.listaProductos = listaProductos;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public UsuarioViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UsuarioViewholder extends RecyclerView.ViewHolder{
        
        public UsuarioViewholder(View itemView) {
            super(itemView);

        }
    }
}
