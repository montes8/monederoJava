package com.example.tayler_gabbi.monedero_java;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

@Entity(nameInDb = "TBL_CLIENTE")
public class Usuario {

    @Id(autoincrement = true)
    private Long id ;

    @Property(nameInDb = "nombre")
    private String nombre;

    private String usuario;

    private String contrasenia;
    //@Transient -> permte obiar este campo a la hora d guardar a la bd
     //private String pais;varianle a eudir
}
