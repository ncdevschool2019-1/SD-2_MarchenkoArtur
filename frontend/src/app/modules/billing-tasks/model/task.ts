export class Task{
  id:number;
  ticket_code: string;
  description: string;
  priority_id:number;
  created_data:string;
  due_data:string;
  estimation: number;
  user_id:number;
  status_id: number;

  static cloneTask(task: Task):Task{
    const clonedTask: Task = new Task();
    clonedTask.id=task.id;
    clonedTask.ticket_code=task.ticket_code;
    clonedTask.description=task.description;
    clonedTask.priority_id=task.priority_id;
    clonedTask.created_data=task.created_data;
    clonedTask.due_data=task.due_data;
    clonedTask.estimation=task.estimation;
    clonedTask.user_id=task.user_id;
    clonedTask.status_id=task.status_id;
    return clonedTask;
  }


}
