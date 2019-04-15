import { Component, OnInit } from '@angular/core';
import {Task} from "../../model/task";
import {TasksService} from "../../../../services/tasks.service";
import {Subscription} from "rxjs/internal/Subscription";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {User} from "../../../autorisation/model/user";

@Component({
  selector: 'app-billing-tasks',
  templateUrl: './billing-tasks.component.html',
  styleUrls: ['./billing-tasks.component.css']
})
export class BillingTasksComponent implements OnInit {
  tasks:Task[];

  public _newTask: Task=new Task();
  public _newUser: User=new User();

  private subscriptions: Subscription[]=[];


  constructor(private taskservice: TasksService) {

  }

  ngOnInit() {
    this.getTasks();
  }

  getTasks(){
  this.taskservice.getTasks().subscribe(tasks=>this.tasks=tasks);
  }

  addBillingTask():void{
  this.subscriptions.push(this.taskservice.saveTasks(this._newTask).subscribe(()=>{

  }))
  }

  public deleteTask(taskID: string): void {
    this.subscriptions.push(this.taskservice.deleteTask(taskID).subscribe(() => {
    }));
  }
}
