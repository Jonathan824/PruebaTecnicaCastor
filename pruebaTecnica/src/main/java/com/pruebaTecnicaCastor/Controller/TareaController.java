/*
*******************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo                    *
*	Cuando realiza	:	26/10/2022				      *
*	Para quién      :	Castor                                        *
*	Descripción	:	Llamar función de los métodos y se implementa *
*                               procesos                                      *
******************************************************************************* 
 */
package com.pruebaTecnicaCastor.Controller;

import com.pruebaTecnicaCastor.Service.TareaService;
import com.pruebaTecnicaCastor.model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    //Listar datos
    @GetMapping("/empleados")
    public List<Tarea> listar() {
        return tareaService.finAll();
    }

    //Guardar datos
    @PostMapping("/empleados")
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaService.Save(tarea);
    }

    //Econtrar un empleado
    @GetMapping("/empleados/{id}")
    public Tarea UnEmpleado(@PathVariable Integer id) {
        return tareaService.findById(id);
    }

    //Modificar - editar
    @PutMapping("/empleados/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {
        Tarea tareaActual = tareaService.findById(id);
        tareaActual.setNombre(tarea.getNombre());
        tareaActual.setRutaFoto(tarea.getRutaFoto());
        tareaActual.setFechaIngreso(tarea.getFechaIngreso());
        tareaActual.setCargo(tarea.getCargo());

        return tareaService.Save(tareaActual);
    }

    //Eliminar
    @DeleteMapping("empleados/{id}")
    public void eliminar(@PathVariable Integer id) {
        tareaService.delete(id);
    }
}
