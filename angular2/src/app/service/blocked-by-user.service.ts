import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http'; 
import { Observable } from 'rxjs';
import { retry, catchError, map } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class BlockedByUserService {
  serverUrl = 'http://localhost:8055/';
  constructor(private http:HttpClient) { }

  public block (blocked: any) : Observable<any>{
let ae_id = sessionStorage.getItem("LoggedInId");
console.log(ae_id);
    let params = { "blockUserId":blocked, "ae_Id": ae_id};
    return this.http.post<any>(this.serverUrl + 'BlockedByUser/', params);
    // .pipe(
    //   retry(1),
    // catchError((error:any) => Observable.throw( 'Server error')));
}

public getBlockedList (): Observable<any>{
  let ae_id = sessionStorage.getItem("LoggedInId");
  console.log(ae_id);
  
  return this.http.get<any>(this.serverUrl + 'BlockedByUser/' + ae_id);
}

}
