/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	26/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Se crea entidad de la tabla tarea             *
******************************************************************************* 
*/
package com.pruebaTecnicaCastor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Tarea {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="rutaFoto")
    private String rutaFoto;
    
    @Column(name="fechaIngreso")
    private String fechaIngreso;
    
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

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}
