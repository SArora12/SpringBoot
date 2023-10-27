import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  url="http://localhost:9092/"

  constructor(private http:HttpClient) { }

  getlogin(email: any)
  {
    return this.http.get(this.url+"users/"+email);

  }

  postregister(data: any)
  {
    return this.http.post(this.url+"users",data);

  }
  postnote(data: any)
  {
    return this.http.post(this.url+"notes",data);

  }
  getNotes(id:any)
  {
    return this.http.get(this.url+"notes/"+id);

  }
  deleteNotes(id:any){
    return this.http.delete(this.url+"deletenotes/"+id);
  }
  
  
  
}




