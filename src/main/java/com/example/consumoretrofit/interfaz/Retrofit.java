package com.example.consumoretrofit.interfaz;

import com.example.consumoretrofit.usuario.Usuario;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Retrofit {

    //public static  final String

    @GET("consumoPhp/traerDatos.php")
    public Call<Usuario>find(@Path("USUid")int USUid);
}
