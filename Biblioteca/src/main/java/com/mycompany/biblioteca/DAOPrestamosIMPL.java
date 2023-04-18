/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import com.mycompany.bd.Coneccion;
import com.mycompany.interfaces.DAOPrestamos;
import com.mycompany.models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doria
 */
public class DAOPrestamosIMPL extends Coneccion implements DAOPrestamos {

    @Override
    public void registrar(Prestamos prestamo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO prestamos(Cod_usr, Cod_libro, Fecha_Salida,Fecha_Maxima) VALUES(?,?,?,?);");
            st.setString(1, prestamo.getCod_usr());
            st.setString(2, prestamo.getCod_libro());
            st.setString(3, prestamo.getFecha_salida());
            st.setString(4, prestamo.getFecha_Maxima());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Prestamos prestamo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamos SET Fecha_Devolucion = ? WHERE Num_Pedido = ?");;
            st.setString(1, prestamo.getFecha_Devolucion());
            st.setString(2, prestamo.getNum_Pedido());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public Prestamos getLending(Usuarios user, Libros book) throws Exception {
        Prestamos lending = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM prestamos WHERE Fecha_Devolucion IS NULL ORDER BY Num_pedido DESC LIMIT 1");
            st.setInt(1, user.getId());
            st.setInt(2, book.getCod_Libro());
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lending = new Prestamos();
                lending.setNum_Pedido(rs.getString("Num_Pedido"));
                lending.setCod_libro(rs.getString("Cod_libro"));
                lending.setCod_usr(rs.getString("Cod_usr"));
                lending.setFecha_salida(rs.getString("Fecha_Salida"));
                lending.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                lending.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
            }
            
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return lending;
    }

    public List<Prestamos> listar(String name) throws Exception {
        List<Prestamos> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Prestamos prestamo = new Prestamos();
                prestamo.setNum_Pedido(rs.getString("Num_Pedido"));
                prestamo.setCod_libro(rs.getString("Cod_libro"));
                prestamo.setCod_usr(rs.getString("Cod_usr"));
                prestamo.setFecha_salida(rs.getString("Fecha_Salida"));
                prestamo.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                prestamo.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
                lista.add(prestamo);
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
    public List<Prestamos> listar() throws Exception {
        List<Prestamos> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos ");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Prestamos prestamo = new Prestamos();
                prestamo.setNum_Pedido(rs.getString("Num_Pedido"));
                prestamo.setCod_libro(rs.getString("Cod_libro"));
                prestamo.setCod_usr(rs.getString("Cod_usr"));
                prestamo.setFecha_salida(rs.getString("Fecha_Salida"));
                prestamo.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                prestamo.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
                lista.add(prestamo);
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
    public Prestamos getPrestamoById(int PrestamoId) throws Exception {
        
        Prestamos prestamo = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos where Num_pedido=?;");
            st.setInt(1,PrestamoId);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                prestamo = new Prestamos();
                prestamo.setNum_Pedido(rs.getString("Num_Pedido"));
                prestamo.setCod_libro(rs.getString("Cod_libro"));
                prestamo.setCod_usr(rs.getString("Cod_usr"));
                prestamo.setFecha_salida(rs.getString("Fecha_Salida"));
                prestamo.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                prestamo.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return prestamo;
        
    }

    @Override
    public Prestamos getDispById(int DispId) throws Exception {
        
        Prestamos prestamo = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos where Cod_libro=? and Fecha_Devolucion is null;;");
            st.setInt(1,DispId);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                prestamo = new Prestamos();
                prestamo.setNum_Pedido(rs.getString("Num_Pedido"));
                prestamo.setCod_libro(rs.getString("Cod_libro"));
                prestamo.setCod_usr(rs.getString("Cod_usr"));
                prestamo.setFecha_salida(rs.getString("Fecha_Salida"));
                prestamo.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                prestamo.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return prestamo;
    }

    @Override
    public List<Prestamos> listar3(String usuario) throws Exception {
        //Este modulo sirve para que el usuario no pida mas de tres libros
        List<Prestamos> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos where Cod_usr="+usuario+" and Fecha_Devolucion is null");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Prestamos prestamo = new Prestamos();
                prestamo.setNum_Pedido(rs.getString("Num_Pedido"));
                prestamo.setCod_libro(rs.getString("Cod_libro"));
                prestamo.setCod_usr(rs.getString("Cod_usr"));
                prestamo.setFecha_salida(rs.getString("Fecha_Salida"));
                prestamo.setFecha_Maxima(rs.getString("Fecha_Maxima"));
                prestamo.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
                lista.add(prestamo);
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
    
}
