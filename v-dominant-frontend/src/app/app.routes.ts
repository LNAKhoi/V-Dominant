import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadComponent: () =>
      import('./features/homepage/main-page/main-page.component').then(m => m.MainPageComponent),
  },
  {
    path: 'login',
    loadComponent: () =>
      import('./features/auth/login.component/login.component').then(m => m.LoginComponent),
  }
];
