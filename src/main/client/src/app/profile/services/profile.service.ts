import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Profile } from '../model/profile.class';

@Injectable({
  providedIn: 'root',
})
export class ProfileService {
  constructor(private http: HttpClient) {}

  public load(): Observable<Profile> {
    return this.http.get<Profile>('/api/profile/test-user');
  }
}
