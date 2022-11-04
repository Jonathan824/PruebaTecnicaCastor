import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Empleado, EmpleadoService } from 'src/app/SERVICE/empleado.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  id:string="";
  empleadoActual: Empleado = { id: '', cedula: '', nombre: '', fecha: '', ruta: '', cargo: '' };
  constructor(
    private empleadoService: EmpleadoService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.activatedRouter.snapshot.params['id'];
    this.empleadoService.getUnEmpleado(this.id).subscribe(
      res=>{this.empleadoActual=res},
      err=>console.log(err)
    );
  }

  guardar(){
    this.empleadoService.editEmpleado(this.id, this.empleadoActual).subscribe(
      res=>{
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    );
  }

}
