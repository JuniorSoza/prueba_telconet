import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './views/login/login.component';
import { CreateUsuarioComponent } from './views/create-usuario/create-usuario.component';
import { ListadoUsuariosComponent } from './views/listado-usuarios/listado-usuarios.component';
import { EditUsuarioComponent } from './views/edit-usuario/edit-usuario.component';
import { CreateCursoComponent } from './views/create-curso/create-curso.component';

const routes: Routes = [
  {path:'', redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'listado-usuarios',component:ListadoUsuariosComponent},
  {path:'create-usuario',component:CreateUsuarioComponent},
  {path:'edit-usuario/:id',component:EditUsuarioComponent},
  {path:'create-curso',component:CreateCursoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [LoginComponent,ListadoUsuariosComponent,EditUsuarioComponent,CreateCursoComponent]