import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  Login = new FormGroup({
    email: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required)
  })
  error = false

  get email() { return this.Login.get('email') }
  get password() { return this.Login.get('password') }

  constructor(private product: ProductService, private username:UserService,private router: Router) { }

  ngOnInit(): void {
  }
  r: any

  login() {

    this.product.getlogin(this.Login.value.email).subscribe((res: any) => {
      
      this.r = res
      if (res == null) {

        this.error = true
      }
      else {

        if (this.r.password == this.Login.value.password) {
          localStorage.setItem("logged", "true")

          this.router.navigate(['home']);
          this.username.setUsername(this.r.firstname);
          this.username.setUseremail(this.r.email);
          
        }
        else {
          this.error = true
        }
      }



    })



  }



}



