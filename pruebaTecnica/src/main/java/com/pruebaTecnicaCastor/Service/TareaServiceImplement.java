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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TareaServiceImplement implements TareaService {

    @Autowired
    private TareaDao tareaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Tarea> finAll() {
        return (List<Tarea>) tareaDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Tarea Save(Tarea tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    @Transactional(readOnly=true)
    public Tarea findById(Integer id) {
        return tareaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        tareaDao.deleteById(id);
    }
}
