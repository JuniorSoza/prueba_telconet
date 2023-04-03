import { Injectable } from '@angular/core';
import { LoginI } from '../../models/login.interface';
import { ResponseI } from '../../models/response.interface';
import { HttpClient , HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import { UsuarioI } from 'src/app/models/usuario.interface';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  urlServer:string = "http://localhost:8080/";

  constructor(private http:HttpClient) { 
  }

  getHeaders(): HttpHeaders {
    const headers = new HttpHeaders({
      'Authorization': "Bearer "+localStorage.getItem('token')
    });
    return headers;
  }

  loginByEmail(form:LoginI):Observable<ResponseI>{
    let direction = this.urlServer+"security/logeo/"+form.user+"/"+form.password+"/";
    return this.http.get<ResponseI>(direction);
  }

  //History-products
  getAllUsuario():Observable<ResponseI>{
    let direction = this.urlServer+"usuario";
    return this.http.get<ResponseI>(direction);
  }

  getUsuario(id:any):Observable<ResponseI>{
    let direction = this.urlServer+"usuario/"+id;
    return this.http.get<ResponseI>(direction);
  }


  createUsuario(form:UsuarioI):Observable<ResponseI>{
    let direction = this.urlServer+"usuario";
    const headers = this.getHeaders();
    return this.http.post<ResponseI>(direction,form);
  }

  updateUsuario(form:UsuarioI):Observable<ResponseI>{
    let direction = this.urlServer+"usuario";
    return this.http.put<ResponseI>(direction,form);
  }

}
