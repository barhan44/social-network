import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SignUpForm } from '../types';
import { Profile } from '../../profile/model/profile.class';

@Injectable()
export class SignUpService {
  constructor(private http: HttpClient) {}

  signUp(form: SignUpForm): Observable<Profile> {
    return this.http.post<Profile>('/api/profile/create', form);
  }
}
