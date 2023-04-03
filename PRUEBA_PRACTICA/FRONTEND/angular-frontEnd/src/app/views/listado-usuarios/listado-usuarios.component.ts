import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../services/api/api.service';
import {UsuarioI} from '../../models/usuario.interface';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-listado-usuarios',
  templateUrl: './listado-usuarios.component.html',
  styleUrls: ['./listado-usuarios.component.css']
})
export class ListadoUsuariosComponent implements OnInit {

  UsuarioI: UsuarioI[]=[];

  constructor(private api:ApiService, private router:Router, private toastr:ToastrService) { }

  ngOnInit(): void {
    this.getAllUsuario();
  }


  goEditarUsuario(id:any){
    this.router.navigate(['edit-usuario',id]);
  }

  getAllUsuario(){
    this.api.getAllUsuario().subscribe(data =>{  
      this.UsuarioI = data.respuesta;    
      console.log(this.UsuarioI);
    },(error)=>{
      this.toastr.error(error.error.mensaje);
    });
  }
}
