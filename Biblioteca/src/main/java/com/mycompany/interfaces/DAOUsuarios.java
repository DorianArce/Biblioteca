/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Usuarios;
import java.util.List;

/**
 *
 * @author doria
 */
public interface DAOUsuarios {
    public void registrar(Usuarios user) throws Exception;
    public void modificar(Usuarios user) throws Exception;
    public void eliminar(int userId) throws Exception;
    public List<Usuarios> listar(String name) throws Exception;
    public Usuarios getUserById(int userId) throws Exception;
    
}
