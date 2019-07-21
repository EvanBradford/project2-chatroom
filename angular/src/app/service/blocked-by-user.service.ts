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

  public block (blocked: any, AE_ID:any) : Observable<any>{
    let params = { "blockUserId":blocked, "AE_ID": AE_ID,};
    return this.http.post<any>(this.serverUrl + 'BlockedByUser/', params)
    .pipe(
      retry(1),
    catchError((error:any) => Observable.throw(error.json().error || 'Server error')));
}

}
