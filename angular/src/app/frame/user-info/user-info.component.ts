import { Component, OnInit } from '@angular/core';
 import { User } from 'src/app/models/User';
import { LoginService } from '../../service/login.service';

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
  constructor(private loginService: LoginService) { }

  ngOnInit() {
  }

  showRegister(){
    document.getElementById('userInfo').classList.remove('show');
    document.getElementById('userInfo').classList.add('hide');
    document.getElementById('registerInfo').classList.remove('hide');
    document.getElementById('registerInfo').classList.add('show');
  }

  login() {
   console.log(this.user.email);
   console.log(this.user.password);

this.loginService.login(this.user.email, this.user.password).subscribe((res)=>{
console.log(res);
let response = res;
console.log(response.aeid);
const LoggedInUser = JSON.stringify(res);
sessionStorage.setItem('LoggedInUser', LoggedInUser);
sessionStorage.setItem('LoggedInId', response.aeid);

//LoggedInUser = JSON.parse(LoggedInUser);
if (LoggedInUser!='null') {
 console.log('hey you are finally logged in');
} else {
  console.log('no no no you are logged out');
}
});

}

register() {
  console.log(this.user.email);
  console.log(this.user.password);

this.loginService.register(this.user.email, this.user.password).subscribe((res)=>{
console.log(res);
const LoggedInUser = JSON.stringify(res);
sessionStorage.setItem('LoggedInUser', LoggedInUser);

});}





}
