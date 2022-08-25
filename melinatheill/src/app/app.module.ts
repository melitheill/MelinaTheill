import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { LogoComponent } from './componentes/logo/logo.component';
import { SobremiComponent } from './componentes/sobremi/sobremi.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SoftskillsComponent } from './componentes/softskills/softskills.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { FooterComponent } from './componentes/footer/footer.component';
import {HttpClient,HttpClientModule} from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    BannerComponent,
    LogoComponent,
    SobremiComponent,
    ExperienciaComponent,
    EducacionComponent,
    SoftskillsComponent,
    ProyectosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
  HttpClient
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
