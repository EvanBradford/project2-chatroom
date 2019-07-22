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
userList:any;
  user: any;
   arr21 =[];
  counter=0;

getPMed(){
  this.newChannel.getChannels().subscribe((res)=>{
let b = res;
console.log(b);
let i= 0;
let userId = sessionStorage.getItem("LoggedInId");
  for (i = 0; i < b.length; i++) { 
    if (b[i].channelName.startsWith('pm,'+userId)){
      let war = 'pm,'+userId+','
      let end = war.length;
      let staruser = b[i].channelName.slice(end);
        this.arr21.push(staruser);
    }
   
 }
 for (i = 0; i < b.length; i++) { 
    if (b[i].channelName.endsWith(','+userId)){
      let end = ','+userId;
      let war = end.length;
      let staruser = b[i].channelName.slice(0,war);
        this.arr21.push(staruser);
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

  for (i = 0; i < this.userList.length; i++) { 
    for (j =0; j < list.length; j++ ){
      console.log('it should do this a couple of times');
    if ( this.userList[i].aeid == list[j].blockUserId){
      this.userList.splice(i,1);
    }}
    }
   console.log("this is the good usr?")
   console.log(this.userList);

   if (this.counter == 0){
     this.user = this.userList;
     this.counter++;
   } else{
     if (this.user != this.userList){
this.user=this.userList;
     }
    
   }



 // this.user.filter()

});
  }

privateChannels=[];

  privateChat(pmed_id){
let userId = sessionStorage.getItem("LoggedInId")
    this.newChannel.getChannels().subscribe((res)=>{
      let channels = res;
      console.log("these are the channels")
      console.log(channels);
      
      for (let i =0; i < channels.length; i++){
      if (channels[i].channelName.startsWith("pm,"+pmed_id) 
      || channels[i].channelName.endsWith(","+pmed_id)){
        this.privateChannels.push(channels[i].channelId)
        
      }
      

    }

  console.log(this.privateChannels)
  console.log("this is the big thing");
  let chatID = Math.max(...this.privateChannels);
    let chatId = chatID.toString();
    console.log(chatID);
if (chatId == "-Infinity"){
  this.newChannel.startPM(pmed_id).subscribe((res)=>{});
  this.privateChat(pmed_id);
}else{
  sessionStorage.setItem("CurrentPM", chatId);
}
  
  });

    
   sessionStorage.setItem('Pm_Id', pmed_id);
  }

  getUsers() {
    let userId = sessionStorage.getItem('LoggedInId');
    let userID = parseInt(userId);
    if (userID > 0){
    this.loginService.getAll().subscribe((res) => {
      this.userList = res;
      console.log(this.userList);
    });
  }
  this.getBlocked();


}


  x;

  ngOnInit() {
    
    this.x = setInterval(() => { this.getUsers(); }, 5000);
  }

  block(id){
    this.blockService.block(id).subscribe((res) => {
      console.log(res);
    });
    console.log("this works "+id);
  }

}
