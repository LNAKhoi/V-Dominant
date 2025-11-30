import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatIconModule} from '@angular/material/icon';
import {provideHttpClient} from '@angular/common/http';
import {HomepageRoutingModule} from './homepage-routing.module';

@NgModule({
  imports: [CommonModule, HomepageRoutingModule, MatIconModule],
  providers: [provideHttpClient()]
})
export class HomepageModule { }
