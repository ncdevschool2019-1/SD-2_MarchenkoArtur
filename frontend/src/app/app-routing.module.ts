import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BillingTasksComponent} from "./modules/billing-tasks/components/billing-tasks/billing-tasks.component";
import { AutorisationComponent} from "./modules/autorisation/components/autorisation/autorisation.component";
import {AddTaskComponent} from "./modules/table-components/components/add-task/add-task.component";

const routes: Routes = [
  { path: '', redirectTo:'/autorisation',pathMatch:'full'},
  { path: 'tasks', component: BillingTasksComponent },
  { path: 'autorisation', component: AutorisationComponent },
  { path: 'add-task', component: AddTaskComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
