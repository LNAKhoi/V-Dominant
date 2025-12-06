import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {UserDto} from "../models/UserDto";

@Injectable({
    providedIn: 'root'
})
export class AuthenticationService {
    private readonly authenticationApi = 'http://localhost:8080/api/users';

    constructor(private httpClient: HttpClient) {
    }

    register(userInput: UserDto) {
        return this.httpClient.post(`${this.authenticationApi}/register`, {userInput});
    }
}
