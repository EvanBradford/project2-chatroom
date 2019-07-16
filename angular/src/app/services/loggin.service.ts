import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class LogginService {

serverUrl="whatever port your spring is running on";

  constructor(private http:HttpClient) { }

  public login (username:string, password:string){

    console.log(username);
    console.log(password);

    let params = new HttpParams()
  .set('username', username)
  .set('password', password);


  return this.http.post(this.serverUrl + "users/login.do" , params )
  }

}


