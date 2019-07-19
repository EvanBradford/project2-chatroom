import { Component, OnInit } from '@angular/core';
// import { users } from 'src/app/models/User';
import { LoginService } from '../../service/login.service';


@Component({
  selector: 'app-guest-list',
  templateUrl: './guest-list.component.html',
  styleUrls: ['./guest-list.component.css']
})
export class GuestListComponent implements OnInit {

  constructor(private loginService: LoginService) { }

  user: any;

  getUsers() {
    this.loginService.getAll().subscribe((res) => {
      this.user = res;
      console.log(this.user);
    });
  }
  ngOnInit() {
    this.getUsers();
  }

}
