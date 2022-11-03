/*
*********************************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo						*
*	Cuando realiza	:	26/10/2022								*						*
*	Para quién	:	Castor									*						*
*	Descripción	:	Se crea repositorio del CRUD                                            *
*********************************************************************************************************
*/
package com.codeteam.CrudCode.Dao;

import com.codeteam.CrudCode.Model.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDao extends CrudRepository<Empleado, Integer>{
    
}
