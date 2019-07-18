import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommentsService {

  serverUrl = 'http://localhost:8055/';
  constructor(private http:HttpClient) { } 

  public submitComment(comment:string) { 
    const now = new Date();

    let date = now.toString();
    let userId = sessionStorage.getItem('LoggedInId');

    let params = { "content":comment, "postDate": date, "user_Id":userId, "channel_Id":"1"};
    console.log(params);
    return this.http.post(this.serverUrl+'Comment/', params);

    //ToDo finish off this stuff
  }
}
