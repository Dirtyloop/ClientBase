import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Client } from './client';
import { ClientService } from './client.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public clients: Client[] = [];
  public showClient!: Client;

  constructor(private clientService: ClientService){}

  ngOnInit() {
    this.getClients();
  }

  public getClients(): void {
    this.clientService.getClients().subscribe(
      (response: Client[]) => {
        console.log(response);
        this.clients = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      
      }
    );
  }

  public onOpenModal(client: Client, mode: string): void {
  
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'showDetails') {
      this.showClient = client;
      console.log("showDetails " + this.showClient.name);
      button.setAttribute('data-target', '#showDetailsModal');
    }
  
    container!.appendChild(button);
    button.click();
  }
}
