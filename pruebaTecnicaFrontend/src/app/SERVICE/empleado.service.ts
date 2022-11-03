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
}
