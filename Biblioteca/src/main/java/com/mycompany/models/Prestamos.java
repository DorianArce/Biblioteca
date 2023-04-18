/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author doria
 */
public class Prestamos {

    public void setNum_Pedido(String Num_Pedido) {
        this.Num_Pedido = Num_Pedido;
    }

    public String getNum_Pedido() {
        return Num_Pedido;
    }
    private String Num_Pedido;
    private String Cod_libro;

    public void setFecha_salida(String Fecha_salida) {
        this.Fecha_salida = Fecha_salida;
    }

    public void setFecha_Maxima(String Fecha_Maxima) {
        this.Fecha_Maxima = Fecha_Maxima;
    }

    public void setFecha_Devolucion(String Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public String getFecha_salida() {
        return Fecha_salida;
    }

    public String getFecha_Maxima() {
        return Fecha_Maxima;
    }

    public String getFecha_Devolucion() {
        return Fecha_Devolucion;
    }
    private String Cod_usr;
    private String Fecha_salida;
    private String Fecha_Maxima;
    private String Fecha_Devolucion;

    public void setCod_libro(String Cod_libro) {
        this.Cod_libro = Cod_libro;
    }

    public void setCod_usr(String Cod_usr) {
        this.Cod_usr = Cod_usr;
    }

    public String getCod_libro() {
        return Cod_libro;
    }

    public String getCod_usr() {
        return Cod_usr;
    }
  
}
