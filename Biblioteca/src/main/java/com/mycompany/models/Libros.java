/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author doria
 */
public class Libros {
    private int Cod_Libro;
    private String NombreL;
    private String Editorial;
    private String Autor;
    private String Genero;
    private String Pais_Autor;
    private String N_paginas;
    private String Año_edicion;
    private String Precio;

    public void setCod_Libro(int Cod_Libro) {
        this.Cod_Libro = Cod_Libro;
    }

    public void setNombreL(String NombreL) {
        this.NombreL = NombreL;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setPais_Autor(String Pais_Autor) {
        this.Pais_Autor = Pais_Autor;
    }

    public void setN_paginas(String N_paginas) {
        this.N_paginas = N_paginas;
    }

    public void setAño_edicion(String Año_edicion) {
        this.Año_edicion = Año_edicion;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getCod_Libro() {
        return Cod_Libro;
    }

    public String getNombreL() {
        return NombreL;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public String getPais_Autor() {
        return Pais_Autor;
    }

    public String getN_paginas() {
        return N_paginas;
    }

    public String getAño_edicion() {
        return Año_edicion;
    }

    public String getPrecio() {
        return Precio;
    }
}
