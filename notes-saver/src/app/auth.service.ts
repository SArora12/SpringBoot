import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  loggedIn:boolean=false;
  login(){
    this.loggedIn=true;
  }
  logOut(){
    this.loggedIn=false;
  }
  IsAuthenticated(){
    return this.loggedIn;
  }
}
