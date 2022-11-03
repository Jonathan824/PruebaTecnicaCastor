import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empleado, EmpleadoService} from 'src/app/SERVICE/empleado.service'

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  empleadoNuevo: Empleado={id:'',cedula:'',nombre:'',fecha:'',ruta:'',cargo:''};
   
  constructor(private empleadoService: EmpleadoService, private router: Router) { }

  ngOnInit(): void {
  }

  agregarEmpleado(){
    this.empleadoService.saveEmpleado(this.empleadoNuevo).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    );
  }
}
