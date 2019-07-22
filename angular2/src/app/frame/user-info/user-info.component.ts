import { Component, OnInit } from '@angular/core';
 import { User } from 'src/app/models/User';
import { LoginService } from '../../service/login.service';
import { UserInfo } from 'src/app/models/UserInfo';
import { UserInfoService } from '../../service/user-info.service';
import { BnNgIdleService } from 'bn-ng-idle';
import { BlockedByUserService } from 'src/app/service/blocked-by-user.service';



@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

  user: User = {
  id: 0,
  email: "",
  password: "",
  adminLvl: 1,
  status:1

  };

  userInfo : UserInfo ={
    nickname:"",
    birthdate:"",
    region:"",
    profilePic:""
  }

   response : any;
  constructor(private loginService: LoginService, private userService : UserInfoService,private bnIdle: BnNgIdleService, private blockedBy: BlockedByUserService) { }

  ngOnInit() {
    sessionStorage.setItem('LoggedInUser', '');
sessionStorage.setItem('LoggedInId', '0' );
  }


  login() {
   console.log(this.user.email);
   console.log(this.user.password);
   document.getElementById('usernameField').classList.remove('shake');
  document.getElementById('passwordField').classList.remove('shake');

this.loginService.login(this.user.email, this.user.password).subscribe((res)=>{
console.log(res);

if(res == null){
  document.getElementById('usernameField').classList.add('shake');
  document.getElementById('passwordField').classList.add('shake');
  this.user.email="";
  this.user.password="";
  console.log('no no no you are logged out');

}


this.response = res;
 

let aeid = this.response.aeid;
const LoggedInUser = JSON.stringify(res);
sessionStorage.setItem('LoggedInUser', LoggedInUser);
sessionStorage.setItem('LoggedInId', this.response.aeid);


if (aeid>0) {
 console.log('hey you are finally logged in');
 
 document.getElementById('userInfo').classList.add('colorfade4');
 document.getElementById('emailLabel').innerText='nickname';
 document.getElementById('passwordLabel').innerText='image link';
 
 document.getElementById('usernameField').classList.add('hide');
 document.getElementById('usernameField').classList.remove('show');
 document.getElementById('nicknameField').classList.remove('hide');
 document.getElementById('nicknameField').classList.add('show');

 document.getElementById('passwordField').classList.add('hide');
 document.getElementById('passwordField').classList.remove('show');
 document.getElementById('imageurl').classList.remove('hide');
 document.getElementById('imageurl').classList.add('show');

 document.getElementById('loginbtn').classList.remove('show');
 document.getElementById('registerbtn').classList.remove('show');
 document.getElementById('loginbtn').classList.add('hide');
 document.getElementById('registerbtn').classList.add('hide');


} else {
  document.getElementById('usernameField').classList.add('shake');
  document.getElementById('passwordField').classList.add('shake');
  this.user.email="";
  this.user.password="";
  console.log('no no no you are logged out');



}
});

}

register() {
  console.log(this.user.email);
  console.log(this.user.password);
  document.getElementById('usernameField').classList.remove('shake');
  document.getElementById('passwordField').classList.remove('shake');
  document.getElementById('registerbtn').classList.remove('show');
  document.getElementById('registerbtn').classList.add('hide');
try{
this.loginService.register(this.user.email, this.user.password).subscribe((res)=>{
console.log(res);
if(res==null){
  document.getElementById('registerbtn').classList.remove('show');
  document.getElementById('registerbtn').classList.add('hide');
}else{
  document.getElementById('emailLabel').innerText='if you need to reset your password click here';
  document.getElementById('recoverbtn').classList.remove('hide');
  document.getElementById('recoverbtn').classList.add('show');
}

});} catch (err) {
console.log('this doesn work');
document.getElementById('emailLabel').innerText='if you need to reset your password click here';
document.getElementById('recoverbtn').classList.remove('hide');
document.getElementById('recoverbtn').classList.add('show');
}}






}
