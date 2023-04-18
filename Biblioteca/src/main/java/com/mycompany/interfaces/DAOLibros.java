/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Libros;
import java.util.List;

/**
 *
 * @author doria
 */
public interface DAOLibros {
    public void registrar(Libros user) throws Exception;
    public void modificar(Libros user) throws Exception;
    public void eliminar(int userId) throws Exception;
    public List<Libros> listar(String name) throws Exception;
    public Libros getLibroById(int userId) throws Exception;
    
}
