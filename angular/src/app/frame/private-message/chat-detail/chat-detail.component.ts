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

newComment(){

  let content = this.comment.content;

  

}

}
