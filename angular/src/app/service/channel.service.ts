import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http'; 
import { Observable } from 'rxjs';
import { retry, catchError, map } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ChannelService {

  serverUrl = 'http://localhost:8055/';
  constructor(private http:HttpClient) { }


  
}
