import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';

import { Profile } from '../../store/model';
import { RootState } from '../../store/state/root.state';

@Component({
  selector: 'app-profile-main',
  templateUrl: './profile-main.component.html',
  styleUrls: ['./profile-main.component.scss'],
})
export class ProfileMainComponent implements OnInit {
  profile$: Observable<Profile>;

  constructor(private store: Store<RootState>) {}

  ngOnInit(): void {
    this.profile$ = this.store.select('profile');
  }
}
