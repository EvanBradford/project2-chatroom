import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http'; 

@Injectable({
  providedIn: 'root'
})

export class UserInfoService {

  serverUrl = 'http://localhost:8055/';
  constructor(private http:HttpClient) { }


}
