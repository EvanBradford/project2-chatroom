import { Component, OnInit } from '@angular/core';
import { Comments } from 'src/app/models/Comments';
import { CommentsService } from '../../../service/comments.service';

@Component({
  selector: 'app-chatbar',
  templateUrl: './chatbar.component.html',
  styleUrls: ['./chatbar.component.css']
})
export class ChatbarComponent implements OnInit {
  chat: Comments = {
    content:"",
    postDate:"",
    user_Id:sessionStorage.getItem('LoggedInId'),
    channel_Id:"1"
    };
    
  constructor(private commentService: CommentsService) { }

  ngOnInit() {
  }

  submitnewComment(){
let userId = sessionStorage.getItem('LoggedInId');
console.log(userId);
    if (userId!='0'){
 this.commentService.submitComment(this.chat.content).subscribe((res)=>{
 console.log(res);

 this.chat.content="";
 
 });}
 else{
  document.getElementById('chatBarBar').classList.add('shake');
  this.chat.content="try to  log in first";
  console.log('no no no you are logged out');
 }
 
  }



}
