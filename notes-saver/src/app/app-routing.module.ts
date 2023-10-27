import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { AddNoteComponent } from './add-note/add-note.component';

const routes: Routes = [
  {
  component:LoginComponent,
  path:'login'
  },
  {
    component: RegistrationComponent,
    path: 'registration'
  },
  {
    component:LoginComponent,
    path:''
    },
  {
    component:HomeComponent,
    path:'home'
    },
    {
      component:AddNoteComponent,
      path:'addNote'
      }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
