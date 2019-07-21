import { Component, OnInit } from '@angular/core';
import { Comments } from '../../../models/Comments';
import { CommentsService } from '../../../service/comments.service';
import { ChannelService } from '../../../service/channel.service';

@Component({
  selector: 'app-chat-detail',
  templateUrl: './chat-detail.component.html',
  styleUrls: ['./chat-detail.component.css']
})
export class ChatDetailComponent implements OnInit {

comment : Comments ={
  content: "",
  postDate: "",
  user_Id: sessionStorage.getItem("LoggedInId"),
  channel_Id: ""
};

  constructor(private channel:ChannelService, private comments:CommentsService) { }

  ngOnInit() {
  }

  submitnewComment(){
    let userId = sessionStorage.getItem('LoggedInId');
    console.log(userId);
    let pm_id = sessionStorage.getItem('Pm_Id');

this.channel.getChannelByID().subscribe((res)=>{
  console.log(res); 
  let chats = res;

  let arr1 = chats.filter(d=> d.channelName == "pm,"+userId+","+pm_id);
  console.log(arr1);
 let arr2 = []
 let i =0;
  for (i = 0; i < arr1.length; i++) { 
    console.log(arr1[i].channelId);
     arr2.push(arr1[i].channelId);
 }
 
  let channelId =  Math.max(...arr2);
  let channel_Id = channelId.toString();

  sessionStorage.setItem("CurrentPM", channel_Id);
  

})



        if (userId!='0'){
     this.comments.submitPMComment(this.comment.content).subscribe((res)=>{
     console.log(res);
    
     this.comment.content="";
     
     });}

}
}