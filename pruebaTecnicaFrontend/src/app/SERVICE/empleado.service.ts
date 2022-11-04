import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {

  url='http://localhost:8080/api/empleados';
  constructor(private http: HttpClient) { }

  getEmpleados():Observable<any>
  {
    return this.http.get(this.url);
  }

  getUnEmpleado(id: String): Observable<any>
  {
    return this.http.get(this.url+'/'+id);
  }

  saveEmpleado(empleado: Empleado): Observable<any>
  {
    return this.http.post(this.url,empleado);
  }

  editEmpleado(id: String, empleado: Empleado): Observable<any>
  {
    return this.http.put(this.url+'/'+id, empleado);
  }

  deleteEmpleado(id: String): Observable<any>
  {
    return this.http.delete(this.url+'/'+id);
  }
}


export interface Empleado{
  id    : String;
  cedula: String;
  nombre: String;
  ruta  : String;
  fecha	:	String;
  cargo : String;
}