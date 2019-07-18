import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  serverUrl = 'http://localhost:8055/';
  constructor(private http:HttpClient) { }

  public login(email: string, password: string) {
    const params = new HttpParams()
    .set('username', email)
    .set('password', password);
    console.log(params);
    return this.http.post(this.serverUrl + 'User/login.do', params );
  }

  public register(email: string, password:string ){
    let params = { "email":email, "password": password, "adminLvl":"1", "status":"1"};
    console.log(params);
    return this.http.post(this.serverUrl+'User/', params);
  }

  public getAll(){
    return this.http.get(this.serverUrl+'User/');
      
      }
  }

