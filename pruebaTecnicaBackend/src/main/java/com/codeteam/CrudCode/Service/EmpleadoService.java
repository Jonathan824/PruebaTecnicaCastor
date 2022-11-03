/*
*********************************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo						*
*	Cuando realiza	:	26/10/2022								*						*
*	Para quién	:	Castor									*						*
*	Descripción	:	Se crean los métodos del CRUD                                           *
*********************************************************************************************************
*/
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Empleado;
import java.util.List;

public interface EmpleadoService {
    public List<Empleado> findAll();
    public Empleado save(Empleado tarea);
    public Empleado findById(Integer id);
    public void delete(Integer id);
    
}
