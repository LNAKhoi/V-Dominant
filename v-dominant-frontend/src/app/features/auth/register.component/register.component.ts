import {Component} from '@angular/core';
import {FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators} from "@angular/forms";
import {Router} from '@angular/router';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatFormField, MatInput, MatLabel} from '@angular/material/input';
import {UserDto} from '../../../shared/models/UserDto';
import {email} from '@angular/forms/signals';

@Component({
  selector: 'app-register.component',
  imports: [
    FormsModule,
    ReactiveFormsModule,
    MatIconModule,     // <-- add this
    MatButtonModule,
    MatFormField,
    MatLabel,
    MatInput,
    // <-- add this if you want mat-icon-button
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss',
})
export class RegisterComponent {
  registerForm: FormGroup;

  constructor(private fb: FormBuilder, private router: Router) {
    this.registerForm = this.fb.group({
        email: ['', [Validators.required, Validators.email]],
        password: ['', [Validators.required, Validators.minLength(6)]],
        firstName: ['', Validators.required],
        lastName: ['', Validators.required],
        address: ['', Validators.required],
      }
    )
  }

  getSubmitFormData(): UserDto {
    return {
      email: this.registerForm.value.email,
      password: this.registerForm.value.password,
      firstName: this.registerForm.value.firstName,
      lastName: this.registerForm.value.lastName,
      address: this.registerForm.value.address
    }
  }

  onSubmit() {

  }

  protected goBack() {
    this.router.navigate(['login']);
  }
}
