import { Component, OnInit, Input } from '@angular/core';
import { LogginService } from '../../services/loggin.service';
import { User } from '../../models/User';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

  constructor(private loginService: LogginService) { }
 user: User;

result: any;
  @Input()
  username: string;

  @Input()
  password: string;

  login () {
    console.log("username", this.username);
    console.log("password", this.password);
    this.loginService.login(this.username, this.password).subscribe((res)=>{
      this.result = res;
    //  let user = JSON.parse(res);
    console.log(res);    });
  }
  ngOnInit() {
  }

}
