import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class LogginService {

serverUrl="https://localhost:8055"; 

  constructor(private http:HttpClient) { }

  public login (username:string, password:string){

    console.log(username);
    console.log(password);

  let params = new HttpParams()
  .set('username', username)
  .set('password', password);//these parameters are going to be pushed into the backend


  return this.http.post(this.serverUrl + "User/login.do" , params );
  }

}


