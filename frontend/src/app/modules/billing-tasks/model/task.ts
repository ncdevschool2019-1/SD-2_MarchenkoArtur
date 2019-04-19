import {Priority} from "./priority";

export class Task{
  id:number;
  ticket_code: string;
  description: string;
  created_date:string;
  due_data:string;
  estimation: string;
  user_id: string;
  status_id: string;
  priority: Priority;

  static cloneTask(task: Task):Task{
    const clonedTask: Task = new Task();
    clonedTask.id=task.id;
    clonedTask.ticket_code=task.ticket_code;
    clonedTask.description=task.description;
    clonedTask.created_date=task.created_date;
    clonedTask.due_data=task.due_data;
    clonedTask.estimation=task.estimation;
    clonedTask.user_id=task.user_id;
    clonedTask.status_id=task.status_id;
    return clonedTask;
  }


}
