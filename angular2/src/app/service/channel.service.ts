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



  public startPM (pmed_id:any): Observable<any>{
    let ae_id = sessionStorage.getItem("LoggedInId");
    console.log(ae_id);
    let params =  {	"channelName": "pm"+","+ae_id +","+pmed_id,
    "channelType": ae_id}

    console.log(params);
    
    return this.http.post(this.serverUrl + 'Channel/' , params);
  }

  public getChannelByID(): Observable<any>{
    let ae_id = sessionStorage.getItem("LoggedInId");
    console.log(ae_id);
    return this.http.get(this.serverUrl + 'Channel/' +ae_id);
  }

  public getChannels(): Observable<any>{
    return this.http.get(this.serverUrl + 'Channel/');
  }


  

  
}
