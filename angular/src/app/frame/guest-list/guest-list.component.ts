import { Component, OnInit } from '@angular/core';
// import { users } from 'src/app/models/User';
import { LoginService } from '../../service/login.service';
import { BlockedByUserService } from 'src/app/service/blocked-by-user.service';
import { ChannelService } from '../../service/channel.service';

@Component({
  selector: 'app-guest-list',
  templateUrl: './guest-list.component.html',
  styleUrls: ['./guest-list.component.css']
})
export class GuestListComponent implements OnInit {

  constructor(private loginService: LoginService, private blockService: BlockedByUserService, private newChannel : ChannelService) { }

  user: any;

  getBlocked(){
 this.blockService.getBlockedList().subscribe((res)=>{
  console.log(res);
  console.log("you need to finish the blocked list in the user info part");
  console.log("that means filtering the response so that its only the blocked by id part");
  let list = res;
  sessionStorage.setItem('blockedList', list );

});
  }

  privateChat(pmed_id){
    this.newChannel.startPM(pmed_id).subscribe((res)=>{});
    
    
  }

  getUsers() {
    this.loginService.getAll().subscribe((res) => {
      this.user = res;
      console.log(this.user);
    });
  }
  ngOnInit() {
    this.getUsers();
  }

  block(id){
    this.blockService.block(id).subscribe((res) => {
      console.log(res);
    });
    console.log("this works "+id);
  }

}
