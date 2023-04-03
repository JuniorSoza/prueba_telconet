import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl, Validators} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UsuarioI } from 'src/app/models/usuario.interface';
import { ApiService } from '../../services/api/api.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-edit-usuario',
  templateUrl: './edit-usuario.component.html',
  styleUrls: ['./edit-usuario.component.css']
})
export class EditUsuarioComponent implements OnInit {

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
  UsuarioI: UsuarioI[]=[];

  constructor(private _route:ActivatedRoute,private api:ApiService, private apiService:ApiService, private router:Router, private toastr:ToastrService) { }

  ngOnInit(): void {
    console.log("Category edit: "+this._route.snapshot.paramMap.get('id'));
  }



  onEditarUsuario(form:any){
    form.id = this._route.snapshot.paramMap.get('id');
    this.apiService.updateUsuario(form).subscribe(data=>{
      this.toastr.success(data.mensaje);      
    },(error)=>{
      this.toastr.error(error.error.mensaje);
    });
    this.router.navigate(['listado-usuarios']);
  }

}
