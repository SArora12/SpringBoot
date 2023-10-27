import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private userName:string='';
  constructor() { }
  setUsername(username:string){
    localStorage.setItem('username',username)
  }

  getUsername():string{
    const fetchedUsername=localStorage.getItem('username');
    return fetchedUsername!==null?fetchedUsername:'';
  }
  setUseremail(userEmail:string){
    localStorage.setItem('userEmail',userEmail)
  }

  getUseremail():string{
    const fetchedUseremail=localStorage.getItem('userEmail');
    return fetchedUseremail!==null?fetchedUseremail:'';
  }
}
