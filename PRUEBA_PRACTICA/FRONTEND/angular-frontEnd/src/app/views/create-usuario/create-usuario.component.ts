import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, Validators, MaxLengthValidator} from '@angular/forms';
import { UsuarioI } from 'src/app/models/usuario.interface';
import { ApiService } from '../../services/api/api.service'
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-create-usuario',
  templateUrl: './create-usuario.component.html',
  styleUrls: ['./create-usuario.component.css']
})
export class CreateUsuarioComponent implements OnInit {

  usuarioForm = new FormGroup({
    id : new FormControl(0,Validators.required),
    nombres: new FormControl('',Validators.required),
    correo:new FormControl('',Validators.required),
    contrasena:new FormControl('',Validators.required),
    areaestudio:new FormControl('',Validators.required),
    especialidad:new FormControl('',Validators.required ),
    tipousuario:new FormControl('',Validators.required),
    nivelacademico:new FormControl('',Validators.required),
    motivoregistro:new FormControl('',Validators.required),
    prioridad:new FormControl(0),
  })

  lista:string[]=["Matematicas","Literatura","Ciencias"];
  listaTipoUsuario:string[]=["Estudiante","Profesor"];
  listaNivelAcademico:string[]=["Primaria","Secundaria","Tercer nivel", "Cuarto nivel"];

  lista1:string[]=["Academicos","Ingresos extras"];

  constructor(private router:Router, private apiService:ApiService, private toastr:ToastrService) { }

  ngOnInit(): void {
  }


  onCreateUsuario(form:UsuarioI){
    this.apiService.createUsuario(form).subscribe(data=>{
      this.toastr.success(data.mensaje);      
    },(error)=>{
      this.toastr.error(error.error.mensaje);
    });
    this.router.navigate(['create-usuario']);
  }

}
