/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	27/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Se declaran funciones CRUD                    *
******************************************************************************* 
*/
package com.pruebaTecnicaCastor.Service;

import com.pruebaTecnicaCastor.model.Tarea;
import java.util.List;

public interface TareaService {
    public List<Tarea> finAll();
    public Tarea Save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);
}
