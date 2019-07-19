import { Component, OnInit } from '@angular/core';
import { CommentsService } from '../../service/comments.service';
import { Comments } from 'src/app/models/Comments';

@Component({
  selector: 'app-main-chat',
  templateUrl: './main-chat.component.html',
  styleUrls: ['./main-chat.component.css']
})
export class MainChatComponent implements OnInit {

  constructor(private commentService: CommentsService) {}

  comment: any;

  getComments() {
    this.commentService.listComments().subscribe((res)=>{
      console.log(res);
      this.comment = res;
      console.log(this.comment[1].content);
    });
  }

  ngOnInit() {
    this.getComments();
  }

}
