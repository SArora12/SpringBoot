import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  user=false;
  constructor(private authService:AuthService, private product: ProductService,private router: Router){}
  

  notes:any
  
  ngOnInit(): void {
    if(localStorage.getItem('logged')=='false'){

      this.router.navigate(['']);

    }
    this.product.getNotes(localStorage.getItem("userEmail")).
      subscribe((result) => {

        this.notes= result
        

      })

  }

  delete(id:number){
    this.product.deleteNotes(id).subscribe((result)=>{
      this.notes=result;
      location.reload();
    })
  }
  logout()
  {
    localStorage.setItem("logged","false")
    this.user=false;
    this.authService.logOut()
    this.router.navigate(['/login']);
  }

}
