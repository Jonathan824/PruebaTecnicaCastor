import { Component, OnInit } from '@angular/core';
import { EmpleadoService } from 'src/app/SERVICE/empleado.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  constructor(private empleadoService: EmpleadoService) { }

  ngOnInit(): void {
    this.listarEmpleados();
  } 

  listarEmpleados()
  {
    this.empleadoService.getEmpleados().subscribe(
      res=>{console.log(res);},
      err=>console.log(err)
    );
  }

}
