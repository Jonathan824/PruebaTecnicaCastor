/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	27/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Se crea interfaz para utilizar las opciones   *
*                               CRUD de SpringBoot                            *
******************************************************************************* 
*/
package com.pruebaTecnicaCastor.model.Dao;

import com.pruebaTecnicaCastor.model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Integer>{
    
}
