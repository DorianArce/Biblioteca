/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Libros;
import com.mycompany.models.Prestamos;
import com.mycompany.models.Usuarios;
import java.util.List;

/**
 *
 * @author doria
 */
public interface DAOPrestamos {
    public void registrar(Prestamos user) throws Exception;
    public void modificar(Prestamos user) throws Exception;
    public Prestamos getLending(Usuarios user, Libros book) throws Exception;
    public List<Prestamos> listar() throws Exception;
    public List<Prestamos> listar3(String usuario) throws Exception;
    public Prestamos getPrestamoById(int PrestamoId) throws Exception;
    public Prestamos getDispById(int DispId) throws Exception;
    
}
