/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author doria
 */
public class Usuarios {
    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String Domicilio;
    private String Poblacion;
    private String Provincia;
    private String F_Nacimiento;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getF_Nacimiento() {
        return F_Nacimiento;
    }

    public void setF_Nacimiento(String F_Nacimiento) {
        this.F_Nacimiento = F_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }



    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
}
