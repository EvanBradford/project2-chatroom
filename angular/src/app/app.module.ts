import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FrameComponent } from './frame/frame.component';
import { MainChatComponent } from './frame/main-chat/main-chat.component';
import { UserInfoComponent } from './frame/user-info/user-info.component';
import { FriendsComponent } from './frame/friends/friends.component';
import { PrivateMessageComponent } from './frame/private-message/private-message.component';
import { ChatDetailComponent } from './frame/main-chat/chat-detail/chat-detail.component';
import { ConfigComponent } from './config/config/config.component';

@NgModule({
  declarations: [
    AppComponent,
    FrameComponent,
    MainChatComponent,
    UserInfoComponent,
    FriendsComponent,
    PrivateMessageComponent,
    ChatDetailComponent,
    ConfigComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
