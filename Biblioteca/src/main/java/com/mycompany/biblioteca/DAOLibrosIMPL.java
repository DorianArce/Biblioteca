/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import com.mycompany.bd.Coneccion;
import com.mycompany.interfaces.DAOLibros;
import com.mycompany.models.Libros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doria
 */
public class DAOLibrosIMPL extends Coneccion implements DAOLibros{

    @Override
    public void registrar(Libros libro) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st= this.conexion.prepareStatement("Insert into libros(Cod_libro,Nombre,Editorial,Autor,Genero,Pais_Autor,N_Paginas,Año_edicion,Precio) values(?,?,?,?,?,?,?,?,?)");
            st.setInt(1,libro.getCod_Libro());
            st.setString(2,libro.getNombreL());
            st.setString(3,libro.getEditorial());
            st.setString(4,libro.getAutor());
            st.setString(5,libro.getGenero());
            st.setString(6,libro.getPais_Autor());
            st.setString(7,libro.getN_paginas());
            st.setString(8,libro.getAño_edicion());
            st.setString(9,libro.getPrecio());
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Libros libro) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st= this.conexion.prepareStatement("Update libros set Nombre=?,Editorial=?,Autor=?,Genero=?,Pais_Autor=?,N_paginas=?,Año_edicion=?,Precio=? where Cod_libro=?");
            st.setInt(9,libro.getCod_Libro());
            st.setString(1,libro.getNombreL());
            st.setString(2,libro.getEditorial());
            st.setString(3,libro.getAutor());
            st.setString(4,libro.getGenero());
            st.setString(5,libro.getPais_Autor());
            st.setString(6,libro.getN_paginas());
            st.setString(7,libro.getAño_edicion());
            st.setString(8,libro.getPrecio());
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int bookId) throws Exception {
try{
            this.Conectar();
            PreparedStatement st= this.conexion.prepareStatement("delete from libros where Cod_libro=?");
            st.setInt(1,bookId);
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }    }

    @Override
    public List<Libros> listar(String title) throws Exception {
        List<Libros> lista = null;
        try {
            this.Conectar();
            String Query = title.isEmpty() ? "SELECT * FROM libros;" : "SELECT * FROM libros WHERE nombre LIKE '%" + title + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query); 
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Libros book = new Libros();
                book.setCod_Libro(rs.getInt("Cod_libro"));
                book.setNombreL(rs.getString("Nombre"));
                book.setEditorial(rs.getString("Editorial"));
                book.setAutor(rs.getString("Autor"));
                book.setGenero(rs.getString("Genero"));
                book.setPais_Autor(rs.getString("Pais_Autor"));
                book.setN_paginas(rs.getString("N_paginas"));
                book.setAño_edicion(rs.getString("Año_edicion"));
                book.setPrecio(rs.getString("Precio"));
                lista.add(book);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Libros getLibroById(int bookId) throws Exception {
        Libros book = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("Select * from libros where Cod_libro=? limit 1; "); 
            st.setInt(1,bookId);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                book = new Libros();
                book.setCod_Libro(rs.getInt("Cod_libro"));
                book.setNombreL(rs.getString("Nombre"));
                book.setEditorial(rs.getString("Editorial"));
                book.setAutor(rs.getString("Autor"));
                book.setGenero(rs.getString("Genero"));
                book.setPais_Autor(rs.getString("Pais_Autor"));
                book.setN_paginas(rs.getString("N_paginas"));
                book.setAño_edicion(rs.getString("Año_edicion"));
                book.setPrecio(rs.getString("Precio"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return book;
    }
    
}
