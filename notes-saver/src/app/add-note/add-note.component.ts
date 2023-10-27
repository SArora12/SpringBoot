import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../product.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-add-note',
  templateUrl: './add-note.component.html',
  styleUrls: ['./add-note.component.css']
})
export class AddNoteComponent implements OnInit{
  ngOnInit(): void {
    if(localStorage.getItem('logged')=='false'){

      this.router.navigate(['']);

    }
  }
    
 Notes:FormGroup;
  
  error=false
  get content() { return this.Notes.get('content') }
  get email(){ return this.Notes.get('userEmail')}
  
  constructor(private formBuilder: FormBuilder,private product: ProductService, private routers: ActivatedRoute, private router: Router) {
    this.Notes= this.formBuilder.group({
      content: new FormControl('', Validators.required),
      email:new FormControl(localStorage.getItem("userEmail"),Validators.required)
  
      
    })
    
   }
  save() {
    
      if (this.Notes.valid) {
        
        this.product.postnote(this.Notes.value).subscribe((result) => {
         
          
          this.router.navigate(['home']);

        })

      
    
    }
    else{
      this.error=true
    }
    

    
  }

  }


