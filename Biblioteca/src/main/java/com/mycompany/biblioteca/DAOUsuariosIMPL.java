/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import com.mycompany.bd.Coneccion;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.models.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doria
 */
public class DAOUsuariosIMPL extends Coneccion implements DAOUsuarios{

    @Override
    public void registrar(Usuarios user) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st= this.conexion.prepareStatement("Insert into usuarios(Nombre,Apellidos,DNI,Domicilio,Poblacion,Provincia,F_Nacimiento) values(?,?,?,?,?,?,?)");
            st.setString(1,user.getNombre());
            st.setString(2,user.getApellidos());
            st.setString(3,user.getDNI());
            st.setString(4,user.getDomicilio());
            st.setString(5,user.getPoblacion());
            st.setString(6,user.getProvincia());
            st.setString(7,user.getF_Nacimiento());
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Usuarios user) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st= this.conexion.prepareStatement("Update usuarios set Nombre=?,Apellidos=?,DNI=?,Domicilio=?,Poblacion=?,Provincia=?,F_Nacimiento=? where Cod_Usr=?");
            st.setString(1,user.getNombre());
            st.setString(2,user.getApellidos());
            st.setString(3,user.getDNI());
            st.setString(4,user.getDomicilio());
            st.setString(5,user.getPoblacion());
            st.setString(6,user.getProvincia());
            st.setString(7,user.getF_Nacimiento());
            st.setInt(8, user.getId());
            st.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int userId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE Cod_usr = ?;");
            st.setInt(1, userId);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Usuarios> listar(String name) throws Exception {
        List<Usuarios> lista = null;
        try {
            this.Conectar();
            String Query = name.isEmpty() ? "SELECT * FROM usuarios;" : "SELECT * FROM usuarios WHERE nombre LIKE '%" + name + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Usuarios user = new Usuarios();
                user.setId(rs.getInt("Cod_usr"));
                user.setNombre(rs.getString("Nombre"));
                user.setApellidos(rs.getString("Apellidos"));
                user.setDNI(rs.getString("DNI"));
                user.setDomicilio(rs.getString("Domicilio"));
                user.setPoblacion(rs.getString("Poblacion"));
                user.setProvincia(rs.getString("Provincia"));
                user.setF_Nacimiento(rs.getString("F_Nacimiento"));
                lista.add(user);
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
    public Usuarios getUserById(int userId) throws Exception {
        Usuarios user = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE Cod_usr = ? LIMIT 1;");
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                user = new Usuarios();
                user.setId(rs.getInt("Cod_usr"));
                user.setNombre(rs.getString("Nombre"));
                user.setApellidos(rs.getString("Apellidos"));
                user.setDNI(rs.getString("DNI"));
                user.setDomicilio(rs.getString("Domicilio"));
                user.setPoblacion(rs.getString("Poblacion"));
                user.setProvincia(rs.getString("Provincia"));
                user.setF_Nacimiento(rs.getString("F_Nacimiento"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return user;
    }
    
}
