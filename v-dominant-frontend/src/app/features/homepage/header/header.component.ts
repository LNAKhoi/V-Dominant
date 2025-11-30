import { Component } from '@angular/core';
import {Router, RouterLink} from '@angular/router';

@Component({
  selector: 'homepage-header',
  imports: [
  ],
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss',
})
export class HeaderComponent {
  constructor(private router:Router) {
  }
  navigateToLogin() {
    this.router.navigate(['login']);
  }
}
