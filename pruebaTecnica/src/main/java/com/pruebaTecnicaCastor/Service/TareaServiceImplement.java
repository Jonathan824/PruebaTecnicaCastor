/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	26/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Implementar el servicio                       *
******************************************************************************* 
*/
package com.pruebaTecnicaCastor.Service;

import com.pruebaTecnicaCastor.Dao.TareaDao;
import com.pruebaTecnicaCastor.model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class TareaServiceImplement implements TareaService {
    @Autowired
    private TareaDao tareaDao;
    
     public List<Tarea> findAll(){
        return (List<Tarea>) tareaDao.findAll();
    }
     
    public Tarea Save(Tarea tarea){
        return tareaDao.save(tarea);
    }
    
    public Tarea findById(Integer id){
        return tareaDao.findById(id).orElse(null);
    }
    
    public void delete(Integer id){
        tareaDao.deleteById(id);
    }

    @Override
    public List<Tarea> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
