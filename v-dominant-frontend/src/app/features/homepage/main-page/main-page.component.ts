import { Component } from '@angular/core';
import {HeaderComponent} from '../header/header.component';
import {HeroComponent} from '../hero/hero.component';

@Component({
  selector: 'main-page',
  imports: [
    HeaderComponent,
    HeroComponent
  ],
  templateUrl: './main-page.component.html',
  styleUrl: './main-page.component.scss',
})
export class MainPageComponent {

}
