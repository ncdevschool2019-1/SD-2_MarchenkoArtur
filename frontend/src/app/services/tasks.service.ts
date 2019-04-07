import { Injectable } from '@angular/core';

import {Task} from "../modules/billing-tasks/model/task";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";

@Injectable({
  providedIn: 'root'
})
export class TasksService {

  constructor(private http:HttpClient) { }

  getTasks(): Observable<Task[]>{
  return this.http.get<Task[]>('http://localhost:8081/api/task/');
  }
}
