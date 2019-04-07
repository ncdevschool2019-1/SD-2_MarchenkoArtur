export class Task{
  id:number;
  ticket_code: string;
  description: string;
  priority:string;
  created_data:string;
  due_data:string;
  estimation: number;
  user:string;
  status: string;

  static cloneTask(task: Task):Task{
    const clonedTask: Task = new Task();
    clonedTask.id=task.id;
    clonedTask.ticket_code=task.ticket_code;
    clonedTask.description=task.description;
    clonedTask.priority=task.priority;
    clonedTask.created_data=task.created_data;
    clonedTask.due_data=task.due_data;
    clonedTask.estimation=task.estimation;
    clonedTask.user=task.user;
    clonedTask.status=task.status;
    return clonedTask;
  }


}
