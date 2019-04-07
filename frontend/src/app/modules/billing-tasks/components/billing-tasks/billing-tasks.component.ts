import { Component, OnInit } from '@angular/core';
import {Task} from "../../model/task";
import {TasksService} from "../../../../services/tasks.service";
import {Subscription} from "rxjs/internal/Subscription";

@Component({
  selector: 'app-billing-tasks',
  templateUrl: './billing-tasks.component.html',
  styleUrls: ['./billing-tasks.component.css']
})
export class BillingTasksComponent implements OnInit {
  tasks:Task[];

  constructor(private taskservice: TasksService) { }

  ngOnInit() {
    this.getTasks();
  }

  getTasks(){
  this.taskservice.getTasks().subscribe(tasks=>this.tasks=tasks);
  }
}
