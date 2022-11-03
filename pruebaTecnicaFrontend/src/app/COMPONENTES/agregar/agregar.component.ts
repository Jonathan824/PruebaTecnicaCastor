import { Component, OnInit } from '@angular/core';
import { Empleado, EmpleadoService} from 'src/app/SERVICE/empleado.service'

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  empleadoNuevo: Empleado={id:'',cedula:'',nombre:'',fecha:'',ruta:'',cargo:''};
  constructor(private empleadoService: EmpleadoService) { }

  ngOnInit(): void {
  }

}
