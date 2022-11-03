/*
*********************************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo						*
*	Cuando realiza	:	26/10/2022								*						*
*	Para quién	:	Castor									*						*
*	Descripción	:	Se crea clase Empleado para el manejo de los campos de la tabla         *
*********************************************************************************************************
*/
package com.codeteam.CrudCode.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="ruta")
    private String ruta;
    
    @Column(name="fecha")
    private String fecha;
    
    @Column(name="cargo")
    private Integer cargo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String rutaFoto) {
        this.ruta = rutaFoto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}