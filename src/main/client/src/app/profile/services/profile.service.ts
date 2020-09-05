import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Store } from '@ngrx/store';
import { RootState } from '../../store/state/root.state';
import { Profile } from '../../store/model';
import { LoadProfile } from '../../store/actions/profile.actions';

@Injectable({
  providedIn: 'root',
})
export class ProfileService {
  constructor(private http: HttpClient, private store: Store<RootState>) {}

  public loadProfile(): void {
    this.http
      .get<Profile>('/api/profile/test-user')
      .subscribe((profile: Profile) =>
        this.store.dispatch(new LoadProfile(profile))
      );
  }
}
