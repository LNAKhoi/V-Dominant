import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {UserDto} from "../../models/UserDto";
import {AuthenticationService} from "../../services/authentication.service";

@Component({
    selector: 'app-register',
    templateUrl: './register.component.html',
    styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

    registerForm: FormGroup;

    ngOnInit(): void {
    }

    constructor(private fb: FormBuilder, private router: Router, private authService: AuthenticationService) {
        this.registerForm = this.fb.group({
            firstName: this.fb.control<string>('', {validators: [Validators.required]}),
            lastName: this.fb.control<string>('', {validators: [Validators.required]}),
            email: this.fb.control<string>('', {validators: [Validators.required, Validators.email]}),
            password: this.fb.control<string>('', {validators: [Validators.required, Validators.minLength(6)]}),
        });
    }

    onSubmit() {
        const data = this.getUserInputData();
        this.authService.register(data).subscribe(
            () => {
                this.navigateToDashBoard();
            },
            (error) => {
                // Do sth
            })
    }

    getUserInputData(): UserDto {
        return {
            firstName: this.registerForm.value.firstName,
            lastName:
            this.registerForm.value.lastName,
            email:
            this.registerForm.value.email,
            password:
            this.registerForm.value.password
        }
    }

    navigateToDashBoard() {
        this.router.navigate(['/dashboard']);
    }
}
