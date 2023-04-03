import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private route:Router) { }

  ngOnInit(): void {
  }

  goCrearUsuario(){
    this.route.navigate(['create-usuario']);
  }


  goUsuarios(){
    this.route.navigate(['listado-usuarios'])
  }

  goCreateCurso(){
    this.route.navigate(['create-curso'])
  }

  destroySession(){
    localStorage.removeItem("token");
  }

}
