import { Component, OnInit } from '@angular/core';
import { CommentsService } from '../../service/comments.service';
import { Comments } from '../../models/Comments';


@Component({
  selector: 'app-private-message',
  templateUrl: './private-message.component.html',
  styleUrls: ['./private-message.component.css']
})
export class PrivateMessageComponent implements OnInit {

comment:any;
x:any;
  constructor(private commentService: CommentsService) { }

  getComments() {
    
    this.commentService.listPMComments().subscribe((res)=>{
      console.log(res);
      this.comment = res;
    });
  }
 

  ngOnInit() {
    this.x = setInterval(() => { this.getComments(); }, 1000);
  }

}
