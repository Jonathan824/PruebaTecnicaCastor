import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { InicioComponent } from './COMPONENTES/inicio/inicio.component';
import { EditarComponent } from './COMPONENTES/editar/editar.component';
import { AgregarComponent } from './COMPONENTES/agregar/agregar.component';
import { NavbarComponent } from './COMPONENTES/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    InicioComponent,
    EditarComponent,
    AgregarComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
