/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	26/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Utilizar funciones CRUD                       *
******************************************************************************* 
*/
package com.pruebaTecnicaCastor.Dao;

import com.pruebaTecnicaCastor.model.Tarea;
import org.springframework.data.repository.CrudRepository;


public interface TareaDao extends CrudRepository<Tarea, Integer>{
}
