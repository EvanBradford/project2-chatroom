import { Component, OnInit, Input } from '@angular/core';
import { LogginService } from '../../services/loggin.service';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

  constructor(private loginService: LogginService) { }

result: any;
  @Input()
  username:string;

  @Input()
  password: string;

  login (){
    console.log("username ", this.username);
    console.log("password", this.password);
    this.loginService.login(this.username, this.password).subscribe((res)=>{
      this.result = res;
    })
  }
  ngOnInit() {
  }

}
