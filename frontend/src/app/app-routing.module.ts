import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BillingTasksComponent} from "./modules/billing-tasks/components/billing-tasks/billing-tasks.component";
import {AutorisationComponent} from "./modules/autorisation/components/autorisation/autorisation.component";

const routes: Routes = [
  { path: 'tasks', component: BillingTasksComponent },
  { path: 'autorisation', component: AutorisationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
