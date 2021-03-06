import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';
import { FormsModule }   from '@angular/forms';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {Ng4LoadingSpinnerModule} from "ng4-loading-spinner";
import { AutorisationComponent } from './modules/autorisation/components/autorisation/autorisation.component';
import { BillingTasksComponent } from './modules/billing-tasks/components/billing-tasks/billing-tasks.component';
import { AddProjectComponent } from './modules/table-components/components/add-project/add-project.component';
import { AddTaskComponent } from './modules/table-components/components/add-task/add-task.component';
import { AddUserComponent } from './modules/table-components/components/add-user/add-user.component';
import { AppRoutingModule } from './/app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialog, MatDialogModule} from "@angular/material";


@NgModule({
  declarations: [
    AppComponent,
    AutorisationComponent,
    BillingTasksComponent,
    AddProjectComponent,
    AddTaskComponent,
    AddUserComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    Ng4LoadingSpinnerModule.forRoot(),
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    AppRoutingModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[AddTaskComponent]
})
export class AppModule { }
