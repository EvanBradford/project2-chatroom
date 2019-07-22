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
   arr21 =[];

getPMed(){
  this.newChannel.getChannels().subscribe((res)=>{
let b = res;
console.log(b);
let i= 0;
let userId = sessionStorage.getItem("LoggedInId");
  for (i = 0; i < b.length; i++) { 
    if (b[i].channelName.startsWith('pm,'+userId)){
        this.arr21.push(b[i].channelId,b[i].channelName, 'mine');
    }
   
 }
 for (i = 0; i < b.length; i++) { 
    if (b[i].channelName.endsWith(','+userId)){
        this.arr21.push(b[i].channelId,b[i].channelName, 'theres');
    } 
 }
});

console.log(this.arr21);

}


  getBlocked(){
 this.blockService.getBlockedList().subscribe((res)=>{
  console.log(res);
  let list = res;
  sessionStorage.setItem('blockedList', list );
let i=0;
let j=0;

  for (i = 0; i < this.user.length; i++) { 
    for (j =0; j < list.length; j++ ){
    if (this.user[i].aeid == list[j].blockUserId){
      this.user.filter(d=> d.aeid == list[j].blockUserId);
    }}
    }
   console.log("this is the blocked usrs?")
 console.log(this.user);


 // this.user.filter()

});
  }

  privateChat(pmed_id){
    this.newChannel.startPM(pmed_id).subscribe((res)=>{});
    
   sessionStorage.setItem('Pm_Id', pmed_id);
  }

  getUsers() {
    let userId = sessionStorage.getItem('LoggedInId');
    let userID = parseInt(userId);
    if (userID > 0){
    this.loginService.getAll().subscribe((res) => {
      this.user = res;
      console.log(this.user);
    });
  }
  this.getBlocked();


}


  x;

  ngOnInit() {
    
    this.x = setInterval(() => { this.getUsers(); }, 1500);
  }

  block(id){
    this.blockService.block(id).subscribe((res) => {
      console.log(res);
    });
    console.log("this works "+id);
  }

}
