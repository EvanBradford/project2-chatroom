import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'; 


import { BnNgIdleService } from 'bn-ng-idle';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FrameComponent } from './frame/frame.component';
import { MainChatComponent } from './frame/main-chat/main-chat.component';
import { UserInfoComponent } from './frame/user-info/user-info.component';
import { GuestListComponent } from './frame/guest-list/guest-list.component';
import { PrivateMessageComponent } from './frame/private-message/private-message.component';
import { ChatbarComponent } from './frame/main-chat/chatbar/chatbar.component';
import { ChatDetailComponent } from './frame/private-message/chat-detail/chat-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    FrameComponent,
    MainChatComponent,
    UserInfoComponent,
    GuestListComponent,
    PrivateMessageComponent,
    ChatbarComponent,
    ChatDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

  ],
  providers: [BnNgIdleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
