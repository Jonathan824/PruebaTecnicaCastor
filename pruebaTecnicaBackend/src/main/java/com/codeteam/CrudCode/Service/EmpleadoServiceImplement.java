/*
*********************************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo						*
*	Cuando realiza	:	26/10/2022								*						*
*	Para quién	:	Castor									*						*
*	Descripción	:	Se crea controlador para función de retorno de los métodos del CRUD     *
*********************************************************************************************************
*/
package com.codeteam.CrudCode.Service;

import com.codeteam.CrudCode.Model.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.codeteam.CrudCode.Dao.EmpleadoDao;

@Service
public class EmpleadoServiceImplement  implements EmpleadoService{
    @Autowired
    private EmpleadoDao tareaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Empleado> findAll()
    {
        return (List<Empleado>) tareaDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Empleado save(Empleado tarea)
    {
        return tareaDao.save(tarea);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Empleado findById(Integer id)
    {
        return tareaDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        tareaDao.deleteById(id);
    }
    
}
