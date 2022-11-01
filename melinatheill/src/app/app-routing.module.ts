import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { LogingComponent } from './componentes/loging/loging.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'login',component:LogingComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
