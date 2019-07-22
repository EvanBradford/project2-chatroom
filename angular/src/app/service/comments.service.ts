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
    return this.http.post(this.serverUrl+'Comments/', params);

    //ToDo finish off this stuff
  }

  public submitPMComment(comment:string) { 
    const now = new Date();

    let date = now.toString();
    let userId = sessionStorage.getItem('LoggedInId');

    let channel_Id = sessionStorage.getItem('CurrentPM');

    let params = { "content":comment, "postDate": date, "user_Id":userId, "channel_Id":channel_Id};
    console.log(params);
    return this.http.post(this.serverUrl+'Comments/', params);

    //ToDo finish off this stuff
  }
  public listComments(){
    return this.http.get(this.serverUrl+'Comments/');
  }

  public listPMComments(){
    let channelId = sessionStorage.getItem('CurrentPM');

    return this.http.get(this.serverUrl+'Comments/'+ channelId);

  }
}
